USE o2o;
CREATE TABLE `tb_shop`(
`shop_id` INT(10) not NULL auto_increment,
`owner_id` INT(10) NOT NULL COMMENT '店铺创建人',
`area_id` INT(5) DEFAULT NULL,
`shop_category_id` INT(11) DEFAULT NULL,
`shop_name` VARCHAR(256) NOT NULL,
`shop_desc` VARCHAR(1024) DEFAULT NULL,
`shop_addr` VARCHAR(200) DEFAULT NULL,
`phone` VARCHAR(128) DEFAULT NULL,
`shop_img` VARCHAR(1024) DEFAULT NULL,
`priority` int(3) DEFAULT'0',
`create_time` datetime DEFAULT NULL,
`last_edit_time` datetime DEFAULT NULL,
`emable_status` INT(2) NOT NULL DEFAULT '0',
`advice` VARCHAR(255) DEFAULT NULL,
PRIMARY KEY(`shop_id`),
CONSTRAINT `fk_shop_area` FOREIGN KEY(`area_id`) REFERENCES `tb_area`(`area_id`),
CONSTRAINT `fk_shop_profile` FOREIGN KEY(`owner_id`) REFERENCES `tb_person_info`(`user_id`),
CONSTRAINT `fk_shop_shopcate` FOREIGN KEY(`shop_category_id`) REFERENCES `tb_shop_category`(`shop_category_id`)
)ENGINE=INNODB auto_increment=1 DEFAULT CHARSET=utf8