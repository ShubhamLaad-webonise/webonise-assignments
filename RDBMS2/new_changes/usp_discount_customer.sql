#procedure for showing discount to users

use ecommerce;
 DROP PROCEDURE usp_discount_customer;
delimiter //
CREATE PROCEDURE
  usp_discount_customer()
begin
	DECLARE finished  INTEGER DEFAULT 0;
	DECLARE l_user_name VARCHAR(60) DEFAULT "";
	DECLARE l_order_id  INTEGER DEFAULT 0;
	DECLARE discount  INTEGER DEFAULT 0;
	DECLARE l_total_cost DOUBLE;
	DECLARE after_discount_cost DOUBLE;
	DECLARE orders_users_cur CURSOR FOR
  SELECT     order_id,
             usr.name,
             total_cost
  FROM       orders AS ord
  INNER JOIN users AS usr
  ON         ord.customer_id=usr.user_id;
	DECLARE CONTINUE handler FOR NOT found SET finished = 1;
open orders_users_cur;
get_row :LOOP
    FETCH orders_users_cur
    INTO  l_order_id,
          l_user_name,
          l_total_cost;
	IF finished THEN
      LEAVE get_row;
	END IF;
	IF l_total_cost>4000 THEN
      SET discount=30;
	ELSEIF
      l_total_cost>1000 THEN
      SET discount=10;
	END IF;
SET after_discount_cost=l_total_cost*(1-discount/100);
SELECT concat(l_user_name,' get ',discount,'% discount on order id ',l_order_id,' so you will pay only ',after_discount_cost,' on MRP ',l_total_cost) as 'discount given';
END LOOP get_row;
close orders_users_cur;
END;//
delimiter ; 

call usp_discount_customer();
