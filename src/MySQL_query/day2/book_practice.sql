use bookmarketdb;
select phone, name, address
from customer
where name = '김연아';

-- Book테이블에서 도서가격이 만원이상인 도서의 책제목과 출판사명을 출력하세요
desc book;
select bookname, publisher
from book
where price >= 10000;

-- 모든 도서의 이름 과 가격 검색
select bookname, price from book;
select price, bookname from book;
select bookid, bookname, publisher, price from book;

select *
from book
where price < 20000;

select * from book
where price >= 10000 and price <= 20000;

select *
from book
where publisher in('굿스포츠', '대한미디어');

select publisher
from book
where bookname like '축구의 역사';

select publisher
from book
where bookname like '%축구%'; -- 축구를 포함하는 문자열이 들어간

select *
from book
where bookname like '_구%';

select *
from book
where bookname like '%축구%' and price >= 20000;

select *
from book
where publisher in('굿스포츠', '대한미디어');

-- order by 절 기본 : ASC (오름차순), DESC (내림차순)
select *
from book
order by price desc;

-- 텍스트는 오름차순 정렬시 알파벳이 우선
select *
from book
order by bookname asc;

select *
from book
order by price asc, bookname asc;

select *
from book
order by price desc, publisher asc;