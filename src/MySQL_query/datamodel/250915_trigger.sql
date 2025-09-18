drop database if exists triggerdb;
create database if not exists triggerdb;

use triggerdb;
create table ordertbl(
	orderno int auto_increment primary key,
    userid varchar(5),
    prodname varchar(5),
    orderamount int
);

create table prodtbl(
    prodname varchar(5),
    amount int
);

create table delivertbl(
	deliverno int auto_increment primary key,
    userid varchar(5),
    prodname varchar(5),
    amount int unique
);

insert into prodtbl values('사과', 100);
insert into prodtbl values('배', 100);
insert into prodtbl values('귤', 100);

drop trigger if exists ordertrg;
delimiter $$
create trigger ordertrg
	after insert
    on ordertbl
    for each row
begin
update prodtbl set amount = amount - new.orderamount
where prodname = new.prodname;

end $$
delimiter ;

drop trigger if exists prodtrg;
delimiter $$
create trigger prodtrg
	after update
    on prodtbl
    for each row
begin
	declare orderamount int;
	set orderamount = old.amount - new.amount;
    insert into delivertbl(prodname, amount) 
    values(new.prodname, orderamount);

end $$
delimiter ;

