CREATE OR REPLACE VIEW monthly_report_view as
select distinct(oder.oder_id) as oder_id,oder.oder_date as 'Order Date',group_concat(concat(item.name,'(',item.color,')')) as 'product names',
group_concat(product.price) 'cost of each product',oder.total_cost 'total cost of order',user.name as 'user name',user.email as 'user email'
from oder inner join oder_product on oder.oder_id=oder_product.oder_id 
inner join product on product.product_id=oder_product.oder_product_id 
inner join seler_item on seler_item.seler_item_id=product.seler_item_id
inner join user on user.user_id=oder.customer_id
inner join item on item.item_id=seler_item.item_id
where month(oder.oder_date)=2
group by oder.oder_id;

select*from monthly_report_view;
