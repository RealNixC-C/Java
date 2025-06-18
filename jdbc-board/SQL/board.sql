-- Active: 1749607595528@@127.0.0.1@3306@jdbc_board
-- 게시판 프로젝트 데이터베이스 생성
CREATE DATABASE jdbc_board;
USE jdbc_board;

-- 게시판 테이블 생성
CREATE TABLE board (
  no INTEGER AUTO_INCREMENT,
  title VARCHAR(100) NOT NULL,
  writer VARCHAR(100) NOT NULL,
  content TEXT, 
  reg_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
  -- DATE 타입: reg_date DATETIME NOT NULL DEFAULT CURRENT_DATE
  update_date DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  -- ON UPDATE CURRENT_TIMESTAMP: UPDATE시 자동으로 수정 시간도 갱신
  PRIMARY KEY (no)
);

DESC board;

-- 추가
INSERT INTO board (title, writer, content)
VALUES 
  ('제목1', '박닉스', '졸리다');

SELECT * FROM board;
SELECT * FROM board WHERE no = 1;

-- 수정
UPDATE board
SET
  title = '제목수정1',
  writer = '닉스',
  content = '커피마시고싶다'
  -- upd_date = now() -- 수정일을 현재 시간을 갱신
WHERE no = 1;

DELETE FROM board
WHERE no = 1;

SELECT * FROM board;



























