drop table oder_product;
drop table oder;
drop table product;
drop table seler_item;
drop table item;
drop table user;

#user table
create table user (
user_id int PRIMARY KEY ,
name varchar(50) not null,
email varchar(50) unique not null,
passowrd varchar(50) not null,
user_type varchar(10) check(user_type='seller' OR user_type='buyer')
);

#item table
create table item(
item_id int PRIMARY KEY ,
name varchar(50) not null,
color varchar(50) DEFAULT 'black',
CONSTRAINT item_name_color_un UNIQUE (name,color)
);

create table seler_item(
seler_item_id int PRIMARY KEY,
seler_id int,
item_id int,
CONSTRAINT seler_item_seler_id_fk FOREIGN KEY (seler_id)
REFERENCES user(user_id),
CONSTRAINT seler_item_item_id_fk FOREIGN KEY (item_id)
REFERENCES item(item_id)
);


create table product(
product_id int PRIMARY KEY ,
seler_item_id int,
price double not null,
CONSTRAINT product_seler_item_id_fk FOREIGN KEY (seler_item_id)
REFERENCES seler_item(seler_item_id)
);




create table oder(
oder_id int PRIMARY KEY ,
customer_id int,
total_cost double,
oder_date date,
CONSTRAINT oder_customer_id_fk FOREIGN KEY (customer_id)
REFERENCES user(user_id)
);



create table oder_product(
oder_id int,
oder_product_id int,
no_of_product int DEFAULT 1,
CONSTRAINT oder_product_oder_id_fk FOREIGN KEY (oder_id)
REFERENCES oder(oder_id),
CONSTRAINT oder_product_oder_product_id_fk FOREIGN KEY (oder_product_id)
REFERENCES product(product_id)
);



