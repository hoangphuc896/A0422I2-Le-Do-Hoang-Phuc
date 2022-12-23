use quan_ly_ban_hang;
insert into customer
values	(1, 'Minh Quan', 30),
		(2, 'Ngoc Oanh', 20),
		(3, 'Hong ha', 50);
insert into order_1(o_id,c_id,o_date,o_total_price)
values 	(1, 1, "2006-03-21", 3),
		(2, 2, "2006-03-23", 4),
		(3, 3, "2006-03-26", 5);
insert into product
values (1, 'May Giat', 3),
		(2, 'Tu Lanh', 5),
		(3, 'Dieu Hoa', 7),
        (4, 'Quat', 1),
		(5, 'Bep Dien', 2);
insert into order_1_deltail
values (1,1 ,3),
		(1,3,7),
		(1,4,2),
        (2,1,1),
		(3,1,8),
        (2,5,4),
		(2,3,3);
        
select o_id,o_date,o_total_price
from order_1;
select c_name,p_name 
from customer join order_1 using(c_id) join order_1_deltail using(o_id) join product using(p_id);
select c_name
from customer left join order_1 using(c_id) where o_id is null;
select o_ID, o_Date, od_QTY, p_Price, od_QTY*p_Price as o_Total_Price
 from order_1 join order_1_deltail using (o_ID) join product using (p_ID);