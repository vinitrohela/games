CREATE TABLE `blackjack`.`user_info` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `version` INT NULL DEFAULT 0,
  `name` VARCHAR(45) NOT NULL,
  `balance` INT NOT NULL DEFAULT 0,
  `created` TIMESTAMP NULL DEFAULT now(),
  `modified` TIMESTAMP NULL DEFAULT now(),
  PRIMARY KEY (`id`));
