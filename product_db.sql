create database product_db;

use product_db;

create table products
(
 id int primary key,
 name varchar(25)
);

insert into products values(1,"Laptop");
insert into products values(2,"Mobile");
insert into products values(3,"TV");
insert into products values(4,"Laptop");

select * from products;

select * from products 
where name="Laptop"
order by id desc;

update products
set name="Tablet"
where id=4;

delete from products
where id=3;
