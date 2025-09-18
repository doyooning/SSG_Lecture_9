select cast('2020-10-19 12:35:29.123' as date) as 'DATE';
select cast('2020-10-19 12:35:29.123' as time) as 'TIME';
select cast('2020-10-19 12:35:29.123' as datetime) as 'DATETIME';
select cast(now() as datetime) as 'DATETIME';

create database moviedb;
use moviedb;

create table movies(
	movie_id int auto_increment,
    movie_title varchar(100) not null,
    movie_director varchar(100) not null,
    movie_star varchar(100),
    movie_script longtext,
    movie_film longblob,
    constraint pk_movies_movie_id primary key (movie_id)
) default charset=utf8mb4; # 한글을 문제없이 처리하기 위해 기본문자셋을 utf8mb4로 지정

desc movies;
-- movie 테이블 데이터만 삭제
truncate movies;


insert into movies values(null, '쉰들러리스트', '스필버그', '리암 니슨', 
	load_file('C:/study/ssg9/sql/movies/Schindler.txt'), 
    load_file('C:/study/ssg9/sql/movies/Schindler.mp4'));
insert into movies values(null, '쇼생크탈출', '프랭크다라본트', '팀 로빈스', 
	load_file('C:/study/ssg9/sql/movies/Shawshank.txt'), 
    load_file('C:/study/ssg9/sql/movies/Shawshank.mp4'));
insert into movies values(null, '라스트모히칸', '마이클 만', '다니엘 데이 루이스', 
	load_file('C:/study/ssg9/sql/movies/Mohican.txt'), 
    load_file('C:/study/ssg9/sql/movies/Mohican.mp4'));

select * from movies;

# 스크립트랑 동영상 입력 외않되?
/*
 1. 최대 패킷 크기가 설정된 시스템 변수인 max_allowed_packet 확인
*/
show variables like 'max_allowed_packet';

/*
 2. 파일을 업로드/다운로드할 폴더 경로를 별도로 허용해 주어야 함
 시스템 변수 secure_file_priv 설정 값 확인 -> C:\ProgramData\MySQL\MySQL Server 8.0\Uploads\
*/
show variables like 'secure_file_priv';

# 입력된 데이터를 파일로 내려받기
select movie_script from movies where movie_id = 1
into outfile 'C:/study/ssg9/sql/movies/Schindler_out.txt' lines terminated by '\\n';
-- '\\n' 줄바꿈 문자도 그대로 저장한다
# 파일 저장 위치는 원본 파일의 위치(디렉토리)만 가능 <- secure-file-priv option

# 영화동영상을 파일로 다운로드하기
select movie_film from movies where movie_id = 3
into dumpfile 'C:/study/ssg9/sql/movies/Mohican_out.mp4';
