CREATE TABLE `Users` (
  `Id` bigint(11) unsigned NOT NULL AUTO_INCREMENT,
  `Email` varchar(50) DEFAULT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `School` varchar(50) DEFAULT NULL,
  `Major` varchar(50) DEFAULT NULL,
  `Grade` int(11) DEFAULT NULL,
  `Telephone` varchar(50) DEFAULT '',
  `Type` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;