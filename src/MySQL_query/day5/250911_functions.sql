use sqldb;

-- 1. 데이터형식과 형변환 함수  cast(표현식 as 데이터형식[길이]), convert(표현식, 데이터형식[길이])

-- sqldb.buytbl에서 평균 구매 개수를 구하는 쿼리를 작성
desc buytbl;
select * from buytbl;

select avg(amount) as '평균 구매 개수'
from buytbl;  -- 2.91... '개수' 니까 양의정수로 반올림 필요

# cast로 반올림한 정수를 표현
select cast(avg(amount) as signed integer) as '평균 구매 개수' 
from buytbl;

# convert로 표현
select convert(avg(amount), signed integer) as '평균 구매 개수'
from buytbl;

-- 다양한 구분자를 이용하여 날짜 형식으로 변경 !! 중요 !!
-- 오늘 날짜를 시스템에서 받아서 date 타입으로 변경 후 출력
select cast(sysdate() as date) as '오늘날짜';  -- sysdate() = now()

-- buytbl에서 단가와 수량을 곱한 값을 실제 입금액으로 표시하는 쿼리 작성

select num, 
	concat(cast(price as char(10)), ' X ', cast(amount as char(4)), ' = ') as '단가 x 수량',
    (price * amount) as '구매액'
from buytbl;

select '100' + '200';  -- 문자와 문자를 더하는데 캐스팅을 안해줘도 정수로 변환되어 연산
select concat('100', '200');  -- 문자와 문자를 연결하는 연산
select concat(100, '200');  -- CONCAT() : 숫자 => 문자로 변환해서 연결처리
select 1> '2mega';  -- 1 > 2 비교, 답은 0 (거짓)
select 3> '2mega';  -- 3 > 2 비교, 답은 1 (참)
select 0> 'mega2';  -- 0 = 0 비교, 답은 1 (참) # 'mega2'는 맨 앞에 숫자가 없으므로 기본값 0으로 치환

-- MySQL 내장함수
--   제어흐름 함수
--   문자열 함수
--   수학 함수
--   날짜/시간 함수
--   전체 텍스트 검색 함수
--   형 변환 함수
--   보안/압축 함수
--   공간분석 함수
--   정보 함수

# 1. 제어흐름 함수 : 프로그램의 흐름 제어
/*
	IF(수식, 참, 거짓) : 수식이 참 또는 거짓인지 결과에 따라 2중 분기
	IFNULL(수식1, 수식2) : 수식1이 NULL이 아니면 수식1 반환, 수식1이 NULL이면 수식2 반환
    NULLIF(수식1, 수식2) : 수식1과 수식2가 같으면 NULL 반환, 다르면 수식1 반환
    CASE ~ WHEN ~ ELSE ~ END : 내장함수는 아님, 연산자로 분류됨, 다중분기 처리
*/
select if(100>200, '참', '거짓');
select ifnull(100, 'not null'), ifnull(null, '널널');
select nullif(100, 100), nullif(100, 200);

select case 100
	when 1 then '숫자 1'
    when 5 then '숫자 5'
    when 10 then '숫자 10'
    when 100 then '숫자 100'
    else '값이 없다'
    end as 'case 연습';

# 2. 문자열 함수 : 문자열을 조작, 활용도 높음
/*
	ASCII(아스키코드), CHAR(숫자)
	BIT_LENGTH(문자열), CHAR_LENGTH(문자열), LENGTH(문자열)
    할당된 BIT 크기 또는 문자 크기를 반환
    LENGTH(문자열) => 할당된 BYTE수를 반환
    MySQL은 기본문자셋으로 UTF-8 코드 사용, 때문에 영문 = 1바이트, 한굴 = 3바이트
    
    CONCAT(), CONCAT_WS() => 문자열 연결함수
    
    FORMAT(숫자, 소수점자릿수) => 숫자를 소수점 아래 자릿수까지 표현, 1000단위로 콤마를 표시
    
    BIN(숫자) => 2진수, HEX() => 16진수, OCT() => 8진수
    
    INSERT(기준 문자열, 위치, 길이, 삽입할 문자열)
    기준 문자열의 위치부터 길이만큼을 지우고 삽입할 문자열을 끼워 넣는다.
    
    LEFT(문자열, 길이) RIGHT(문자열, 길이) => 왼쪽 또는 오른쪽
    
    LPAD(문자열, 길이, 채울 문자열), RPAD(문자열, 길이, 채울 문자열)
*/

select ascii('A'), char(75);
select char(65);

SELECT BIT_length('abc') as bitlength, char_length('abc') as charlength,
length('abc') as length;

SELECT BIT_length('가나다') as bitlength, char_length('가나다') as charlength,
length('가나다') as length;

SELECT CONCAT_WS('/', '2025', '09', '11'); -- 구분자(delimiter)

SELECT FORMAT(123456.123456, 4); -- 123,456.1235

SELECT BIN(10), HEX(10), OCT(10);

SELECT INSERT('abcdefghi', 3, 4, '#####'),  -- ab#####ghi
INSERT('abcdefghi', 3, 2, '@@@@');  -- ab@@@@efghi

SELECT LEFT('abcdefghi', 3), RIGHT('abcdefghi', 3);

SELECT UPPER('abc'), LOWER('ABC');

SELECT LPAD('THIS', 10, '***'), RPAD('THIS', 10, '##');
SELECT RPAD('THIS     ', 20, '*');
SELECT char_length('THIS     ');  -- 9(공백 5)
SELECT char_length(TRIM('  THIS     '));  -- 4

-- 문자열 반복
SELECT REPEAT('-', 30);

-- 문자열에서 원래 문자열을 찾아서 바꿀 문자열로 치환
SELECT REPLACE('This is MySQL', 'This', 'That');

-- 문자열의 순서를 거꾸로 만드는 기능
SELECT TRIM(REVERSE('  My SQL  '));  -- TRIM은 양 끝 공백만 없애준다

-- 시작위치부터 지정한 길이만큼 문자열을 반환
# SUBSTRING(), SUBSTR(), MID() => 동일 함수
SELECT SUBSTRING('This is MySQL', 3, 2); -- 시작위치 : 1부터.

-- SUBSTRING_INDEX(문자열, 구분자, 횟수)
SELECT SUBSTRING_INDEX('cafe.naver.com', '.', 2); -- 2번째 구분자부터 버린다 -> cafe.naver
SELECT SUBSTRING_INDEX('cafe.naver.com', '.', -2); -- 음수이면 구분자를 오른쪽부터 카운트한다

# 3. 수학함수
/*
	올림 : CEILING(숫자), 내림 : FLOOR(숫자), 반올림 : ROUND(숫자)
    MOD(숫자1, 숫자2) : 숫자1을 숫자2로 나누어 나머지값 반환
    POW(숫자1, 숫자2) : 숫자1을 숫자2만큼 거듭제곱
*/
SELECT CEILING(5.67); -- 6
SELECT CEILING(-5.67); -- -5
SELECT FLOOR(4.7); -- 4
SELECT FLOOR(-4.7); -- -5
SELECT ROUND(4.3); -- 4
SELECT ROUND(4.5); -- 5
SELECT ROUND(-4.5); -- -5
SELECT ROUND(-4.2); -- -4

-- MOD 계산 - 3가지 모두 동일
SELECT MOD(157, 10), 157 % 10, 157 MOD 10;

SELECT POW(10, 2);


