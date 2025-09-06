DROP DATABASE IF EXISTS sqldb; -- 만약 sqldb가 존재하면 우선 삭제한다.
CREATE DATABASE sqldb;

USE bookmarketdb;
CREATE TABLE usertbl -- 회원 테이블
( userID  	CHAR(8) PRIMARY KEY, -- 사용자 아이디(PK)
  name    	VARCHAR(10) NOT NULL, -- 이름
  birthYear   INT NOT NULL,  -- 출생년도
  addr	  	CHAR(2) NOT NULL, -- 지역(경기,서울,경남 식으로 2글자만입력)
  mobile1	CHAR(3), -- 휴대폰의 국번(011, 016, 017, 018, 019, 010 등)
  mobile2	CHAR(8), -- 휴대폰의 나머지 전화번호(하이픈제외)
  height    SMALLINT,  -- 키
  mDate    	DATE  -- 회원 가입일
);

CREATE TABLE buytbl -- 회원 구매 테이블(Buy Table의 약자)
(  num 		INT AUTO_INCREMENT PRIMARY KEY, -- 순번(PK)
   userID  	CHAR(8) NOT NULL, -- 아이디(FK)
   prodName 	CHAR(6) NOT NULL, --  물품명
   groupName 	CHAR(4)  , -- 분류
   price     	INT  NOT NULL, -- 단가
   amount    	SMALLINT  NOT NULL, -- 수량
   FOREIGN KEY (userID) REFERENCES usertbl(userID)
);

INSERT INTO usertbl VALUES('LSG', '이승기', 1987, '서울', '011', '1111111', 182, '2008-8-8');
INSERT INTO usertbl VALUES('KBS', '김범수', 1979, '경남', '011', '2222222', 173, '2012-4-4');
INSERT INTO usertbl VALUES('KKH', '김경호', 1971, '전남', '019', '3333333', 177, '2007-7-7');
INSERT INTO usertbl VALUES('JYP', '조용필', 1950, '경기', '011', '4444444', 166, '2009-4-4');
INSERT INTO usertbl VALUES('SSK', '성시경', 1979, '서울', NULL  , NULL      , 186, '2013-12-12');
INSERT INTO usertbl VALUES('LJB', '임재범', 1963, '서울', '016', '6666666', 182, '2009-9-9');
INSERT INTO usertbl VALUES('YJS', '윤종신', 1969, '경남', NULL  , NULL      , 170, '2005-5-5');
INSERT INTO usertbl VALUES('EJW', '은지원', 1972, '경북', '011', '8888888', 174, '2014-3-3');
INSERT INTO usertbl VALUES('JKW', '조관우', 1965, '경기', '018', '9999999', 172, '2010-10-10');
INSERT INTO usertbl VALUES('BBK', '바비킴', 1973, '서울', '010', '0000000', 176, '2013-5-5');
INSERT INTO buytbl VALUES(NULL, 'KBS', '운동화', NULL   , 30,   2);
INSERT INTO buytbl VALUES(NULL, 'KBS', '노트북', '전자', 1000, 1);
INSERT INTO buytbl VALUES(NULL, 'JYP', '모니터', '전자', 200,  1);
INSERT INTO buytbl VALUES(NULL, 'BBK', '모니터', '전자', 200,  5);
INSERT INTO buytbl VALUES(NULL, 'KBS', '청바지', '의류', 50,   3);
INSERT INTO buytbl VALUES(NULL, 'BBK', '메모리', '전자', 80,  10);
INSERT INTO buytbl VALUES(NULL, 'SSK', '책'    , '서적', 15,   5);
INSERT INTO buytbl VALUES(NULL, 'EJW', '책'    , '서적', 15,   2);
INSERT INTO buytbl VALUES(NULL, 'EJW', '청바지', '의류', 50,   1);
INSERT INTO buytbl VALUES(NULL, 'BBK', '운동화', NULL   , 30,   2);
INSERT INTO buytbl VALUES(NULL, 'EJW', '책'    , '서적', 15,   1);
INSERT INTO buytbl VALUES(NULL, 'BBK', '운동화', NULL   , 30,   2);

SELECT count(userID) FROM usertbl;
SELECT count(num) FROM buytbl;


drop table if exists buytbl;
drop table if exists usertbl;

CREATE TABLE usertbl -- 회원 테이블
( userID  	CHAR(8) NOT NULL, -- 사용자 아이디(PK)
  name    	VARCHAR(10) NOT NULL, -- 이름
  birthYear   INT NOT NULL,  -- 출생년도
  addr	  	CHAR(2) NOT NULL default '서울', -- 지역(경기,서울,경남 식으로 2글자만입력)
  mobile1	CHAR(3), -- 휴대폰의 국번(011, 016, 017, 018, 019, 010 등)
  mobile2	CHAR(8),   -- 휴대폰의 나머지 전화번호(하이픈제외)
  height   	SMALLINT,  -- 키
  mDate    	DATE , -- 회원 가입일
  CONSTRAINT PRIMARY KEY PK_usertbl_userID (userID)
);

alter table usertbl
	add constraint pk_usertbl_userID -- 제약조건을 추가
    primary key(userID); -- 기본키 제약조건 : userID

-- productTBL 설계
/* 만약 제품코드 AAA 2, BBB 1, CCC 2 -> 제품코드만으로는 PK 지정 불가
	1. 제품코드 + 제품 일련번호
    2. 인공키
*/

create table productTBL(
	p_code char(3) not null,
    p_id char(4) not null,
    p_date datetime not null,
    p_status char(10)
);

alter table productTBL
	add constraint PK_productTBL_p_code_p_id
		primary key (p_code, p_id);
        
select * from productTBL;

-- 시스템 카탈로그(메타데이터)
show index from productTBL;  # 두 열이 합쳐져서 하나의 기본키 제약 조건을 설정하고 있음

CREATE TABLE buytbl -- 회원 구매 테이블(Buy Table의 약자)
(  num 		INT AUTO_INCREMENT unique, -- 순번(PK) auto_increment는 pk 또는 unique로 설정해야 함
   userID  	CHAR(8) NOT NULL, -- 아이디(FK)
   prodName 	CHAR(6) NOT NULL, --  물품명
   groupName 	CHAR(4)  , -- 분류
   price     	INT  NOT NULL, -- 단가
   amount    	SMALLINT  NOT NULL, -- 수량
   constraint PK_buyTBL_num primary key(num),
   constraint FK_userTBL_buyTBL foreign key(userID) references userTBL(userID)
  );

alter table buytbl
	add constraint PK_buyTBL_num primary key(num);
    
alter table buytbl
	add constraint FK_userTBL_buyTBL foreign key(userID) references userTBL(userID) on update cascade;

show index from buytbl;

alter table buytbl
	drop foreign key FK_userTBL_buyTBL; -- 이름으로 외래키 제거

-- 외래키 옵션 중에 on delete cascade 또는 on update cascade
-- (기준 테이블의 데이터가 변경되었을 때 외래키 테이블도 자동으로 적용되도록 거는 옵션)
-- unique 제약조건 : 중복되지 않는 유일한 값  primary key => not null + unique // unique => null 허용
-- check 제약조건 : 입력되는 데이터를 점검하는 기능
	-- 입력데이터 제약 => 음수값 입력X, 출생년도 제한 2000년 생 이후
	## ex) birthYear int check(birthYear >= 1980 and birthYear <= 2020), ... 
    ## ex) constraint CK_name check(name is not null)
    
-- mobile1 속성에 check 011, 016, 017, 018, 019, 010만 입력되도록 제약 조건 추가

alter table usertbl
	add constraint ck_mobile1 check(mobile1 in ('011', '016', '017', '018', '019', '010'));
    
-- default 제약 조건 : 값을 입력하지 않아도 자동으로 입력되는 기본값을 정의하는 방법
-- ex) 출생년도를 입력하지 않으면 -1을 자동으로 입력
    
-- default 제약 조건 추가시 column으로 수정
alter table usertbl
	alter column birthyear set default -1;
    
alter table usertbl
	alter column addr set default '서울';
    
alter table usertbl
	alter column height set default 160;
    
-- null 값 허용
-- null 값은 '아무것도 없다' 공백(' ')이나 0이 아님 주의

create table test1(
	id int auto_increment primary key,
    name varchar(30) not null
);

create table test2(
	id int auto_increment primary key,
    test_id int,
    constraint FK_test2_test1_test_id foreign key (test_id) references test1(id)
);

-- test1의 id(PK) 삭제
alter table test1
	drop primary key;

-- 속성 (age) 추가
alter table test1
	add age int unsigned
			default 0
            not null;
desc test1;

show index from test1;

-- 속성(age) 삭제
alter table test1
	drop column age;

-- 속성의 이름 및 데이터 형식 변경
alter table test1
	change column name Uname varchar(50) not null;
