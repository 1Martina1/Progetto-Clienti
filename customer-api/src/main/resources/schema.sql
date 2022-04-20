create table customer(
 id int unsigned not null primary key auto_increment,
 name varchar(50),
 surname varchar(50),
 address varchar(200),
 fiscal_code varchar(16),
 birth_date varchar(16) 
);

create table contact(
 id int unsigned not null primary key auto_increment,
 customer_id int unsigned not null,
 type varchar(20),
 val varchar(20),
 certified boolean,
 foreign key(customer_id) references customer(id)
)