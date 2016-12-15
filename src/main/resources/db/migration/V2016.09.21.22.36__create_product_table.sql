CREATE TABLE `PRODUCT` (
  `id`           BIGINT(20)  NOT NULL AUTO_INCREMENT,
  `name`         VARCHAR(64) NOT NULL,
  `time_created` DATETIME             DEFAULT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
