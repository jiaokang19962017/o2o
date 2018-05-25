use o2o;
CREATE TABLE `tb_wechat_auth`(
`wechat_auth_id` INT(10) NOT NULL auto_increment,
`user_id` INT(10) NOT NULL,
`open_id` VARCHAR(1024) not NULL,
`create_time` datetime DEFAULT NULL,
PRIMARY key(`wechat_auth_id`),
CONSTRAINT `fk_wechatauth_profile` FOREIGN KEY(`user_id`) REFERENCES `tb_person_info`(`user_id`)
)ENGINE=INNODB auto_increment=1 DEFAULT CHARSET=utf8