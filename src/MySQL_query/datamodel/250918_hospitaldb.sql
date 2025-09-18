create database hospitaldb;

use hospitaldb;

############################# 테이블 생성 ###############################
drop table doctor;
CREATE TABLE doctor (
	doctor_id	int	NOT NULL auto_increment PRIMARY KEY,
	major	varchar(20) NOT NULL,
	doctor_name	varchar(20)	NOT NULL,
	gender	char(5) not null,
	phone	varchar(15),
	email	varchar(40),
	position varchar(20)
);

drop table patient;
CREATE TABLE patient (
	patient_id	int	NOT NULL auto_increment PRIMARY KEY,
	patient_name	varchar(20)	not null,
	id_card_num	char(14) not null,
	gender	char(5)	not null,
	address	varchar(100),
	phone	varchar(15),
	email	varchar(40),
	job	varchar(20),
	doctor_id	int	NOT NULL
);

drop table nurse;
CREATE TABLE nurse (
	nurse_id	int	NOT NULL auto_increment PRIMARY KEY,
	dept	varchar(15),
	nurse_name	varchar(20)	not NULL,
	gender	char(5)	not null,
	phone	varchar(15),
	email	varchar(40),
	position	varchar(20)
);

drop table treatment;
CREATE TABLE treatment (
	treat_id	varchar(12)	NOT NULL,
	doctor_id	int	NOT NULL,
	patient_id	int	NOT NULL,
	treat_detail	varchar(100),
	treat_date	date
);

drop table chart;
CREATE TABLE chart (
	chart_id	int	NOT NULL auto_increment PRIMARY KEY,
	treat_id	varchar(12)	NOT NULL,
	nurse_id	int,
	doctor_id	int,
	patient_id	int,
	comment	varchar(100)
);

############################# 키 설정 ###############################
-- ALTER TABLE doctor ADD CONSTRAINT PK_DOCTOR PRIMARY KEY (
-- 	doctor_id
-- );

-- ALTER TABLE patient ADD CONSTRAINT PK_PATIENT PRIMARY KEY (
-- 	patient_id
-- );

-- ALTER TABLE nurse ADD CONSTRAINT PK_NURSE PRIMARY KEY (
-- 	nurse_id
-- );

ALTER TABLE treatment ADD CONSTRAINT PK_TREATMENT PRIMARY KEY (
	treat_id
);

-- ALTER TABLE chart ADD CONSTRAINT PK_CHART PRIMARY KEY (
-- 	chart_id
-- );

ALTER TABLE treatment ADD CONSTRAINT FK_doctor_TO_treatment_1 FOREIGN KEY (
	doctor_id
)
REFERENCES doctor (
	doctor_id
);

ALTER TABLE treatment ADD CONSTRAINT FK_patient_TO_treatment_1 FOREIGN KEY (
	patient_id
)
REFERENCES patient (
	patient_id
);

ALTER TABLE chart ADD CONSTRAINT FK_treatment_TO_chart_1 FOREIGN KEY (
	treat_id
)
REFERENCES treatment (
	treat_id
);

ALTER TABLE chart ADD CONSTRAINT FK_nurse_TO_chart_1 FOREIGN KEY (
	nurse_id
)
REFERENCES nurse (
	nurse_id
);

select * from doctor;
select * from patient;
select * from nurse;
select * from treatment;
select * from chart;

############################# 데이터 입력 ###############################
-- Doctor (의사)
insert into doctor values
(null, '피부과', '홍길동', '남', '010-1111-2222', 'drhong@sample.com', '전문의'),
(null, '소아과', '신세계', '남', '010-2345-3743', 'shinsegae@sample.com', '전문의'),
(null, '정형외과', '김민수', '남', '010-1234-1234', 'kimms@sample.com', '전문의'),
(null, '소아과', '이세계', '여', '010-3645-0983', 'leesegae@sample.com', '전문의'),
(null, '정형외과', '고길동', '남', '010-4444-4444', 'gildong4@sample.com', '전문의'),
(null, '피부과', '허준', '남', '010-1048-3456', 'drhj@sample.com', '전문의'),
(null, '피부과', '이진수', '남', '010-1010-1010', 'binarylee@sample.com', '전문의'),
(null, '정형외과', '여성임', '여', '010-8457-1100', 'womanlim@sample.com', '전문의'),
(null, '소아과', '나암성', '남', '010-2222-3333', 'namsung@sample.com', '전문의'),
(null, '소아과', '신길동', '남', '010-4567-9786', 'shingildong@sample.com', '전문의');

-- Patient (환자)
INSERT INTO patient VALUES
(null, '김철수', '900101-1234567', '남', '서울시 강남구', '010-1111-1111', 'chulsoo@example.com', '회사원', 1),
(null, '고영희', '090202-4345678', '여', '서울시 서초구', '010-2222-2222', 'younghee@example.com', '학생', 2),
(null, '박민수', '920303-3456789', '남', '서울시 송파구', '010-3333-3333', 'minsu@example.com', '학생', 1),
(null, '최지현', '930404-4567890', '여', '서울시 마포구', '010-4444-4444', 'jihyun@example.com', '간호사', 3),
(null, '정호석', '940505-5678901', '남', '서울시 노원구', '010-5555-5555', 'hoseok@example.com', '개발자', 6),
(null, '한가을', '950606-6789012', '여', '서울시 은평구', '010-6666-6666', 'gaeul@example.com', '공무원', 4),
(null, '서준호', '960707-7890123', '남', '서울시 강서구', '010-7777-7777', 'junho@example.com', '디자이너', 5),
(null, '오다현', '970808-8901234', '여', '서울시 동작구', '010-8888-8888', 'dahyun@example.com', '간호조무사', 8),
(null, '유지민', '980909-9012345', '여', '서울시 종로구', '010-9999-9999', 'jimin@example.com', '마케터', 7),
(null, '강도현', '990101-0123456', '남', '서울시 성동구', '010-0000-0000', 'dohyun@example.com', '엔지니어', 9);

-- Nurse (간호사)
INSERT INTO nurse VALUES
(null, '진료접수', '박지수', '여', '010-1010-1010', 'jisoo@example.com', '주임간호사'),
(null, '환자관리', '김하늘', '남', '010-2020-2020', 'haneul@example.com', '수간호사'),
(null, '환자관리', '이서연', '여', '010-3030-3030', 'seoyeon@example.com', '일반간호사'),
(null, '진료접수', '정우성', '남', '010-4040-4040', 'woosung@example.com', '주임간호사'),
(null, '차트관리', '한소라', '여', '010-5050-5050', 'sora@example.com', '수간호사'),
(null, '차트관리', '김빛나리', '여', '010-6060-6060', 'bitnari@example.com', '일반간호사'),
(null, '진료접수', '강민아', '여', '010-7070-7070', 'mina@example.com', '일반간호사'),
(null, '차트관리', '오지훈', '남', '010-8080-8080', 'jihoon@example.com', '주임간호사'),
(null, '환자관리', '이수지', '여', '010-9090-9090', 'soojilee@example.com', '수간호사'),
(null, '차트관리', '김진', '남', '010-1212-1212', 'kimreal@example.com', '일반간호사');

-- Treatment (치료 기록)
INSERT INTO treatment VALUES
('231107-001', 1, 1, '여드름 상담 및 피지 압출', '2023-11-07'),
('231107-002', 2, 2, '소아과 예방접종', '2023-11-15'),
('231126-003', 1, 3, '화상 흉터 치료', '2023-11-26'),
('231205-004', 3, 4, '손목 염좌 물리 치료', '2023-12-05'),
('231211-005', 6, 5, '감기 증상 진료', '2023-12-11'),
('240116-006', 4, 6, '허리 통증 상담 및 도수치료', '2024-01-16'),
('240125-007', 5, 7, '발가락 사마귀 냉동치료', '2024-01-25'),
('240208-008', 8, 8, '비타민 주사 처방', '2024-02-08'),
('240214-009', 7, 9, '발목 염좌 물리 치료', '2024-02-14'),
('240304-010', 9, 10, '건강 검진 종합검사', '2024-03-04');

-- Chart (간호 차트 기록)
INSERT INTO chart VALUES
(null, '231107-001', 5, 1, 1, '10회 중 1회 진료, 재방문 예약'),
(null, '231107-002', 5, 2, 2, '예방접종 완료'),
(null, '231126-003', 5, 1, 3, '조치 완료, 재방문 예약'),
(null, '231205-004', 6, 3, 4, '초음파 치료 실시'),
(null, '231211-005', 6, 6, 5, '단순 감기, 약 처방'),
(null, '240116-006', 6, 4, 6, '도수 치료 1회 완료, 재방문 예약'),
(null, '240125-007', 8, 5, 7, '사마귀 제거 완료'),
(null, '240208-008', 8, 8, 8, '3회 중 1회 처방, 재방문 예약 미실시'),
(null, '240214-009', 10, 7, 9, '붓기 제거 및 물리 치료 실시'),
(null, '240304-010', 10, 9, 10, '종합검진 결과 정상');

############################# 쿼리문 작성 ###############################

-- 1.
update doctor
set major = '소아과'
where doctor_name = '홍길동';

select * from doctor;

-- 2.
# 비고란
alter table nurse add 비고 varchar(100) null;
select * from nurse;
update nurse set 비고 = concat('퇴사일자: ', date_format(current_date(), '%Y-%m-%d')) 
where nurse_name = '이수지';

# 이름바꾸기
update nurse
set nurse_name = concat(nurse_name, '(퇴사)')
where nurse_name = '이수지';

-- 3.
select *
from doctor
where major = '소아과';

-- 4.
select *
from patient
where doctor_id = (
	select doctor_id
    from doctor
    where doctor_name = '홍길동'
);

-- 5.
select *
from patient
where patient_id in (
	select patient_id
	from treatment
	where treat_date between '2023-11-01' and '2023-12-31'
)
order by patient_id;


