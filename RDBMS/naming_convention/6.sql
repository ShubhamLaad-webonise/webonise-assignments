#Monthly report query. for any fix month

CREATE OR REPLACE VIEW monthly_report_view as
select distinct(orders.order_id) as order_id,group_concat(orders.order_date) as 'Order Dates',group_concat(concat(items.name,'(',items.color,')')) as 'products names',
group_concat(products.price) 'cost of each products',orders.total_cost 'total cost of order',users.name as 'user name',users.email as 'user email'
from orders inner join orders_products on orders.order_id=orders_products.order_id 
inner join products on products.product_id=orders_products.product_id 
inner join sellers_items on sellers_items.seller_item_id=products.seller_item_id
inner join users on users.user_id=orders.customer_id
inner join items on items.item_id=sellers_items.item_id
where month(orders.order_date)=2
group by orders.order_id;

select*from monthly_report_view;
