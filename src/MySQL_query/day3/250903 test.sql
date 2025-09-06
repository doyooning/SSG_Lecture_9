use hr;

desc employees;
desc locations;
desc regions;
desc departments;

#1.
select concat(first_name, ' ', last_name) 
from employees;

#2.
select * from employees;

#3.
select city
from locations;

#4.
select *
from employees
where first_name like 'M%';

#5.
select first_name, salary
from employees
where first_name like '_a%'; 

#6.
select city
from locations
order by city;

#7.
select department_name
from departments
order by department_name desc;

#8.
select *
from employees
where salary >= 7000
order by salary;

#9.
select *
from employees
where commission_pct is null;

#10.
select employee_id, concat(first_name, ' ', last_name) as name, department_id
from employees
where hire_date like str_to_date('2007/06/21', '%Y/%m/%d');

#11.
select employee_id, hire_date
from employees
where hire_date between str_to_date('2006/01/01', '%Y/%m/%d') and str_to_date('2006/12/31', '%Y/%m/%d');

#12.
select concat(first_name, ' ', last_name)
from employees
where length(first_name) >= 5;

#13.
select department_id, count(employee_id)
from employees
group by department_id
order by department_id;

#14.
select job_id, avg((min_salary + max_salary) / 2) as 'average salary'
from jobs
group by job_id
order by job_id desc;

#15.
select *
from employees
where manager_id is not null;

#16.
select e.employee_id, concat(e.first_name, ' ', e.last_name), e.department_id, d.department_name
from employees e, departments d
where e.department_id = d.department_id;

#17.
select d.department_name, l.city
from departments d, locations l
where d.location_id = l.location_id;

#18.
select e.employee_id, d.department_id, j.job_title
from employees e, departments d, jobs j
where e.department_id = d.department_id and e.job_id = j.job_id;

#19.
select e.employee_id, d.department_id, j.job_title, l.city
from employees e, departments d, jobs j, locations l
where e.department_id = d.department_id and e.job_id = j.job_id and l.location_id = d.location_id;

#20.
select *
from employees e, departments d
where e.department_id = d.department_id and
d.department_id in (10, 20, 30);

#21.  
select avg((j.min_salary + j.max_salary) / 2) as 'average salary', d.department_name
from employees e, departments d, jobs j
where e.department_id = d.department_id and e.job_id = j.job_id
group by department_name
having count(employee_id) < 4;

#22.  
select d.department_id, d.department_name
from employees e, departments d
where e.department_id = d.department_id
group by department_id
having count(employee_id) < 6;

#23.
select sum(salary)
from employees e, departments d
where e.department_id = d.department_id and d.department_name like '%IT%';

#24.
select region_name, count(city)
from countries c
left join locations l on l.country_id = c.country_id
left join regions r on c.region_id = r.region_id
group by region_name;

#25.
select city, count(department_id)
from departments d
left join locations l on l.country_id = d.department_id
group by city;

#26.
select last_name, salary
from employees e
where e.department_id
and 12*salary >= 12000;

#27.
select last_name, salary
from departments d, employees e
where e.department_id = d.department_id and e.employee_id = 176;

#28.
select last_name, salary
from employees e
where salary not between 5000 and 12000;

#29.
select last_name, department_name
from employees e, departments d
where e.department_id = d.department_id and e.manager_id is null;

#30.
select concat(first_name, ' ', last_name) as 'full name', salary, commission_pct
from employees
where commission_pct is not null;





