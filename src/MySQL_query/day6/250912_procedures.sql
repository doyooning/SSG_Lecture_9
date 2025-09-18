use employees;
-- employees 테이블에서 직원번호가 10001인 직원의 입사일이 5년이 넘엇는지 확인해봐
-- 프로시저명 ifProc2

delimiter $$
create procedure ifproc2()
begin
	declare hiredate date;
	declare curdate date;
    declare days int;
    
	select hire_date into hiredate
    from employees
    where emp_no = '10001';
    
    set curdate = current_date();
    set days = datediff(curdate, hiredate);-- 날짜의 차이, 일 단위
	
    if(days/365) >= 5 then
		select concat('입사한 지 ', days, ' 일이 지났습니다. 축하합니다.');
	else
    select concat('입사한 지 ', days, ' 일 밖에 안지났습니다. 5년이 지나면 특별 상여 제공');
    end if;
    
end $$
delimiter ;
call ifproc2();

/**
IF ELSE 이용하여 70점 이상은 SUCCESS, 70점 미만은 FAIL 출력하는 프로시저 ScoreTest 구현
*/

delimiter $$
create procedure scoretest()
begin
	declare score int;
    
    if(score >= 70) then
		select 'SUCCESS';
	else
		select 'FAIL';
	end if;

end $$
delimiter ;
call scoretest();
select * from employees;

drop procedure scoretest2;

delimiter $$
create procedure scoretest2()
begin
	declare score int;
    declare grade char(1);
    
    set score = 77;
    
    if (score >= 90) then
		set grade = 'A';
	elseif (score >= 80) then
		set grade = 'B';
	elseif (score >= 70) then
		set grade = 'C';
	elseif (score >= 60) then
		set grade = 'D';
	else
		set grade = 'E';
	end if;
    
    select concat('취득점수 ==> ', score) as 취득점수, concat('학점 ==> ', grade) as 학점;

end $$
delimiter ;
call scoretest2();

delimiter $$
create procedure scoretest3()
begin
	declare score int;
    declare grade char(1);
    
    set score = 77;
    
    case 
		when (score >= 90) then
			set grade = 'A';
		when (score >= 80) then
			set grade = 'B';
        when (score >= 70) then
			set grade = 'C';    
		when (score >= 60) then
			set grade = 'D';
		else
			set grade = 'E';
	end case;
	select concat('취득점수 ==> ', score) as 취득점수, concat('학점 ==> ', grade) as 학점;
end $$
delimiter ;
call scoretest3();



