CREATE DATABASE Smartgroup;

CREATE TABLE CLIENT
(
    ID    INTEGER primary key not null AUTO_INCREMENT,
    EMAIL varchar(50)
);
CREATE TABLE USER_SENTIMENTS(
    ID integer primary key not null AUTO_INCREMENT,
    TEXTE varchar(50),
    TYPE varchar(10),
    CLIENT_ID integer,
    CONSTRAINT client_fk FOREIGN KEY (CLIENT_ID) REFERENCES CLIENT(ID)
);
