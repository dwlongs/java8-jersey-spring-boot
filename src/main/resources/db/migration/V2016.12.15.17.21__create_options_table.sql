DROP TABLE if exists  OPTIONS;
create table OPTIONS(
	id bigint(20) NOT NULL AUTO_INCREMENT,
	question_id bigint(20) NOT NULL,
	content nvarchar(255) NOT NULL,
	PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;