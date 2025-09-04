-- 집합연산
-- SQL문의 결과는 테이블로 나타냄
-- 테이블은 튜플 집합
-- 집합연산(합집합 INION, 교집합, 차집합)
-- 1. 합집합 UNION
-- 대한민국에 거주하는 고객의 정보를 조회
select *
from customer
where address like '대한민국%';

-- 도서를 주문한 고객들의 명단 집합
select name
from customer
where custid in (select custid from orders);

-- 대한민국에 거주하는 고객의 이름과 도서를 주문한 고객의 이름을 모두 조회
select name
from customer
where address like '대한민국%'

union all

select name
from customer
where custid in (select custid from orders);

-- Oracle에서는 MINUS, INTERSECT 연산자가 있으나 MySQL에서는 지원 안 됨
-- 대한민국에 거주하는 고객의 이름에서 도서를 주문한 고객의 이름을 빼고 조회
select name
from customer
where address like '대한민국%' and name not in(

select name
from customer
where custid in (select custid from orders));

-- 도서를 주문하지 않은 고객의 이름을 조회
select name
from customer
where name not in(
	select name
	from customer
	where custid in (select custid from orders)
);

#########
-- exists(조건에 맞는 튜플이 존재하면 결과에 포함시킨다)
-- 질의문의 어떤 행이 조건에 만족한다면 참이다

select name, address
from customer cs
where exists(
	select * 
    from orders o
    where o.custid = cs.custid
);

#1-5  박지성이 구매한 도서의 출판사 수
select count(distinct publisher)
from customer c
join orders o on c.custid = o.custid
join book b on o.bookid = b.bookid
where c.name like '박지성';

select count(distinct(
	select b.publisher
    from book b
    where b.bookid = o.bookid
)) as '출판사 수'
from orders o
where o.custid = (
	select custid
    from customer
    where name = '박지성'
);

#1.6 박지성이 구매한 도서의 이름, 가격, 정가와 판매 가격의 차이
select b.bookname, b.price, abs(b.price - o.saleprice) as 가격차
from customer c
join orders o on c.custid = o.custid
join book b on o.bookid = b.bookid
where c.name like '박지성';

#1.7  박지성이 구매하지 않은 도서의 이름
select b.bookname
from book b
where b.bookid not in(
	select o.bookid
    from orders o
    join customer c on o.custid = c.custid
    where c.name = '박지성'
);

#2.8  주문하지 않은 고객의 이름(부속질의사용)
select name
from customer
where name not in(
	select name
	from customer
	where custid in (select custid from orders)
);

select c.name
from customer c
left join orders o on o.custid = c.custid
where o.orderid is null;

#2.9  주문 금액의 총액과 주문의 평균 금액
select sum(o.saleprice), avg(o.saleprice)
from orders o;

#2.10 고객의 이름과 고객별 구매액
select name, sum(o.saleprice) as 구매액
from customer c
join orders o on c.custid = o.custid
group by name
order by 총구매액 desc;

#2.11 고객의 이름과 고객이 구매한 도서 목록 => group_concat()
select c.name, group_concat(b.bookname order by b.bookname separator ',') books
from customer c
join orders o on c.custid = o.custid
join book b on o.bookid = b.bookid
group by c.name
order by c.name;

select distinct c.name 이름 , b.bookname 책목록
from customer c
join orders o on c.custid = o.custid
join book b on o.bookid = b.bookid
group by c.name, b.bookname
order by c.name;

select c.name, b.bookname
from customer c
join book b on exists(
	select 1 from orders o
    where o.custid = c.custid and o.bookid = b.bookid
) order by c.name, b.bookname;

#2.12 도서의 가격(Book 테이블)과 판매가격(Orders 테이블)의 차이가 가장 많은 주문
select c.name, b.bookname, b.price - o.saleprice as 가격차, b.price, o.*
from orders o
join book b on o.bookid = b.bookid
join customer c on c.custid = o.custid
order by (b.price - o.saleprice) desc limit 1;

#2.13 도서의 판매액 평균보다 자신의 구매액 평균이 더 높은 고객의 이름
select c.name
from customer c
join orders o on c.custid = o.custid
group by c.custid
having avg(o.saleprice) > (
	select avg(saleprice)
	from orders
);







