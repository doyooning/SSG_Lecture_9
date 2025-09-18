use sqldb;

-- myVar1 변수에 10을 할당
set @myVar1 = 10;
select @myVar1;

delimiter $$
create procedure userProc()
begin
	select * from usertbl;
end $$
delimiter ;

call userProc();

-- 1. 조건 (if ... else 조건에 따라 분기
drop procedure if exists ifProc;

delimiter @@
create procedure ifProc()
begin
	declare var1 int; -- 정수형 var1 변수 선언
    set var1 = 100;   -- var1에 100 값 할당
    
    if (var1 = 100) then
		select 'var1 : 100';
    else 
		select 'var1 : 100이 아님';
    end if;
end @@
delimiter ;
call ifProc();