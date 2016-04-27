-- MySQL Script generated by MySQL Workbench
-- Mon 25 Apr 2016 07:40:16 PM EDT
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`account_type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`account_type` (
  `account_type_id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `description` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`account_type_id`)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`user` (
  `userid` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `first_name` VARCHAR(45) NULL COMMENT '',
  `last_name` VARCHAR(45) NULL COMMENT '',
  `phone` VARCHAR(45) NULL COMMENT '',
  `address` VARCHAR(45) CHARACTER SET 'big5' NULL COMMENT '',
  `city` VARCHAR(45) NULL COMMENT '',
  `state` VARCHAR(45) NULL COMMENT '',
  `zipcode` VARCHAR(45) NULL COMMENT '',
  `email` VARCHAR(45) NULL COMMENT '',
  `username` VARCHAR(45) NULL COMMENT '',
  `password` VARCHAR(8) NULL COMMENT '',
  `account_num` VARCHAR(5) NULL COMMENT '',
  PRIMARY KEY (`userid`)  COMMENT '',
  UNIQUE INDEX `userid_UNIQUE` (`userid` ASC)  COMMENT '',
  UNIQUE INDEX `username_UNIQUE` (`username` ASC)  COMMENT '',
  CONSTRAINT `account_num`
    FOREIGN KEY ()
    REFERENCES `mydb`.`account` ()
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`account`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`account` (
  `account_num` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `account_type_id` INT NOT NULL COMMENT '',
  `userid` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`account_num`)  COMMENT '',
  CONSTRAINT `account_type_id`
    FOREIGN KEY ()
    REFERENCES `mydb`.`account_type` ()
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `userid`
    FOREIGN KEY ()
    REFERENCES `mydb`.`user` ()
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
