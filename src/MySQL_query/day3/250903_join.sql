use bookmarketdb;
desc book;

select count(*) from customer, orders;
select count(*) from customer;
select count(*) from orders;

select * from customer where custid = 1;
select * from customer, orders;

######## EQ Join(동등 조인)
-- 고객과 고객의 주문에 관한 데이터를 모두 출력
select *
from customer, orders
where customer.custid = orders.custid
order by customer.custid asc;

-- 고객과 고객이 주문한 책에 관한 데이터를 모두 출력
select *
from customer, orders, book
where customer.custid = orders.custid and orders.bookid = book.bookid
order by customer.custid asc;

-- 고객의 이름과 고객이 주문한 도서의 판매가격을 검색
select name, saleprice
from customer, orders
where customer.custid = orders.custid;

-- 고객별로 주문한 모든 도서의 총판매액을 구하고, 고객별로 정렬 (grouping)
select name as 고객명, sum(saleprice) as '고객별 총구매액'
from customer, orders
where customer.custid = orders.custid
group by customer.name
order by customer.name asc;

select * from orders;

-- 고객의 이름과 고객이 주문한 도서의 이름을 조회
select name as 고객명, bookname as 도서명
from customer, orders, book
where customer.custid = orders.custid and orders.bookid = book.bookid
group by customer.name
order by customer.name asc;

-- 가격이 20000원인 도서를 주문한 고객의 이름과 도서의 이름을 조회
select c.name, b.bookname
from customer c, orders o, book b -- alias 가능
where c.custid = o.custid and o.bookid = b.bookid and b.price = 20000;

-- 외부 조인(outer join)
-- 도서를 구매하지 않은 고객을 포함하여 고객의 이름과 고객이 주문한 도서의 판매가격 조회
select * from customer;

select customer.name, orders.saleprice
from customer left outer join orders on customer.custid = orders.custid;

-- 고객 이름과 고객이 주문한 도서의 판매 가격을 구하는 것은 동등조인으로 조회 가능
-- 하지만 도서를 주문하지 않은 고객 '박세리'는 결과에 포함되지 않음
-- 만약 도서를 구매하지 않은 고객인 '박세리'까지 포함하여 고객 명단과 판매 가격을 구하려면 외부조인을 해야 함

-- 서브 쿼리(sub query)
-- ex) 가장 비싼 도서의 이름을 조회

select max(price)
from book;

select bookname
from book
where price = 35000;

select bookname
from book
where price = (select max(price) from book);

-- select문의 where절에 또는 다른 테이블의 결과를 이용하기 위해서
-- 다시 select문을 괄호로 묶어서 부속질의의 결과를 넘겨주는 방식
-- 중첩질의, nested query

-- 결과 테이블의 반환내용
-- 단일행 - 단일열(1x1), 다중행 - 단일열(nx1), 단일행 - 다중열(1xn), 다중행 - 다중열(nxn)

## 3-29 도서를 구매한 적이 있는 고객의 이름을 조회
select distinct custid
from orders;

select name
from customer
where custid in(1, 2, 3, 4);

select name
from customer
where custid in (select distinct custid
from orders);

select name
from customer
where custid in(
	select custid from orders
    where bookid in(
		select bookid from book where publisher = '대한미디어'
    )
);

## 상관부속질의

select publisher from book group by publisher;
select count(distinct publisher) from book;

select bookname, price from book where publisher = '굿스포츠';
select avg(price) from book where publisher = '굿스포츠';


## 튜플 변수 : 테이블 이름이 길거나, 같거나(두 번 이상 사용) 테이블 별칭을 사용하여 충돌을 피할 수 있음
select b1.bookname, b1.publicher
from book b1
where b1.price > (
	select avg(b2.price)
    from book b2
    where b2.publisher = b1.publisher
);

