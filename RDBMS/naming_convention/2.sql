use ecommerce;
insert into users values (1, 'name1', 'name1@email.com', 'name1pass', 'buyer');
insert into users values (2, 'name2', 'name2@email.com', 'name2pass', 'buyer');
insert into users values (3, 'name3', 'name3@email.com', 'name3pass', 'buyer');
insert into users values (4, 'name4', 'name4@email.com', 'name4pass', 'buyer');
insert into users values (5, 'name5', 'name5@email.com', 'name5pass', 'seller');
insert into users values (6, 'name6', 'name6@email.com', 'name6pass', 'seller');
insert into users values (7, 'name7', 'name7@email.com', 'name7pass', 'seller');
insert into users values (8, 'name8', 'name8@email.com', 'name8pass', 'seller');
insert into users values (9, 'name9', 'name9@email.com', 'name9pass', 'seller');
insert into users values (10, 'name10', 'name10@email.com', 'name10pass', 'seller');


insert into items values (1, 'banana', 'yellow');
insert into items values (2, 'banana', 'red');
insert into items values (3, 'orange', 'pink');
insert into items values (4, 'apple', 'pink');
insert into items values (5, 'grapes', 'white');
insert into items values (6, 'apple', 'black');
insert into items values (7, 'grapes', 'magenta');
insert into items values (8, 'mango', 'white');
insert into items values (9, 'fruits', 'multi color');
insert into items values (10, 'coconut', 'white');


insert into sellers_items values (1,5,3);
insert into sellers_items values (2,5,5);
insert into sellers_items values (3,6,5);
insert into sellers_items values (4,6,3);
insert into sellers_items values (5,7,3);

insert into products values(1,1,50);
insert into products values(2,2,30);
insert into products values(3,3,60);
insert into products values(4,4,40);
insert into products values(5,5,50);

insert into orders values (1, 1,100, '2016-02-25');
insert into orders values (2, 4,2000, '2016-02-29');
insert into orders values (3, 2,1000, '2016-01-15');
insert into orders values (4, 1,4000, '2016-02-05');
insert into orders values (5, 6,5000, '2016-03-11');

insert into orders_products values(1,1,3);
insert into orders_products values(2,2,5);
insert into orders_products values(3,3,6);
insert into orders_products values(3,4,5);
insert into orders_products values(4,1,3);
insert into orders_products values(4,3,3);


