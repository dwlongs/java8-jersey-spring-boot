DROP TABLE if exists PROGRAMS;
create table PROGRAMS(
	id bigint(20) NOT NULL AUTO_INCREMENT,
	question_id bigint(20) NOT NULL,
	template_url nvarchar(255) NOT NULL,
	PRIMARY KEY(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;