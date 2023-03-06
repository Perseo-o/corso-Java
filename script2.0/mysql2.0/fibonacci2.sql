drop database fibonacci2;
create database fibonacci2;
use fibonacci2;
create table user(
username varchar(30)  primary key,
password varchar(30),
nazionalita varchar(30),
annoNascita varchar(30),
mail varchar(50)
);

create table Statistiche(
username varchar(30) primary key,
numeroLogin int,
dateUltimoLogin varchar(30),
numeroPreferito int,
numeroDiVolteGenerato int,
numeroDiVolteCercato int,
numeroPiuAltoGenerato int,
numeroPiuAltoCercato int,
FOREIGN KEY (username) REFERENCES user(username)
);

-- TABELLA UTENTI
-- username pk " alla fine della dichiarazione delle colonne = PRIMARY KEY (column)"
-- password - not null
-- nazionalità - enum (italiana, francese, spagnola, tedesca, marziana, portoricana, americana) default 'marziana'
-- data di nascita - date not null  check(CURRENT_DATE - anno_di_nascita >= 18)
-- mail - unique not null

alter table fibonacci2.user
modify column mail varchar(50) not null,
modify column password varchar(50) not null,
modify column nazionalita enum ('italiana', 'francese', 'spagnola',' tedesca', 'marziana', 'portoricana', 'americana') default 'marziana',
modify column annoNascita date not null,
modify column mail varchar(50) unique,
ADD CHECK(annoNascita<='2005-01-01');

-- STATISTICHE
-- username FK " alla fine della dichiarazione delle colonne = FOREIGN KEY (column) REFERENCES ref_table(ref_column)"
-- numero di login - default 0
-- data ultimo login - date not null 
-- numero preferito - not null
-- numero di volte che ha generato la sequenza - default 0 
-- numero più alto generato - default 0 BIGINT
-- numero di volte che ha cercato un numero - default 0
-- numero di volte che ha cercato il numero preferito - default 0
-- numero più alto cercato default 0 BIGINT
-- FOREIGN KEY(username) REFERENCES utenti(username)

alter table fibonacci2.Statistiche
modify numeroLogin int default 0,
modify dateUltimoLogin date not null,
modify numeroPreferito int not null,
modify numeroDiVolteGenerato int default 0,
modify numeroDiVolteCercato int,
modify numeroPiuAltoGenerato int default 0,
modify numeroPiuAltoCercato int default 0;