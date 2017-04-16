drop database ecommerce;
create database ecommerce;
use ecommerce;
drop table orders_products;
drop table orders;
drop table products;
drop table sellers_items;
drop table items;
drop table users;

#users table
create table users (
user_id int PRIMARY KEY ,
name varchar(50) not null,
email varchar(50) unique not null,
passowrd varchar(50) not null,
user_type varchar(10) check(user_type='seller' OR user_type='buyer')
);

#items table
create table items(
item_id int PRIMARY KEY ,
name varchar(50) not null,
color varchar(50) DEFAULT 'black',
CONSTRAINT items_name_color_un UNIQUE (name,color)
);

create table sellers_items(
seller_item_id int PRIMARY KEY,
seller_id int,
item_id int,
CONSTRAINT sellers_items_seller_id_fk FOREIGN KEY (seller_id)
REFERENCES users(user_id),
CONSTRAINT sellers_items_item_id_fk FOREIGN KEY (item_id)
REFERENCES items(item_id)
);


create table products(
product_id int PRIMARY KEY ,
seller_item_id int,
price double not null,
CONSTRAINT products_seller_item_id_fk FOREIGN KEY (seller_item_id)
REFERENCES sellers_items(seller_item_id)
);




create table orders(
order_id int PRIMARY KEY ,
customer_id int,
total_cost double,
order_date date,
CONSTRAINT orders_customer_id_fk FOREIGN KEY (customer_id)
REFERENCES users(user_id)
);



create table orders_products(
order_id int,
product_id int,
no_of_product int DEFAULT 1,
CONSTRAINT orders_products_order_id_fk FOREIGN KEY (order_id)
REFERENCES orders(order_id),
CONSTRAINT orders_products_product_id_fk FOREIGN KEY (product_id)
REFERENCES products(product_id)
);

show tables;

