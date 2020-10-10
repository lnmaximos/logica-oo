-- Criar schema ou banco	
CREATE SCHEMA `zoo` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_mysql500_ci ;


-- Script para criar uma tabela

CREATE TABLE `zoo`.`animal` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `especie` VARCHAR(20) NOT NULL,
  `idade` INT NULL,
  `estavivo` TINYINT NULL,
  PRIMARY KEY (`codigo`));
