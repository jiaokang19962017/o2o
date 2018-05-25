USE o2o;
CREATE TABLE `tb_head_line`(
`line_id` INT(100) NOT NULL auto_increment,
`line_name` VARCHAR(1000) DEFAULT NULL,
`line_link` VARCHAR(2000) NOT NULL,
`line_img` VARCHAR(2000) NOT NULL,
`priority` int(2) DEFAULT NULL,
`enable_status` int(2) NOT NULL DEFAULT '0',
`creat_time` datetime DEFAULT NULL,
`last_edit_time` datetime DEFAULT NULL,
PRIMARY KEY(`line_id`)
)ENGINE=INNODB auto_increment=1 DEFAULT CHARSET=utf8