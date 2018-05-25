use o2o;
CREATE TABLE `tb_local_auth`(
`local_auth_id` INT(10) NOT NULL auto_increment,
`user_id` INT(10) NOT NULL,
`username` VARCHAR(128) NOT NULL,
`PASSWORD` VARCHAR(128) NOT NULL,
`creat_time` datetime DEFAULT NULL,
`last_edit_time` datetime DEFAULT NULL,
PRIMARY KEY(`local_auth_id`),
UNIQUE KEY `uk_local_profile`(`username`),
CONSTRAINT `fk_localauth_prifile` FOREIGN KEY(`user_id`) REFERENCES `tb_person_info`(`user_id`)
)ENGINE=INNODB auto_increment=1 DEFAULT CHARSET=utf8