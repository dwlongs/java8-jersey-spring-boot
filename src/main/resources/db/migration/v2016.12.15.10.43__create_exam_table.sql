DROP TABLE `EXAM`;
CREATE TABLE `EXAM` (
  `id`          BIGINT(20)  NOT NULL AUTO_INCREMENT,
  `name`        VARCHAR(50) NOT NULL,
  `start_time`  DATETIME             DEFAULT NULL,
  `end_time`    DATETIME             DEFAULT NULL,
  `logic_num`   INT(10)     NOT NULL,
  `program_num` INT(10)     NOT NULL,
  `state`       INT(10)     NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHAR SET = utf8;