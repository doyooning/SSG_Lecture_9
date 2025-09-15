-- 회원 삭제(탈퇴)

drop procedure if exists SP_MEMBER_DELETE;
delimiter $$
CREATE PROCEDURE SP_MEMBER_DELETE(IN userid varchar(20),
                                  OUT rtn_code int)
BEGIN

    IF userid NOT IN(SELECT m_userid FROM tb_member) THEN
        SET rtn_code = 0;
    ELSE
        delete from tb_member
        where m_userid = userid;
        SET rtn_code = 1;
    end if;

END $$
delimiter ;

CALL SP_MEMBER_DELETE('dynii', @return);

############# 결과 확인 #############
select @`return`;

show create procedure SP_MEMBER_DELETE;

select * from TB_MEMBER;
