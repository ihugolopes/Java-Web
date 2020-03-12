#drop database bdRel;

create database bdRel;

use bdRel;
 
create table pessoa(
	id int primary key auto_increment,
	nome varchar (50) );
   
create table endereco (
	idendereco int primary key auto_increment,
    logradouro varchar (50), 
    bairro varchar (50), 
    cidade varchar (50), 
    estado varchar (2),
    cep varchar (15), 
    id_pessoa int,
    foreign key (id_pessoa) references pessoa(id));

insert into pessoa values (100,'alexandre');

insert into endereco values (
	1000,
	'AV Rio Branco, 185 in the front', 
	'Centro',
	'Rio de Janeiro', 
	'RJ',
	'20040007', 
	100);

select * from pessoa;

select * from endereco;

select * from pessoa p, endereco e  where p.id = e.id_pessoa;
     
     
     
        
      
      

