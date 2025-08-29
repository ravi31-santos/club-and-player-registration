# ⚽ Sistema de cadastro de clube e jogador

Esse projeto simples consiste basicamente em cadastrar Clubes e Jogadores
o cadastro do jogador por exemplo, requer nome, skills, idade, overral e o clube em que atua
já o clube, requer nome, descrição e campeonato em que disputa 

---

## 🚀 Como usar?

Antes de rodar o projeto, você precisa ter:

- [Java JDK 17+](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- [Maven](https://maven.apache.org/)
- [MySQL](https://www.mysql.com/downloads/)

### Configuração do Banco de Dados

[![My Skills](https://skillicons.dev/icons?i=mysql,postgres,mongodb)](https://skillicons.dev)

1. Abra o MySQL Workbench ou outro cliente MySQL.  
2. Crie o banco de dados e as tabelas rodando o script `database.sql` fornecido.
3. Configure o `application.properties` do Spring Boot com seu usuário, senha e nome do banco.


Siga o Script abaixo do MySQL ->

    --database.sql
 ```sql 
 create database Player;
 use Player;

 create table Cad_Player(
 idPlayer int auto_increment primary key,
 name_player varchar(50),
 age_player tinyint unsigned,
 skill_player varchar(100),
 overral_player int(3),
 idClub int, foreign key(idClub) references Cad_Club(idClub)
 );

 create table Cad_Club(
 idClub int auto_increment primary key,
 name_club varchar(100),
 description_club varchar(200),
 championship_club varchar(200)
 );
```
---

1. Clone este repositório:
   ```bash
    git clone https://github.com/SEU_USUARIO/club-and-player-registration-java.git
   
2. Abra o projeto no intelliJ IDEA.
3. Execute o programa após ter feito todas as configurações necessárias.

---

## ⚒️ Tecnologias e F️erramentas utilizadas
[![My Skills](https://skillicons.dev/icons?i=java,idea,git,github,mysql,spring,html,css)](https://skillicons.dev)

## 🤖 Autor
Projeto desenvolvido por Rhavelly Souza dos Santos.