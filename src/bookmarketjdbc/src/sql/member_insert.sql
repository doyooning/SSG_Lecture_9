use bookmarketdb;

create table code1(
    cid int,
    cname varchar(50)
);
desc code1;

insert into code1(cid, cname)
select ifnull(max(cid), 0) + 1 as cld2, 'TEST' as cname2
from code1;
select * from code1;

truncate code1;

--

DELIMITER $$
CREATE PROCEDURE P_INSERTCODES(IN cdata varchar(255),
                               IN ctname varchar(255),
                               OUT resultmsg varchar(255))
BEGIN
    SET @strsql = CONCAT(
                  'INSERT INTO ', 'ctname', '(cid, cname)',
                  'SELECT COALESE(MAX(cid), 0) + 1, ? FROM ', ctname
                  );
    -- 바인딩할 변수 설정
    SET @cdata = cdata;
    SET resultmsg = 'Insert Success!';

    PREPARE stmt FROM @strsql;
    EXECUTE stmt USING @cdata;

    DEALLOCATE PREPARE stmt;
    COMMIT;
END $$
DELIMITER ;

CALL P_INSERTCODES('프론트디자이너', 'CODE1', @resultmsg);
CALL P_INSERTCODES('백엔드개발자', 'CODE1', @result);
CALL P_INSERTCODES('프론트디자이너', 'CODE1', @resultmsg);
select * from code1;


###################

CREATE TABLE TB_MEMBER (
       m_seq INT AUTO_INCREMENT PRIMARY KEY,  -- 자동 증가 시퀀스
       m_userid VARCHAR(20) NOT NULL,
       m_pwd VARCHAR(20) NOT NULL,
       m_email VARCHAR(50) NULL,
       m_hp VARCHAR(20) NULL,
       m_registdate DATETIME DEFAULT NOW(),  -- 기본값: 현재 날짜와 시간
       m_point INT DEFAULT 0
);

-- 반드시  중복 사용자 예외 처리  (이미 존재하는 사용자 검사 시행)
-- 만약 성공적이면  숫자 200 리턴 , 이미 가입된 회원이라면 숫자 100 리턴

drop procedure SP_MEMBER_INSERT;
delimiter $$
CREATE PROCEDURE SP_MEMBER_INSERT(
    IN V_USERID VARCHAR(20),
    IN V_PWD VARCHAR(20),
    IN V_EMAIL VARCHAR(50),
    IN V_HP VARCHAR(20),
    OUT RTN_CODE INT
)
BEGIN
    if v_userid in (select m_userid from TB_MEMBER) then
	    set rtn_code = 100;
    else
        insert into TB_MEMBER(m_userid, m_pwd, m_email, m_hp) values(v_userid, v_pwd, v_email, v_hp);
        set rtn_code = 200;
    end if;
END $$
delimiter ;

CALL SP_MEMBER_INSERT('apple', '1111', 'apple@sample.com', '010-1111-2222', @result);

############# 결과 확인 #############

SELECT @result;

show create procedure SP_MEMBER_INSERT;

select * from TB_MEMBER;

