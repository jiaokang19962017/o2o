USE o2o;
CREATE TABLE `tb_product_category`(
`product_category_id` INT(11) not NULL auto_increment,
`product_category_name` VARCHAR(100) NOT NULL,
`priority` INT(2) DEFAULT'0',
`creat_time` datetime DEFAULT NULL,
`shop_id` INT(20) NOT NULL DEFAULT'0',
PRIMARY KEY(`product_category_id`),
CONSTRAINT `fk_procate_shop` FOREIGN KEY(`shop_id`) REFERENCES `tb_shop`(`shop_id`)
)ENGINE=INNODB auto_increment=1 DEFAULT CHARSET=utf8