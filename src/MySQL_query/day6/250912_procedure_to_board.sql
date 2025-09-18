use bookmarketdb;

/*
프로시저 작성
     글생성 기능
     createBoard()
     전체글 읽어오기 기능
     serachAll()
    글번호 지정한 글 하나 읽어오기 기능
    searchOne(int bno)
    글수정 기능
    updateBoard(int bno)
    글삭제 기능
    deleteBoard(int bno)
*/
select * from boardtable;

######################################## 글 생성 기능 ########################################
drop procedure if exists createboard;
delimiter $$
create procedure createboard(IN btitle varchar(100), bcontent text, bwriter varchar(50), OUT bno int)
begin
	insert into boardtable values(null, btitle, bcontent, bwriter, now());
    select max(bno) into bno from boardtable;
end $$
delimiter ;
call createboard('제목', '내용', '글쓴이', @bno);


######################################## 전체 글 읽어오기 기능 ########################################
drop procedure if exists searchAll;
delimiter $$
create procedure searchAll(IN boardtable varchar(30))
begin
    select * from boardtable;
end $$
delimiter ;
call searchAll('boardtable');

######################################## 글 번호 지정한 글 하나 읽어오기 기능 ########################################
drop procedure if exists searchOne;
delimiter $$
create procedure searchOne(IN num int)
begin
    select * from boardtable where bno = num;
end $$
delimiter ;
call searchOne(1);

######################################## 글 수정 기능 ########################################
drop procedure if exists updateBoard;
delimiter $$
create procedure updateBoard(IN num int, title varchar(100), content text)
begin
	update boardtable set btitle = title, bcontent = content, bdate = now() where bno = num;
end $$
delimiter ;
call updateBoard(1, '제에목', '내애용');

######################################## 글 삭제 기능 ########################################
drop procedure if exists deleteBoard;
delimiter $$
create procedure deleteBoard(IN bno int)
begin
	delete from boardtable where bno = bno;
end $$
delimiter ;
call deleteBoard(1);


