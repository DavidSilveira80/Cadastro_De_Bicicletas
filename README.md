# Cadastro_De_Bicicletas
Sistema de cadastro de bicicletas em Java Puro com persistência de dados
___

# Passos

---
## Instalar mysql-connector

---
## Criar Banco cadastrobicicleta mysql


~~~roomsql
CREATE DATABASE cadastrobicicleta;
~~~

---
## Criando tabela bicicletas

~~~roomsql
CREATE TABLE bicicletas
(
    id int unsigned not null AUTO_INCREMENT,
    modelo varchar(45) not null,
    cor varchar(15) not null,
    preco double not null DEFAULT '0',
    nome_comprador varchar(45) not null,
    nome_loja varchar(45) not null,
    PRIMARY KEY(id)
);
~~~


