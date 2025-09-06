use hr;
desc employees;
select 
employee_id as '사원번호', 
concat(first_name, ' ', last_name) as Name,
salary as '급여', 
job_id as '업무', 
hire_date as '입사일', 
manager_id as '상사사원번호'
from employees;

select
concat(first_name, ' ', last_name) as Name,
job_id as Job,
salary as Salary,
12*salary + 100 as 'Increased Ann_Salary',
(salary+100)*12 as 'Increased Salary'
from employees;

select
concat(last_name, ': 1 Year Salary = $', salary*12) as '1 Year Salary'
from employees;

select
distinct department_id, job_id
from employees;

select concat(first_name, ' ', last_name) as Name, salary
from employees
where salary not between 7000 and 10000
order by salary asc; -- concat(first_name, ' ', last_name) desc; (급여 같을 경우 이름 내림차순)

select
last_name as 'e and o Name'
from employees
where last_name like '%e%' and last_name like '%o%';

select last_name as Name, employee_id, hire_date
from employees
where hire_date between str_to_date('1995/05/20', '%Y/%m/%d') and str_to_date('1996/06/20', '%Y/%m/%d')
order by hire_date asc;

select concat(first_name, ' ', last_name) as Name, salary, job_id, commission_pct
from employees
where commission_pct is not null
order by salary desc, commission_pct desc;



