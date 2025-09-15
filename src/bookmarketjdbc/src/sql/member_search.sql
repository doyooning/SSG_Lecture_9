-- 회원 ID로 정보를 출력하는 기능

drop procedure if exists SP_MEMBER_SEARCH;
delimiter $$
CREATE PROCEDURE SP_MEMBER_SEARCH(IN userid varchar(20),
                                  OUT rtn_code int)
BEGIN
    IF userid NOT IN(SELECT m_userid FROM tb_member) THEN
        SET rtn_code = 0;
    ELSE
        select *
        from tb_member
        where m_userid = userid;
        SET rtn_code = 1;
    end if;
END $$
delimiter ;

CALL SP_MEMBER_SEARCH('apple',@return);

############# 결과 확인 #############
select @`return`;

show create procedure SP_MEMBER_SEARCH;

select * from TB_MEMBER;
