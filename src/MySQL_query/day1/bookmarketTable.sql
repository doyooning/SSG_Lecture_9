-- Book 테이블 생성
create table book(
	bookid integer primary key, -- 기본키
    bookname varchar(40),
    publisher varchar(40),
    price int
);

create table customer(
	custid int primary key, -- 기본키
    name varchar(40),
    address varchar(50),
    phone varchar(20)
);

create table orders(
	orderid int primary key,
    custid int,
    bookid int,
    saleprice int,
    orderdate date,
    foreign key (custid) references customer(custid),
    foreign key (bookid) references book(bookid)
);

-- Book 테이블 데이터 입력
insert into book values(1, '축구의 역사','굿스포츠',7000);
insert into book values(2, '축구 아는 여자','나무수',13000);
insert into book values(3, '축구의 이해','대한미디어',22000);
insert into book values(4, '골프 바이블','대한미디어',35000);
insert into book values(5, '피겨 교본','굿스포츠',8000);
insert into book values(6, '역도 단계별기술','굿스포츠',6000);
insert into book values(7, '야구의 추억','이상미디어',20000);
insert into book values(8, '야구를 부탁해','이상미디어',13000);
insert into book values(9, '올림픽 이야기','심성당',7500);
insert into book values(10, 'Olympic Champions','Person',13000);
select * from book;
commit;

-- Customer 테이블 데이터 입력
insert into customer values(1,'박지성','영국 맨체스터','000-5000-0001');
insert into customer values(2,'김연아','대한민국 서울','000-6000-0001');
insert into customer values(3,'장미란','대한민국 강원도','000-7000-0001');
insert into customer values(4,'추신수','미국 클리블랜드','000-8000-0001');
insert into customer values(5,'박세리','대한민국 대전',null);
select * from customer;
commit;

-- Orders 테이블 데이터 스크립트 실행
INSERT INTO Orders VALUES (1, 1, 1, 6000, STR_TO_DATE('2024-07-01','%Y-%m-%d'));
INSERT INTO Orders VALUES (2, 1, 3, 21000, STR_TO_DATE('2024-07-03','%Y-%m-%d'));
INSERT INTO Orders VALUES (3, 2, 5, 8000, STR_TO_DATE('2024-07-03','%Y-%m-%d'));
INSERT INTO Orders VALUES (4, 3, 6, 6000, STR_TO_DATE('2024-07-04','%Y-%m-%d'));
INSERT INTO Orders VALUES (5, 4, 7, 20000, STR_TO_DATE('2024-07-05','%Y-%m-%d'));
INSERT INTO Orders VALUES (6, 1, 2, 12000, STR_TO_DATE('2024-07-07','%Y-%m-%d'));
INSERT INTO Orders VALUES (7, 4, 8, 13000, STR_TO_DATE( '2024-07-07','%Y-%m-%d'));
INSERT INTO Orders VALUES (8, 3, 10, 12000, STR_TO_DATE('2024-07-08','%Y-%m-%d'));
INSERT INTO Orders VALUES (9, 2, 10, 7000, STR_TO_DATE('2024-07-09','%Y-%m-%d'));
INSERT INTO Orders VALUES (10, 3, 8, 13000, STR_TO_DATE('2024-07-10','%Y-%m-%d'));
select * from orders;
commit;


