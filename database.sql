CREATE DATABASE `ssmbuild`;

USE `ssmbuild`;

DROP TABLE IF EXISTS `books`;

CREATE TABLE `books`(
                        `bookID` INT(10) NOT NULL AUTO_INCREMENT COMMENT '书id',
                        `bookName` VARCHAR(10) NOT NULL COMMENT '书名',
                        `bookCounts` INT(11) NOT NULL COMMENT '数量',
                        `detail` VARCHAR(200) NOT NULL COMMENT '描述',
                        KEY `bookID`(`bookID`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `books`(`bookID`, `bookName`, `bookCounts`, `detail`) VALUES
                                                                      (1, 'Java', 1, '从入门到放弃'),
                                                                      (2, 'MySQL', 10, '从删库到跑路'),
                                                                      (3, 'Java', 5, '从进门到进牢');

SELECT * FROM books;

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user`(
     `username` VARCHAR(20) NOT NULL COMMENT '用户名',
     `password` VARCHAR(20) NOT NULL COMMENT '密码'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

INSERT INTO `user`(`username`, `password`) VALUES
('tim', '123456'),
('jack', '123456');

SELECT * FROM user;
