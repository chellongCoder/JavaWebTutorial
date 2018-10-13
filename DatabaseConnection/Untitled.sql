create database QuanLySinhVien; 

use QuanLySinhVien;

create table SinhVien(
	id varchar(50)  primary key,
    name varchar(50),
    class varchar(50)
);

drop table SinhVien;


insert into SinhVien(id, name, class, dob)
values 
('1', 'sv1', 'class1', '2001/1/1')
