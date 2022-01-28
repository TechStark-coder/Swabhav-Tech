CREATE TABLE user (
    id varchar(255),
    name varchar(255) unique,
    balance double,
    password varchar(255));
    
    
   CREATE TABLE transaction (
    id varchar(255) unique ,
    name varchar(255) ,
    amount double,
    type varchar(255),
    date varchar(255));