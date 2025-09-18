use sqldb;

/*
SQL도 일반적인 프로그래밍 언어처럼 변수 선언 및 사용 가능
	SET @변수이름 = 변수의 값;  -- 변수를 선언하고 값을 대입
    SELECT @변수이름;  -- 변수의 값을 출력
*/

-- 변수명 myVar1 선언, 5 할당, myVar1값 출력
set @myVar1 = 5;
select @myVar1; 

-- 변수명 myVar2 선언, 3 할당, myVar2값 출력
set @myVar2 = 3;
select @myVar2;

-- 변수명 myVar3 선언, 4.25 할당, myVar2값 출력
set @myVar3 = 4.25;
select @myVar3;

-- 변수명 myVar4 선언, 4.25 할당, myVar2값 출력
set @myVar4 = '가수 이름==> ';
select @myVar4;

-- 변수명 myVar2 와 myVar3 값을 더하여 결과값 출력
set @myVar5 = @myVar2 + @myVar3;
select @myVar5;

desc sqldb.usertbl;
select name from usertbl;
select @myVar4, name, height from usertbl where height > 180 limit 2;

-- LIMIT 옵션은 원칙적으로 변수 사용 불가. PREPARE와 EXECUTE 문을 활용해서 변수에 적용
-- PREPARE : 세팅(동적 쿼리)
-- EXECUTE : 실행
set @myVar1 = 3;
prepare myQuery
	from 'select name, height from usertbl order by height limit ?';
execute myQuery using @myVar1;





