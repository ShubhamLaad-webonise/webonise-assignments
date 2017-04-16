#profit and loss of every seller
use ecommerce; 
DROP PROCEDURE usp_profit_products;
delimiter //
CREATE PROCEDURE
  usp_profit_products()
begin
	DECLARE finished     INTEGER DEFAULT 0;
	DECLARE l_seller_name VARCHAR(60);
	DECLARE l_selling_price DOUBLE;
	DECLARE l_cost_price DOUBLE;
	DECLARE profit DOUBLE;
	DECLARE products_cur CURSOR FOR
  SELECT     sum(selling_price),
             sum(cost_price),
             users.name
  FROM       products      AS p
  INNER JOIN sellers_items AS s
  ON         p.seller_item_id=s.seller_item_id
  INNER JOIN users
  ON         s.seller_id=users.user_id
  GROUP BY   seller_id;
DECLARE CONTINUE handler FOR NOT found SET finished = 1;
open products_cur;
get_row : LOOP
    FETCH products_cur
    INTO  l_selling_price,
          l_cost_price,
          l_seller_name;
	IF finished THEN
      LEAVE get_row;
	END IF;
	SET profit =l_selling_price-l_cost_price;
	IF profit>0 THEN
      SELECT concat('seller ',l_seller_name,' get ',profit,'Rs profit' )as 'seller profit';ELSE
      SELECT concat('seller ',l_seller_name,' get ',profit,'Rs loss') as 'seller loss';
	END IF;
END LOOP get_row;
close products_cur;
END;// 

delimiter  ;

call usp_profit_products;
