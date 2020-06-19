CREATE DATABASE education_app_db;

USE education_app_db;

CREATE TABLE user
(
    user_id    int AUTO_INCREMENT,
    first_name varchar(30),
    last_name  varchar(30),
    position   varchar(30) NOT NULL DEFAULT 'Student',
    contact_no char(10),
    nic        char(10) UNIQUE,
    email      varchar(30) NOT NULL UNIQUE,
    password   varchar(30) NOT NULL,
    CONSTRAINT user_pk PRIMARY KEY (user_id)
);

CREATE TABLE lecture
(
    lecture_id         int AUTO_INCREMENT,
    lesson_name        varchar(30),
    lesson_description varchar(100),
    subject_code       char(4),
    lecturer_id        char(10),
    location_code      char(3),
    date               DATE,
    start_time         TIME,
    end_time           TIME,
    CONSTRAINT lecture_pk PRIMARY KEY (lecture_id)
);

DESCRIBE user;

DESCRIBE lecture;

SELECT *
FROM user;

SELECT *
FROM lecture;

INSERT INTO `education_app_db`.`lecture` (`lecture_id`, `lesson_name`, `lesson_description`, `subject_code`,
                                          `lecturer_id`, `location_code`, `date`, `start_time`, `end_time`)
VALUES ('Lecture1', 'Intro to Java', 'Java programming', '1010', 'Lecturer1', 'N3C', '2020-06-17', '12:00', '14:00');

INSERT INTO `education_app_db`.`lecture` (`lecture_id`, `lesson_name`, `lesson_description`, `subject_code`,
                                          `lecturer_id`, `location_code`, `date`, `start_time`, `end_time`)
VALUES ('Lecture2', 'Intro to C', 'C programming', '1020', 'Lecturer2', 'N3C', '2020-06-17', '10:00', '12:00');

INSERT INTO `education_app_db`.`user` (`user_id`, `first_name`, `last_name`, `position`, `contact_no`, `nic`,
                                       `email`, `password`)
VALUES ('User1', 'Tharinda', 'Rajapaksha', 'Lecturer', '0914921062', '982411270V',
        'tharindarajapakshe@y7mail.com', 'tharinda');

INSERT INTO `education_app_db`.`user` (`user_id`, `first_name`, `last_name`, `position`, `contact_no`, `nic`,
                                       `email`, `password`)
VALUES ('User2', 'Nehan', 'Ilangakoon', 'Student', '0987654321', '978089786V', 'nehan@gmail.com', 'nehan');

DROP TABLE lecture;

DROP TABLE user;

DROP DATABASE education_app_db;
