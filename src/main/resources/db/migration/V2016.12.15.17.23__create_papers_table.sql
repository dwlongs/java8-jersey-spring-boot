DROP TABLE if exists PAPERS;
create table PAPERS(
	id bigint(20) NOT NULL AUTO_INCREMENT,
	user_id bigint(20) NOT NULL,
	exam_id bigint(20) NOT NULL,
	score smallint  NOT NULL DEFAULT 0,
	PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
