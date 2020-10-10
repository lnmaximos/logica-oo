-- Criar schema ou banco	
CREATE SCHEMA `zoo` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_mysql500_ci ;


-- Script para criar uma tabela

CREATE TABLE `zoo`.`animal` (
  `codigo` INT NOT NULL AUTO_INCREMENT,
  `especie` VARCHAR(20) NOT NULL,
  `idade` INT NULL,
  `estavivo` TINYINT NULL,
  PRIMARY KEY (`codigo`));

 DDL - Data Definition Language - Linguagem de Defini��o de Dados
CREATE TABLE
ALTER TABLE
DROP TABLE

DML - Data Manipulation Language - Linguagem de Manipula��o de Dados
CREATE   ---- INSERT ---- INSERIR
READ     ---- SELECT ---- CONSULTAR
UPDATE   ---- UPDATE ---- ALTERAR
DELETE   ---- DELETE ---- EXCLUIR

-- Inserindo registros
INSERT INTO animal(especie, idade, estavivo)values("T-Rex", 30000000000000, 1);


-- Consultando os registros da tabela
SELECT especie, idade, estavivo FROM animal;


-- buscar todas as colunas da tabela
SELECT * FROM animal;

-- Adiciona uma nova coluna
ALTER TABLE animal ADD COLUMN NOME VARCHAR(100);

-- alterando o nome
UPDATE animal SET nome = 'jojo todinho';
UPDATE animal SET nome = 'Toto' where codigo = 1;