-- 테이블 수정 (Foreign key)
-- countries FK
alter table countries add foreign key(region_id) references regions(region_id);

-- locations FK
alter table locations add foreign key(country_id) references countries(country_id);

-- departments FK
alter table departments add foreign key(location_id) references locations(location_id);
alter table departments add foreign key(manager_id) references employees(employee_id);

-- job_history FK
alter table job_history add foreign key(job_id) references jobs(job_id);
alter table job_history add foreign key(employee_id) references employees(employee_id);
alter table job_history add foreign key(department_id) references departments(department_id);

-- employees FK
alter table employees add foreign key(job_id) references jobs(job_id);
alter table employees add foreign key(department_id) references departments(department_id);
alter table employees add foreign key(manager_id) references employees(employee_id);

