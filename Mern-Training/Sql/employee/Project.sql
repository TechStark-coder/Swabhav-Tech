CREATE TABLE user(
accno     varchar(10) not null,
firstName  varchar(20),
lastName   varchar(30),
balance    double,
email      varchar(100),
phone      varchar(10),
date       Date,
password   varchar(100),
PRIMARY KEY (accno)
);

INSERT INTO user(accno,firstName,lastName,balance,email,phone,date,password)Values("C1002","asif","peerzade",700,"asif@gmail.com","7892969392",'2022-01-21',"asif785");

CREATE TABLE transaction (
id         varchar(100),
accno      varchar(10),
firstName  varchar(20),
lastName   varchar(30),
amount     double,
type       varchar(10),
date      DATETIME,
PRIMARY KEY (id) 
);

INSERT INTO transaction( id,accno,firstName,lastName,amount,type,date)VALUES('T1001',"C1001","asif","peerzade",700,'deposit','2022-01-10 02:30:20') ;


CREATE TABLE documents (accno varchar(10),adharcard BLOB);

INSERT TABLE documents(accno,adharcard)VALUES("C1002",LOAD_FILE('C:\Users\Monocept\Pictures\myimgs\sam.jpg'));