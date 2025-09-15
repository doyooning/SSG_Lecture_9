-- 회원 수정(비밀번호)를 수정할지 이메일을 수정할지
-- 연락처를 수정할지를 선택해서 다중분기로 처리하기
-- 1. 비번 수정 2. 이메일 수정 3. 연락처 수정

drop procedure if exists SP_MEMBER_UPDATE;
delimiter $$
CREATE PROCEDURE SP_MEMBER_UPDATE(IN num int,
                                     userid varchar(20),
                                     input varchar(20),
                                 OUT rtn_code int)
BEGIN
    CASE
        WHEN num = 1 THEN
        UPDATE TB_MEMBER SET m_pwd = input where m_userid = userid;

        WHEN num = 2 THEN
        UPDATE TB_MEMBER SET m_email = input where m_userid = userid;

        WHEN num = 3 THEN
        UPDATE TB_MEMBER SET m_hp = input where m_userid = userid;
    END CASE;

    IF userid NOT IN(SELECT m_userid FROM tb_member) THEN
        SET rtn_code = 0;
    ELSE
        SET rtn_code = 1;
    end if;

END $$
delimiter ;

CALL SP_MEMBER_UPDATE(1,'apples', '1234', @return);

############# 결과 확인 #############
select @`return`;

show create procedure SP_MEMBER_UPDATE;

select * from TB_MEMBER;
