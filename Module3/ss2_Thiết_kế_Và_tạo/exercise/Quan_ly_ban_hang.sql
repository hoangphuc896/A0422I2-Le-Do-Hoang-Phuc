create database QUAN_LY_BAN_HANG;
use QUAN_LY_BAN_HANG;

create table customer(
c_id int auto_increment primary key ,
c_name varchar(45),
c_age int not null check(c_age<100 and c_age>10)
);

create table order_1(
o_id int auto_increment primary key,
c_id int ,
o_date datetime,
o_total_price int  check (o_total_price > 0 ),
foreign key(c_id) references customer (c_id)
);
create table product(
p_id int auto_increment primary key,
p_name varchar(45),
p_price int
);

create table order_1_deltail(
o_id int,
p_id int,
od_QTY int check (od_QTY>0),
primary key(o_id,p_id),
foreign key(o_id) references order_1(o_id),
foreign key(p_id) references product(p_id)
);