use sqldb;

-- 구매테이블(buytbl)에 구매액(price * amount)이 1500원 이상인 고객은 'VIP', 
-- 1000원 이상인 고객은 'GOLD', 500원 이상인 고객은 'SILVER', 500원 미만인 고객은 'CUSTOMER',
-- 가입은 되었지만 구매 실적이 없는 고객은 'GHOST'

select * from buytbl;
select * from usertbl;


select u.userid, u.name, sum(b.price * b.amount) as '총 구매액'
from usertbl u
left join buytbl b on b.userid = u.userid
group by u.userid
order by sum(b.price * b.amount) desc;

select u.userid, u.name, sum(b.price * b.amount) as '총 구매액'
from buytbl b
right join usertbl u on b.userid = u.userid
group by u.userid
order by sum(b.price * b.amount) desc;


DROP PROCEDURE IF EXISTS UserBuyProductList;
DELIMITER $$
CREATE PROCEDURE UserBuyProductList()
begin
    -- 변수 선언
    -- 수행문
    SELECT u.userid, u.name, sum(price*amount) as 총구매액,
        CASE    WHEN (sum(price*amount) >=1500) THEN 'VIP'
				WHEN (sum(price*amount) >=1000) THEN 'GOLD'
			    WHEN (sum(price*amount) >=500) THEN 'SILVER'
                WHEN (sum(price*amount) < 500) THEN 'CUSTOMER'
                ELSE 'Ghost'
        END        AS 'GRADE'
    FROM usertbl u
    LEFT join buytbl b
       on b.userid = u.userid
GROUP BY u.userid, u.name
ORDER BY sum(price*amount) desc;
    -- 출력문
end $$
DELIMITER ;
CALL UserBuyProductList();

/*
1부터 100까지의 값을 모두 더하는 기능을 프로시저로 구현 : whileProc()
while() 반복문 사용
*/

drop procedure if exists whileProc;
delimiter $$
create procedure whileProc()
begin
	declare i int;
    declare total int;
    
    set i = 1;
    set total = 0;
    
    while(i <= 100) do
		set total = total + i;
        set i = i + 1;
        
	END WHILE;
	select total as '1-100 누적총합';
end $$
DELIMITER ;
call whileproc();

# 라벨로 이동, 계속 반복문 진행
DROP PROCEDURE IF EXISTS whileProc1;
DELIMITER $$
CREATE PROCEDURE whileProc1()
begin
    -- 변수 선언
      DECLARE i int;
      DECLARE total int;
    -- 값 할당 (변수 초기화)
    SET i = 1;
    SET total = 0;
    -- 수행문
  myWhile: WHILE (i <= 100) DO      -- WHILE에 label지정
      IF(i%7 = 0) THEN
        SET i = i + 1;
        ITERATE myWhile;    -- 지정한 label문으로 가서 계속 진행
      END IF;
       SET total = total + i;
       IF(total > 1000) THEN
           LEAVE myWhile;       -- 지정한 label문을 떠나라! while 종료
       END IF;
       SET i = i + 1;
    END WHILE;
    -- 출력문
    SELECT total as '1-100 누적총합';
end $$
DELIMITER ;
CALL whileProc1();

/*
 1부터 1000까지의 숫자 중 3의 배수 또는 8의 배수만 더하는 프로시저
*/

delimiter $$
create procedure addnum()
begin
    -- 변수 선언
	DECLARE i int;
	DECLARE total int;
    -- 값 할당 (변수 초기화)
    SET i = 1;
    SET total = 0;
    
myWhile: WHILE (i <= 1000) DO      -- WHILE에 label지정
      IF(i % 3 = 0) THEN
        SET total = total + i;
      END IF;
      IF(i % 8 = 0) THEN
        SET total = total + i;
      END IF;
      IF(i % 24 = 0) THEN
        SET total = total - i;
      END IF;
       SET i = i + 1;
    END WHILE;

select total;
end $$
delimiter ;
call addnum();
drop procedure addnum;

-- 오류처리 : MySQL은 오류가 발생하면 직접 오류를 처리한다
-- DECLARE 액션 HANDLER FOR (오류조건) (처리할 문장);

delimiter $$
create procedure errortest()
begin
	-- 변수 선언 --
    DECLARE CONTINUE HANDLER FOR 1146 SELECT '존재하지 않는 테이블입니다.' AS '메시지';
    -- 수행문 --
    SELECT * FROM noTable;

end $$
delimiter ;
call errortest();

delimiter $$
create procedure errorproc2()
begin
	-- 변수 선언 --
    DECLARE CONTINUE HANDLER FOR sqlexception
    -- 수행문 --
    show errors;
    select '오류가 발생했습니다. 작업은 취소되었습니다.' as 메시지;
    rollback;
	end;
    insert into usertbl values('LSG', '이덕구', 1988, '서울', NULL, NULL, 180, current_date());
end $$
delimiter ;
call errorproc2();

select * from usertbl where userid = 'LSG';
-- USER TABLE의 모든 사용자의 정보를 출력하는 프로시저

-- 수정 삭제 가능한 프로시저 만들기
-- ALTER PROCEDURE
-- DROP PROCEDURE
-- 매개변수 사용
/*
입력매개변수 : IN 입력매개변수명 데이터형식
CALL 프로시저이름(전달값);

출력매개변수 : OUT 출력매개변수명 데이터형식   SELECT ... INTO 출력매개변수
			CALL 프로시저이름(@변수명)
            SELECT @변수명;
*/

delimiter $$
create procedure userproc5(IN username varchar(50))
begin
	SELECT * FROM usertbl WHERE name = username;
    
end $$
delimiter ;
call userproc5('조관우');
call userproc5('바비킴');

-- usertbl에서 출생년도(birthYear)가 1970년에 태어나고 키가 170 이상인 회원들의 리스트

drop procedure if exists userproc6;
delimiter $$
create procedure userproc6(IN birthyear int, height int)
begin
	select * from usertbl u where u.birthYear = birthyear and u.height >= height;
end $$
delimiter ;
call userproc6(1973, 170);

#############################################
drop procedure if exists txtinout;
delimiter $$
create procedure txtinout(IN txtvalue char(10), out outvalue int)
begin
	insert into testtbl values(null, txtvalue);
    select max(id) into outvalue from testtbl;

end $$
delimiter ;
call txtinout('qwer', @outvalue);

-------- testtbl

create table testtbl(
	id int auto_increment primary key,
	txt char(10) not null
);

select concat('ID => ', @outvalue);
select * from testtbl;

-- 테이블 이름을 넘겨주면 테이블이 자동 생성되는 프로시저
-- 동적 SQL을 PREPARE ,  EXECUTE 

drop procedure if exists nametableproc;
delimiter $$
create procedure nametableproc(IN tblname varchar(50))
begin
	set @sqlquery = concat('SELECT * FROM ', tblname);
    prepare myquery from @sqlquery;
    execute myquery;
    deallocate prepare myquery;   -- 메모리 해제

end $$
delimiter ;
call nametableproc('buytbl');
call nametableproc('usertbl');

