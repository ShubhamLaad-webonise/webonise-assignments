#add new column in product table  

alter table product change price  selling_price double;
alter table product add cost_price double;


update product set cost_price=20 ;

