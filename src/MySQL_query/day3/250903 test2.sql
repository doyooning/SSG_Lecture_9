#1.
select department_name, count(employee_id)
from employees e
left join departments d on e.department_id = d.department_id
group by department_name;

#2.
select department_name, concat(first_name, ' ', last_name, ' ', salary) as 'name_salary'
from employees e 
left join departments d on e.department_id = d.department_id
where department_name like 'IT'
order by salary asc;

#3.
select employee_id, first_name, job_title, department_name
from employees e
left join departments d on e.department_id = d.department_id
left join locations l on d.location_id = l.location_id
left join jobs j on j.job_id = e.job_id
where l.city like 'Seattle';

#4.
select job_title, sum(salary)
from employees e 
left join jobs j on j.job_id = e.job_id
group by job_title
having job_title not like 'Representative' and sum(salary) > 30000;

#5.
select department_name, count(employee_id)
from employees e
left join departments d on e.department_id = d.department_id
where hire_date < '2005-01-01'
group by department_name;

#6.
select d.department_id, d.department_name, count(employee_id), max_salary, min_salary, format((max_salary + min_salary) / 2, 0), sum(salary)
from employees e, departments d, jobs j
where e.department_id = d.department_id and j.job_id = e.job_id
group by department_id
having count(employee_id) >= 3;

#7.
select employee_id, first_name, last_name, hire_date
from employees e
where hire_date < (
	select hire_date
	from employees
	where hire_date between '2005-01-01' and '2005-12-31' and first_name like 'Lisa'
);



