 #change IN no_of_product file TRIGGER this TRIGGER
USE ecommerce;
DROP TRIGGER trg_upd_order;
delimiter //
CREATE TRIGGER trg_upd_order
  after
  UPDATE
  ON orders_products FOR EACH row begin
  UPDATE orders
  SET    orders.total_cost=orders.total_cost+(new.no_of_product-old.no_of_product)*
         (
                SELECT selling_price
                FROM   products AS p
                WHERE  p.product_id=old.product_id),
         order_date=curdate()
  WHERE  order_id=old.order_id;
END;//
delimiter ;
#above TRIGGER CALL ON this type of query
#update orders_products SET no_of_product=no_of_product+2 WHERE order_id=3 AND product_id=3; 
