drop procedure usp_discount_customer;
delimiter //
CREATE PROCEDURE usp_discount_customer()
BEGIN
	DECLARE finished INTEGER DEFAULT 0;
	DECLARE user_name VARCHAR(60) DEFAULT "";
	DECLARE order_id INTEGER DEFAULT 0;
	DECLARE discount INTEGER DEFAULT 0;
	DECLARE new_cost DOUBLE;
	DECLARE after_discount_cost DOUBLE;
	DECLARE order_user_cur CURSOR FOR select oder_id,u.name,total_cost from oder as o inner join user as u on o.customer_id=u.user_id;
	DECLARE CONTINUE HANDLER FOR NOT FOUND SET finished = 1;

OPEN order_user_cur;

   get_row : LOOP
                    FETCH order_user_cur INTO order_id, user_name, new_cost;
                     IF finished THEN
                             LEAVE get_row;
                     END IF;
                     IF new_cost>5000 THEN
                             set discount=30;
                     ELSEIF new_cost>1000 THEN
                             set discount=10;    
                     END IF;
                    set after_discount_cost=new_cost*(1-discount/100);
		    select concat(user_name,' get ',discount,'% discount on order id ',order_id,' so you will pay only ',after_discount_cost,' 			    on MRP ',new_cost);  
  
   END LOOP get_row;

CLOSE order_user_cur;
END;
//

delimiter ;







