
#CREATE VIEW query with sellers report;

CREATE OR REPLACE VIEW seller_report_view as
select group_concat(distinct(orders.order_id)) as 'order id',users.name as 'seller name',sum(products.price) as 'order total',orders.order_date as date
from orders inner join orders_products on orders.order_id=orders_products.order_id 
inner join products on products.product_id=orders_products.product_id 
inner join sellers_items on sellers_items.seller_item_id=products.seller_item_id
inner join users on users.user_id=sellers_items.seller_id
group by seller_id
;

select*from seller_report_view;
