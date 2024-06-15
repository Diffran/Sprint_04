-- MySQL Workbench Forward Engineering

-- -----------------------------------------------------
-- Schema fruites
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `fruites` DEFAULT CHARACTER SET utf8 ;
USE `fruites` ;

-- -----------------------------------------------------
-- Table `fruites`.`fruit`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `fruites`.`fruit` (
  `idfruit` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `kg` INT NOT NULL,
  PRIMARY KEY (`idfruit`),
  UNIQUE INDEX `idfruit_UNIQUE` (`idfruit` ASC) )
ENGINE = InnoDB;
