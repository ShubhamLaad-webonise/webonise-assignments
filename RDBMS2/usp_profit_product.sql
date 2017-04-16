drop procedure usp_profit_product;
delimiter //
CREATE PROCEDURE usp_profit_product()
BEGIN
	DECLARE finished INTEGER DEFAULT 0;
	DECLARE l_seler_name varchar(60);
	DECLARE l_selling_price DOUBLE;
	DECLARE l_cost_price DOUBLE;
	DECLARE profit DOUBLE;
	DECLARE product_cur CURSOR FOR 
	select sum(selling_price),sum(cost_price),user.name  from product as p inner join seler_item as s on p.seler_item_id=s.seler_item_id 		inner join user on s.seler_id=user.user_id group by seler_id;

	DECLARE CONTINUE HANDLER FOR NOT FOUND SET finished = 1;
OPEN product_cur;

	get_row : LOOP
		FETCH product_cur INTO l_selling_price,l_cost_price,l_seler_name;
  		IF finished THEN
  			LEAVE get_row;
  		END IF;

		set profit =l_selling_price-l_cost_price;

		IF profit>0 THEN
			select concat('seller ',l_seler_name,' get ',profit,'Rs profit');
		ELSE
			select concat('seller ',l_seler_name,' get ',profit,'Rs loss');
		END IF; 

	END LOOP get_row;

CLOSE product_cur;
END;
//

delimiter ;



select sum(selling_price),sum(cost_price),user.name  from product as p inner join seler_item as s on p.seler_item_id=s.seler_item_id
inner join user on s.seler_id=user.user_id
 group by seler_id;
