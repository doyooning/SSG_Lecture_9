-- root(DBA) 계정으로 접속중
-- bookmarketdb 데이터베이스 생성
create database bookmarketdb;
-- bookadmin 계정 생성
create user bookadmin@localhost identified by 'bookadmin';
-- bookadmin 계정 bookmarketdb에 접속하여 운영관리할 수 있는 권한 부여
grant all privileges on bookmarketdb.* to bookadmin@localhost;