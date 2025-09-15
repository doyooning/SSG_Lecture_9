-- 전체 회원들의 정보를 출력하는 기능

drop procedure if exists SP_MEMBER_LIST;
delimiter $$
CREATE PROCEDURE SP_MEMBER_LIST()
BEGIN
        select * from tb_member;

END $$
delimiter ;

CALL SP_MEMBER_LIST();

############# 결과 확인 #############



show create procedure SP_MEMBER_LIST;

select * from TB_MEMBER;
