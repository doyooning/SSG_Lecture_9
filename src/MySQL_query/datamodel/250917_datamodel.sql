#######################################################
# 정규화실습 
# 서유미
# 실습 DATABASE
# 작성일:2024-07-31
#######################################################

DROP DATABASE IF EXISTS 정규화;

CREATE DATABASE 정규화 DEFAULT CHARSET  utf8mb4 COLLATE  utf8mb4_general_ci;

USE 정규화;

drop table 동아리가입학생학과;
CREATE TABLE 동아리가입학생학과(
학번 varchar(20),
학생이름 varchar(30) not null, 
동아리가입일 date not null,
학과번호 CHAR(2),
학과명 varchar(30)
) DEFAULT CHARSET=utf8mb4;

alter table 동아리가입학생학과 drop column 동아리번호;
alter table 동아리가입학생학과 add column(동아리번호 CHAR(2) not null);
alter table 동아리 add primary key(동아리번호);
alter table 동아리가입학생학과 add primary key(동아리번호, 학번);

select * from 동아리가입학생학과;
 
insert into 동아리가입학생학과 values(231001,'문지영','2023-04-01','D1','화학공학과', 'c1');
insert into 동아리가입학생학과 values(231002,'배경민','2023-04-03','D4','경영학과', 'c1');
insert into 동아리가입학생학과 values(232001,'김명희','2023-03-22','D2','통계학과', 'c2');
insert into 동아리가입학생학과 values(232002,'천은정','2023-03-07','D2','통계학과', 'c3');
insert into 동아리가입학생학과 values(231002,'배경민','2023-04-02','D2','경영학과', 'c3');
insert into 동아리가입학생학과 values(231001,'문지영','2023-04-30','D1','화학공학과', 'c4');
insert into 동아리가입학생학과 values(233001,'이현경','2023-03-27','D3','역사학과', 'c4');

select * from 동아리가입학생학과;

create table 동아리(
동아리번호 CHAR(2),
동아리명 varchar(50) not null,
동아리창립일 date not null
);
 
insert into 동아리 values('c1','지구한바퀴여행','2000-02-01');
insert into 동아리 values('c2','클래식연주동아리','2010-06-05');
insert into 동아리 values('c3','워너비골퍼','2020-03-01');
insert into 동아리 values('c4','쉘위댄스','2021-07-01');

select * from 동아리;

########################################################
drop table dongari;
create table dongari(
dongari_id CHAR(2),
dongari_name varchar(50) not null,
dongari_since date not null
) DEFAULT CHARSET=utf8mb4;

drop table dongari_join;
create table dongari_join(
dongari_id CHAR(2),
student_id varchar(20),
dept_id CHAR(2),
dongari_join_date date not null
) DEFAULT CHARSET=utf8mb4;

drop table student;
create table student(
student_id varchar(20),
dept_id CHAR(2),
student_name varchar(30) not null
) DEFAULT CHARSET=utf8mb4;

drop table department;
create table department(
dept_id CHAR(2),
dept_name varchar(30)
) DEFAULT CHARSET=utf8mb4;

alter table 학생 drop column 동아리번호;

alter table 학과 add column(동아리번호 CHAR(2) not null);

alter table dongari add primary key(dongari_id);
alter table department add primary key(dept_id);
alter table student add primary key(student_id);

alter table dongari_join add constraint FK_dongari_TO_dongari_join_1 
foreign key (dongari_id) references dongari(dongari_id);

alter table dongari_join add constraint FK_student_TO_dongari_join_1 
foreign key (student_id) references student(student_id);

alter table student add constraint FK_department_TO_student_1 
foreign key (dept_id) references department(dept_id);

desc dongari_join;


#################### 데이터 입력 #####################
insert into dongari values('c1','지구한바퀴여행','2000-02-01');
insert into dongari values('c2','클래식연주동아리','2010-06-05');
insert into dongari values('c3','워너비골퍼','2020-03-01');
insert into dongari values('c4','쉘위댄스','2021-07-01');

insert into student values(231001, 'D1', '문지영');
insert into student values(231002, 'D4', '배경민');
insert into student values(232001, 'D2', '김명희');
insert into student values(232002, 'D2', '천은정');
insert into student values(233001, 'D3', '이현경');

insert into department values('D1', '화학공학과');
insert into department values('D2', '통계학과');
insert into department values('D3', '역사학과');
insert into department values('D4', '경영학과');

insert into dongari_join values('c1', 231001, 'D1', '2025-09-01');
insert into dongari_join values('c1', 231002, 'D4', '2025-09-03');
insert into dongari_join values('c2', 232001, 'D2', '2025-08-06');
insert into dongari_join values('c3', 232002, 'D2', '2025-08-01');
insert into dongari_join values('c4', 233001, 'D3', '2025-09-10');

select * from dongari;
select * from dongari_join;
select * from department;
select * from student;

################################################

-- 문제1) 동아리 'c1','지구한바퀴여행' 에 가입한 학생의 학번, 이름, 학과명을 출력하세요

select student_id, student_name, d.dept_name
from student s
join department d on s.dept_id = d.dept_id
where student_id in (
	select student_id
	from dongari_join
	where dongari_id = 'c1'
);

-- 문제2) '경영학과'에 다니고 있는 학생 명단을 출력하세요

select s.student_id, s.student_name, d.dept_name
from student s
join department d on s.dept_id = d.dept_id
where d.dept_name = '경영학과';

-- 문제3) 동아리 쉘위 댄스에 가입한 학생 중 화학공학과에 다니고 있는 학생의 (학번,  이름 , 동아리가입일)을 출력하세요

select s.student_id, s.student_name, d.dongari_join_date
from student s
join dongari_join d on s.student_id = d.student_id
where s.student_id in (
	select student_id
	from dongari_join
	where dongari_id = 'c4' and dept_id = 'D3'
);

