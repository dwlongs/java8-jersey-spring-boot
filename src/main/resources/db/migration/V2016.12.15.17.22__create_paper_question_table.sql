DROP TABLE if exists PAPER_QUESTION;
create table PAPER_QUESTION(
	id bigint(20) NOT NULL AUTO_INCREMENT,
	paper_id bigint(20) NOT NULL,
	question_id bigint(20) NOT NULL,
	option_answer bigint(20),
	submmition nvarchar(255),
	score smallint NOT NULL DEFAULT 0,
	PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;