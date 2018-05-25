USE o2o;
CREATE TABLE `tb_product_img`(
`product_img_id` INT(20) not NULL auto_increment,
`img_addr` VARCHAR(2000) NOT NULL,
`img_desc` VARCHAR(2000) DEFAULT NULL,
`priority` INT(2) DEFAULT '0',
`create_time` datetime DEFAULT NULL,
`product_id` INT(20) DEFAULT NULL,
PRIMARY KEY(`product_img_id`),
CONSTRAINT `fk_proimg_product` FOREIGN KEY(`product_id`) REFERENCES `tb_product`(`product_id`)
)ENGINE=INNODB auto_increment=1 DEFAULT CHARSET=utf8