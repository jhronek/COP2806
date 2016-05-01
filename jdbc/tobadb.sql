-- MySQL Script generated by MySQL Workbench
-- Sat 30 Apr 2016 05:02:01 PM EDT
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema tobadb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `tobadb` ;

-- -----------------------------------------------------
-- Schema tobadb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `tobadb` DEFAULT CHARACTER SET utf8 ;
USE `tobadb` ;

-- -----------------------------------------------------
-- Table `tobadb`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tobadb`.`user` ;

CREATE TABLE IF NOT EXISTS `tobadb`.`user` (
  `userid` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(45) NULL,
  `last_name` VARCHAR(45) NULL,
  `phone` VARCHAR(45) NULL,
  `address` VARCHAR(45) CHARACTER SET 'big5' NULL,
  `city` VARCHAR(45) NULL,
  `state` VARCHAR(45) NULL,
  `zipcode` VARCHAR(45) NULL,
  `email` VARCHAR(45) UNIQUE NOT NULL,
  `username` VARCHAR(45) NOT NULL,
  `password` VARCHAR(8) NULL,
  `account_num` INT NOT NULL ,
  PRIMARY KEY (`userid`),
  UNIQUE INDEX `userid_UNIQUE` (`userid` ASC),
  UNIQUE INDEX `username_UNIQUE` (`username` ASC),
  UNIQUE INDEX `account_num_UNIQUE` (`account_num` ASC),
  UNIQUE INDEX `email_UNIQUE` (`email` ASC))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `tobadb`.`account`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tobadb`.`account` ;

CREATE TABLE IF NOT EXISTS `tobadb`.`account` (
  `account_num` INT NOT NULL AUTO_INCREMENT,
  `accountType` VARCHAR(10) NOT NULL,
  `userid` INT NOT NULL,
  `balance` VARCHAR(45) NOT NULL,
  UNIQUE INDEX `userid_UNIQUE` (`userid` ASC),
  PRIMARY KEY (`account_num`),
  UNIQUE INDEX `account_num_UNIQUE` (`account_num` ASC))
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;