#Query to find which products belongs to a seller.
select items.* from sellers_items inner join items on sellers_items.item_id=items.item_id where sellers_items.seller_id=5; 
