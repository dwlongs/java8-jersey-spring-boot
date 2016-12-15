DROP TABLE if exists QUESTIONS;
create table QUESTIONS(
	id bigint(20) NOT NULL AUTO_INCREMENT,
	description nvarchar(500) NOT NULL,
	type tinyint NOT NULL,
	answer nvarchar(1000) NOT NULL,
	score smallint NOT NULL DEFAULT 0,
	PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
