use bookmarketdb;
CREATE TABLE people (

id INT AUTO_INCREMENT PRIMARY KEY,  # id는 자동으로 증가, PK
name VARCHAR(64),  # 이름, 길이는 64자까지
age INT unsigned  # 나이, 양의 정수

);
drop table people;
select * from people;

CREATE TABLE card_company(

id INT AUTO_INCREMENT PRIMARY KEY,  # id - 고유식별자
name VARCHAR(64),  # 회사명 64자까지
amount_of_payment INT,  # 총 운용금액
payment_location VARCHAR(64),  # 위치
paymentdate DATETIME,  # 승인일자
people_id INT   # 회원아이디
);

INSERT INTO people VALUES(1,'김사원',24);
# 입력 데이터 순서랑 타입 확인 -> 직접 지정해줘도 됨
# insert into people(name, id, age) values('김사원', 1, 24);

INSERT INTO people (NAME,age) VALUES('구대리',28);

INSERT INTO people (NAME,age) VALUES('허차장',42);

INSERT INTO people (NAME,age) VALUES('차부장',45);

INSERT INTO people (NAME,age) VALUES('홍임원',54);
# auto_increment인 요소는 데이터 넣을 때 null로 입력
insert into people values(null, 'test', 55);
delete from people where id = 3;
select * from people;
truncate table people;  # 구조는 그대로 두고 자료만 날림
commit;

desc card_company;
insert into card_company VALUES(1,'NH',30000,'배달서비스','2019-11-09 23:02',1);
select count(id) from card_company;  # * 대신 PK를 세어줘야 null 포함으로 셀 수 있다
insert into card_company (name,amount_of_payment,payment_location,paymentdate,people_id) VALUES('shinhan',7700,'편의점','2019-11-09 10:10',1);
insert into card_company (name,amount_of_payment,payment_location,paymentdate,people_id) VALUES('KB',4500,'편의점','2019-11-09 15:21',1);
insert into card_company (name,amount_of_payment,payment_location,paymentdate,people_id) VALUES('KB',8550,'당구장','2019-11-09 19:35',1);
insert into card_company (name,amount_of_payment,payment_location,paymentdate,people_id) VALUES('shinhan',330000,'명품신발','2019-11-09 05:00',2);
insert into card_company (name,amount_of_payment,payment_location,paymentdate,people_id) VALUES('shinhan',4500000,'명품옷','2019-11-09 07:00',2);
insert into card_company (name,amount_of_payment,payment_location,paymentdate,people_id) VALUES('NH',400000,'돈 인출','2019-11-09 11:00',3);
insert into card_company (name,amount_of_payment,payment_location,paymentdate,people_id) VALUES('NH',1300000,'사성냉장고','2019-11-09 15:00',3);
insert into card_company (name,amount_of_payment,payment_location,paymentdate,people_id) VALUES('NH',10000000,'골프','2019-11-09 17:00',4);
insert into card_company (name,amount_of_payment,payment_location,paymentdate,people_id) VALUES('NH',15000000,'유흥','2019-11-09 03:00',4);
insert into card_company (name,amount_of_payment,payment_location,paymentdate,people_id) VALUES('NH',500,'문방구','2019-11-09 04:00',6);
commit;


#########################################################################################################
-- JOIN 연산
-- 1. CROSS JOIN
-- 2. INNER JOIN
-- 3. OUTER JOIN
-- 4. SELF JOIN

-- people과 card_company를 JOIN 하여 자신의 카드 정보만 출력될 수 있도록 쿼리문 작성

select *
from people p
left join card_company c on p.id = c.people_id;

### Self Join ###
-- 별도 구문이 아니라 자기 자신끼리 조인한다는 의미



#########################################################################################################
-- 1. 사람 정보 테이블의 구조와 데이터를 확인
-- 2. 카드 지출내역 테이블의 구조와 데이터를 확인


CREATE table ugaga_tribes (
id INT AUTO_INCREMENT PRIMARY KEY ,
name VARCHAR(64),
classes_id INT
);

insert into ugaga_tribes VALUES(1,'족장_우가콜라',null);
insert into ugaga_tribes (name,classes_id) VALUES('부족장_우가펩시',1);
insert into ugaga_tribes (name,classes_id) VALUES('부하1_우가팔일오',2);
insert into ugaga_tribes (name,classes_id) VALUES('부하2_우가우간다',3);
insert into ugaga_tribes (name,classes_id) VALUES('부하3_우가막내',4);

commit;

-- 부족의 조직관계 즉 나의 직속상사 정보를 출력하세요

select ut_a.id, ut_a.name as 부하, ut_b.id as '나의 직속상사 아이디', ut_b.name as 나의직속상사
from ugaga_tribes ut_a
join ugaga_tribes ut_b
on ut_a.classes_id = ut_b.id;

-- 상관이 없는 부족원의 정보까지 모두 출력

select ut_a.id, ut_a.name as 부하, ut_b.id as '나의 직속상사 아이디', ut_b.name as 나의직속상사
from ugaga_tribes ut_a
left join ugaga_tribes ut_b
on ut_a.classes_id = ut_b.id;

