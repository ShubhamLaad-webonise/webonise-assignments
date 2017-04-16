#add new column in product table  

use ecommerce;

alter table products change price  selling_price double;
alter table products add cost_price double;


update products set cost_price=20 ;

