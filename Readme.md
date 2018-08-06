# inventory manager

# SQL Queries

INSERT INTO `pginventory`.`product` (`id`, `product_name`) VALUES ('1', 'Adenium Pink');
INSERT INTO `pginventory`.`product` (`id`, `product_name`) VALUES ('2', 'Rose');
INSERT INTO `pginventory`.`product` (`id`, `product_name`) VALUES ('3', 'Lily');


INSERT INTO `pginventory`.`nursery` (`id`, `nursery_name`, `price`, `fk_product`) VALUES ('1', 'Nursery A', '12.50', '1');
INSERT INTO `pginventory`.`nursery` (`id`, `nursery_name`, `price`, `fk_product`) VALUES ('2', 'Nursery B', '13.00', '1');
INSERT INTO `pginventory`.`nursery` (`id`, `nursery_name`, `price`, `fk_product`) VALUES ('3', 'Nursery A', '15', '2');
INSERT INTO `pginventory`.`nursery` (`id`, `nursery_name`, `price`, `fk_product`) VALUES ('4', 'Nursery B', '13', '2');
INSERT INTO `pginventory`.`nursery` (`id`, `nursery_name`, `price`, `fk_product`) VALUES ('5', 'Nursery A', '50', '3');
INSERT INTO `pginventory`.`nursery` (`id`, `nursery_name`, `price`, `fk_product`) VALUES ('6', 'Nursery B', '50', '3');
INSERT INTO `pginventory`.`nursery` (`id`, `nursery_name`, `price`, `fk_product`) VALUES ('7', 'Nursery C', '51', '3');



INSERT INTO `pginventory`.`purchase_data` (`id`, `quantity`, `total_price`, `total_price_paid`, `nursery_id`, `product_id`) VALUES ('1', '10', '500', '500', '5', '3');
INSERT INTO `pginventory`.`purchase_data` (`id`, `quantity`, `total_price`, `total_price_paid`, `nursery_id`, `product_id`) VALUES ('2', '10', '130', '130', '2', '1'); 