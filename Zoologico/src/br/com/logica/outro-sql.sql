use zoo;

INSERT INTO animal(especie, idade, estavivo)values("T-Rex", 30000000000000, 1);

-- buscar todas as colunas da tabela
SELECT * FROM animal;

-- Adiciona uma nova coluna
ALTER TABLE animal ADD COLUMN NOME VARCHAR(100);

UPDATE animal SET nome = 'jojo todinho';
UPDATE animal SET nome = 'Toto' where codigo = 1;

-- cria��o do banco --
CREATE DATABASE comercial;

-- acessando o banco --
use comercial;

-- inicio cria��o de tabelas --
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
			  value('A25', 'Missi', 'Instrutor de inform�tica', '2015-09-10', '123456789', '(47) 97777-7777', '2100-01-01', 'missi');
              
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
id_vendedor int not null,
valor float(10,2),
desconto float(10,2),
total float(10,2),
data_venda date,
primary key (id));

alter table venda add column id_vendedor int not null;

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

-- inicio altera��o de tabelas --
alter table cliente add column cidade varchar(50);

-- mostra a estrutura fisica da tabela --
describe cliente;

alter table cliente add column estado varchar(50);

alter table cliente drop column estado;

alter table cliente add column estado varchar(50);

alter table cliente modify column estado int;

alter table cliente modify column estado varchar(100);
-- fim altera��o de tabelas --

-- inicio da cria��o dos index --
alter table produto add index produto_fornecedor_id (id asc);

alter table venda add index venda_cliente (id_cliente asc);

alter table venda add index venda_fornecedor_id (id_fornecedor asc);

alter table item_venda add index venda_produto_id (id_produto asc);
-- fim da cria��o dos index --

-- inicio da cria��o das constraints de chave estrangeira --
alter table venda add constraint fk_produto_fornecedor
foreign key(id_fornecedor)
references fornecedor(id)
on delete no action
on update no action;

alter table venda add constraint fk_venda_cliente
foreign key(id_cliente)
references cliente(id)
on delete no action
on update no action;

alter table venda add constraint fk_venda_vendedor
foreign key(id_vendedor)
references vendedor(id)
on delete no action
on update no action;

alter table venda add constraint fk_venda_fornecedor
foreign key(id_fornecedor )
references fornecedor(id)
on delete no action
on update no action;

alter table item_venda add constraint fk_item_venda_produto
foreign key(id_produto)
references produto (id)
on delete no action
on update no action;
-- fim da cria��o das constraints --