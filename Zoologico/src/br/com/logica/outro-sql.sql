use zoo;

INSERT INTO animal(especie, idade, estavivo)values("T-Rex", 30000000000000, 1);

-- buscar todas as colunas da tabela
SELECT * FROM animal;

-- Adiciona uma nova coluna
ALTER TABLE animal ADD COLUMN NOME VARCHAR(100);

UPDATE animal SET nome = 'jojo todinho';
UPDATE animal SET nome = 'Toto' where codigo = 1;

-- criação do banco --
CREATE DATABASE comercial;

-- acessando o banco --
use comercial;

-- inicio criação de tabelas --
create table cliente(
id int not null auto_increment,
codigo_cliente varchar(10),
nome varchar(100),
razao_social varchar(100),
data_cadastro date,
cnpj varchar(20),
telefone varchar(20),
primary key (id));

insert into cliente(codigo_cliente, nome, razao_social, data_cadastro, cnpj, telefone, data_morte, apelido)
			  value('A25', 'Missi', 'Instrutor de informática', '2015-09-10', '123456789', '(47) 97777-7777', '2100-01-01', 'missi');
              
SELECT * FROM cliente;

ALTER TABLE cliente ADD COLUMN apelido varchar(10);

create table fornecedor(
id int not null auto_increment,
codigo_fornecedor varchar(10),
nome varchar(100),
razao_social varchar(100),
telefone varchar(20),
primary key (id));

create table vendedor(
id int not null auto_increment,
codigo_vendedor varchar(10),
nome varchar(100),
razavende varchar(100),
telefone varchar(20),
n_porcvende float(10,2),
primary key (id));

create table produto(
id int not null auto_increment,
codigo_produto varchar(20),
descricao varchar(100),
valor float(10,2),
situacao varchar(1),
id_fornecedor int,
primary key (id));

create table venda(
id int not null auto_increment,
codigo_venda varchar(10),
id_cliente int not null,
id_fornecedor int not null,
id_vendendor int not null,
valor float(10,2),
desconto float(10,2),
total float(10,2),
data_venda date,
primary key (id));

create table item_venda(
id int not null auto_increment,
codigo_item_venda int not null,
id_produto int not null,
valor float(10,2),
qtde int,
desconto float(10,2),
primary key (id));

-- excluindo tudo da tabela --
truncate cliente;
select * from cliente;

-- inicio alteração de tabelas --
alter table cliente add column cidade varchar(50);

-- mostra a estrutura fisica da tabela --
describe cliente;