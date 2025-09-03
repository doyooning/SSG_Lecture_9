-- 운영자가 필요로 하는 질의어를 작성
-- 도서판매총액, 일별 판매량, 누적 구매순위 -> 집계된 정보
-- 집계된 정보를 생성하기 위해서는 Group by 문을 사용
-- 구체적인 집계내용을 작성할 때 집계(aggregate)함수
-- 통계와 비슷한 의미이나, 데이터베이스에서는 집계를 사용
-- SQL에서는 집계함수를 제공
-- 집계함수란 테이블의 각 열에 대해 계산하는 함수

select * 
from customer 
where name = '김연아';

select sum(saleprice) as 총판매액
from orders;

select sum(saleprice) as '김연아 고객의 총 매출액'
from orders
where custid = 2;

select sum(saleprice) as 총판매액,
avg(saleprice) as 평균값,
min(saleprice) as 최저가,
max(saleprice) as 최대값
from orders;

select count(*) from orders; -- 전체 튜플의 수
select count(distinct publisher) from book; -- 전체 튜플의 수
-- ! count()는 null값을 제외하고 센다

-- Group by 절 => 속성값이 같은 값끼리 그룹을 만들 수 있음
-- having 절 => Group by 절의 결과에 나타나는 그룹을 제한하는 역할

select custid, name from customer;
select custid, count(*) as 도서수량, sum(saleprice) as 총구매액
from orders
group by custid;
select * from orders order by custid asc;

-- 3-20 가격이 8000원 이상인 도서를 구매한 고객에 대하여 고객별 주문도서의 총수량을 구하시오.
-- 단, 2권 이상 구매한 고객만 구한다
select custid, count(*) as 도서총수량
from orders
where saleprice >= 8000
group by custid
having count(*) >= 2; 

select bookid, sum(saleprice)
from orders
group by custid; -- group by 문을 사용하여 튜플(행) 그룹으로 묶으면 
-- select절에는 group by 절에서 사용한 속성과 집계함수만 출력 가능


select * from book;
select * from customer;
select * from orders;

-- 1.
select bookname from book
where bookid = 1;

select bookname from book
where price >= 20000;

select sum(saleprice) from orders
where custid = 1;

select count(orderid) 
from orders
where custid = 1;

-- 2.
select count(bookid)
from book;

select count(distinct publisher)
from book;

select name, address
from customer;

select orderid
from orders
where orderdate between str_to_date('2024/07/04', "%Y/%m/%d") and str_to_date('2024/07/07', "%Y/%m/%d");

select orderid as 주문번호
from orders
where orderdate not between str_to_date('2024/07/04', "%Y/%m/%d") and str_to_date('2024/07/07', "%Y/%m/%d");

select name, address
from customer
where name like '김%';
-- group by name
-- having name like '김%';

select name, address
from customer
where name like '김%' and name like '%아';
-- group by name
-- having name like '김%' and name like '%아';
