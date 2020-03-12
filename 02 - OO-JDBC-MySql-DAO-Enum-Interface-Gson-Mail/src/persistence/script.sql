
drop database BD; --Alerta: Cuidado com esse! rs

create database BD;

use BD;

 create table cliente(
 	id int primary key auto_increment, 
 	nome varchar (50),
   	email varchar (50) unique, 
   	valor double,
   	plano varchar(50)
   	);
   
   
    insert into cliente values (null, 'teste1', 'teste1@gmail.com', 390, 'SILVERCROSS');
    insert into cliente values (null, 'teste2', 'teste2@gmail.com', 380, 'SILVERCROSS');
    
    #sql injection 
    select * from cliente;
    select * from cliente where nome='teste1';
    select * from cliente where email='teste1@gmail.com';
   
    #or 1=1;
      select * from cliente where email=''''; delete from cliente; 
      
      
      
      
      
      
      
      