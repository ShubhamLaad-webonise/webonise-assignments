CREATE OR REPLACE VIEW seller_report_view as
select group_concat(distinct(oder.oder_id)) as 'oder id',user.name as 'seller name',sum(product.price) as 'oder total',oder.oder_date as date
from oder inner join oder_product on oder.oder_id=oder_product.oder_id 
inner join product on product.product_id=oder_product.oder_product_id 
inner join seler_item on seler_item.seler_item_id=product.seler_item_id
inner join user on user.user_id=seler_item.seler_id
group by seler_id
;

select*from seller_report_view;
