CREATE TABLE 제품(
    제품번호 INT AUTO_INCREMENT PRIMARY KEY,
    제품명 VARCHAR(100),
    포장단위 INT DEFAULT 0,
    단가 INT DEFAULT 0,
    재고 INT DEFAULT 0
);

CREATE TABLE 제품로그 (
    로그번호 INT AUTO_INCREMENT PRIMARY KEY,
    처리 VARCHAR(10),
    내용 VARCHAR(100),
    처리일 TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);



DELIMITER $$
CREATE TRIGGER trigger_제품변경로그
    AFTER UPDATE ON 제품
    FOR EACH ROW
BEGIN
    IF(NEW.단가 <> OLD.단가) THEN
        INSERT INTO 제품로그(처리, 내용) VALUES('UPDATE', CONCAT('제품번호 : '), OLD.제품번호, '단가 : ', OLD.단가, '->', NEW.단가);

    IF(NEW.재고 <> OLD.재고) THEN
        INSERT INTO 제품로그(처리, 내용) VALUES('UPDATE', CONCAT('제품번호 : '), OLD.제품번호, '단가 : ', OLD.재고, '->', NEW.재고);

    end if;

END $$
DELIMITER ;

UPDATE 제품
SET 단가 = 2500
WHERE 제품번호 = 1;
SELECT * FROM 제품로그;


-- 제품 테이블에서 단가재고가 변경되면 변경된 사항을 제품로그 테이블에 저장하는 트리거 생성

DELIMITER $$
CREATE TRIGGER trigger_제품추가로그
    AFTER INSERT ON 제품
    FOR EACH ROW
BEGIN
    INSERT INTO 제품로그(처리, 내용) VALUES('INSERT', CONCAT('제품번호 : ', NEW.제품번호, '제품명 : ', NEW.제품명));


END $$
DELIMITER ;


DELIMITER $$
CREATE TRIGGER trigger_제품삭제로그
    AFTER DELETE ON 제품
    FOR EACH ROW
BEGIN
    INSERT INTO 제품로그(처리, 내용) VALUES('INSERT', CONCAT('제품번호 : ', NEW.제품번호, '제품명 : ', NEW.제품명));


END $$
DELIMITER ;

DELETE FROM 제품
WHERE 제품번호 = 1;


SELECT * FROM 제품;
SELECT * FROM 제품로그;

# 트리거는 이벤트가 발생한 값을 확인하기 위해서 사용되는 키워드 OLD, NEW
# OLD = (UPDATE, DELETE 이벤트)
# NEW = (INSERT, UPDATE 이벤트에서 적용되어 값을 확인할 수 있다)