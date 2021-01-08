INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('jordan', 'harrison');

INSERT INTO `ims`.`items` (`item_name`, `price`) VALUES ('cyberpunk 2077', 65.00);
INSERT INTO `ims`.`items` (`item_name`, `price`) VALUES ('cyberpunk 2076', 65.00);
INSERT INTO `ims`.`items` (`item_name`, `price`) VALUES ('cyberpunk 2075', 65.00);
INSERT INTO `ims`.`items` (`item_name`, `price`) VALUES ('cyberpunk 2074', 65.00);


INSERT INTO `ims`.`orders` (`customer_id`) VALUES (1);
INSERT INTO `ims`.`orders` (`customer_id`) VALUES (1);
INSERT INTO `ims`.`orders` (`customer_id`) VALUES (2);
INSERT INTO `ims`.`orders` (`customer_id`) VALUES (3);

INSERT INTO `ims`.`order_items` (`order_id`, `item_id`) VALUES (1, 1);