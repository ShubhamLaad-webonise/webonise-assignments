drop trigger trg_Upd_oder;
delimiter //
CREATE TRIGGER trg_Upd_oder 
AFTER UPDATE ON oder_product FOR EACH ROW
BEGIN

    update  oder set oder.total_cost=oder.total_cost+(new.no_of_product-old.no_of_product)*(select price from product as p where               	   p.product_id=old.oder_product_id), oder_date=CURDATE() 
    where oder_id=old.oder_id;

END;

//
delimiter ;


#above trigger call on this type of query

#update oder_product set no_of_product=no_of_product+2 where oder_id=3 and oder_product_id=3;

