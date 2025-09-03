use bookmarketdb;

select * from customer;
select * from orders;
select * from book;


### 1) 고객별 주문 상세정보를 출력하시오 (이름, 책, 가격, 날짜)
select c.name, b.bookname, b.price, o.orderdate
from customer c, orders o, book b
where c.custid = o.custid and o.bookid = b.bookid
order by c.custid;

select c.name, b.bookname, b.price, o.orderdate
from orders o
	join customer c on o.custid = c.custid
    join book b on o.bookid = b.bookid;

### 2) ‘대한미디어’ 출판 도서의 주문 내역을 출력하시오
select b.publisher, c.name, b.bookname, o.saleprice, o.orderdate
from customer c, book b, orders o
where c.custid = o.custid and o.bookid = b.bookid and b.publisher = '대한미디어';

select c.name, b.bookname, b.price, o.orderdate
from orders o
	join customer c on o.custid = c.custid
    join book b on o.bookid = b.bookid
where b.publisher = '대한미디어';

### 3) 고객별 총 주문 금액을 출력하고 가장 높은 많이 구매한 고객순으로 출력하시오
select c.name, sum(o.saleprice)
from customer c, orders o
where c.custid = o.custid
group by c.custid
order by sum(o.saleprice) desc;

### 4) 2권 이상 주문한 고객의  이름과 고객별 주문건수를 출력하시오
select c.name, count(o.orderid) 
from customer c, orders o
where c.custid = o.custid
group by c.custid
having count(o.orderid) >= 2;

### 5) 주문 내역이 없는 고객는 고객의 이름을 출력하시오.
select distinct c.name
from customer c, orders o
where c.custid not in (select distinct custid from orders);


### 6) 한 번도 주문되지 않은 도서의 아이디와 도서명을 출력하시오
select b.bookid, b.bookname
from book b
	left outer join orders o on b.bookid = o.bookid
where o.bookid is null;


### 7) 고객별 ‘첫 주문’(최소 주문일) 도서의 이름과  고객명, 주문일을 출력하시오.
select b.bookname, c.name, o.orderdate
from customer c, orders o, book b
where o.orderdate = (
	select min(o.orderdate) from orders o
)
group by c.custid;


select min(o.orderdate)
from orders o;

### 8) 고객별 ‘마지막 주문’(최대 주문일) 도서의 이름과 고객명, 주문일을 출력하시오.

### 9) 도서를 구매한 고객별  평균 판매가격(소수 2자리)을 출력하시오 (출력시 평균가격이 높은 순으로)

### 10) 출판사별 총 매출금액을 출력하시오. (출력시 총매출액이 높은 출판사순으로)

### 11) 가장 많이 팔린 도서(권수 기준)의 도서명과 건수를 출력하시오.(출력시 건수가 높은 순, 만약 건수가 같다면 도서명순으로)

### 12) 일자별 매출 합계를 출력하시오

### 13) ‘이상미디어’ 책을 구매한 고객과 도서명을 출력하시오

### 14) 정가 대비 할인(판매가 < 정가) 주문 내역과 할인율을 출력하시오 (출력시 소수첫째자리까지 표시)

### 15) 서로 다른 출판사 책을 2개 이상 구매한 고객의 이름과 구매건수를 출력하시오 (출력시 구매건수가 높은순으로 출력하되 건수가 같다면 고객명 순으로 오름차순)

### 16) 출판사별 정가 평균 vs 판매가 평균 을 출력하시오

### 17) ‘Pearson’ 출판 도서를 구매한 고객과 날짜를 출력하시오

### 18) 정가가 20,000원 이상인 도서의 구매 내역

### 19) 도서별 총 매출 TOP 3 의 도서명과 매출액을 출력하시오

### 20) 2024-07-04 ~ 2024-07-08 사이 주문한 고객명과 도서명, 판매가격, 주문일을 출력하시오

