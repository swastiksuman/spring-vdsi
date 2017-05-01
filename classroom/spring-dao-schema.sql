create database demo1;
use demo1;
create table customers(custId int primary key,name varchar(20),city varchar(20),email varchar(20));
create table users(userid varchar(20) primary key,password varchar(20));
create table emp(empno int primary key,name varchar(20),city varchar(20),salary double);

insert into customers(custid,name,city,email) values(10001,"John","London",'john@gmail.com');
insert into customers(custid,name,city,email) values(10002,"Kate","London",'kate@gmail.com');
insert into customers(custid,name,city,email) values(10003,"Kenny","Hyderabad",'kenny@gmail.com');
insert into customers(custid,name,city,email) values(10004,"Kirti","Chennai",'kirti@gmail.com');
insert into customers(custid,name,city,email) values(10005,"Mukesh","Bhopal",'mukesh@gmail.com');
insert into customers(custid,name,city,email) values(10006,"Ravi","Bangalore",'ravi@gmail.com');
insert into customers(custid,name,city,email) values(10007,"Amit","Hyderabad",'amit@gmail.com');
insert into customers(custid,name,city,email) values(10008,"Baker","Dallas",'baker@gmail.com');
insert into customers(custid,name,city,email) values(10009,"Rina","Chennai",'rina@gmail.com');
insert into customers(custid,name,city,email) values(10010,"Chethan","Bangalore",'chetan@gmail.com');

insert into users(userid,password) values('john@gmail.com','welcome1');
insert into users(userid,password) values('chetan@gmail.com','welcome1');
insert into users(userid,password) values('kirti@gmail.com','welcome1');
insert into users(userid,password) values('rina@gmail.com','welcome1');
insert into users(userid,password) values('amit@gmail.com','welcome1');

insert into emp(empno,name,city,salary) values(100,'Pavan','Hyderabad',54000);
insert into emp(empno,name,city,salary) values(101,'Arun','Chennai',45000);
insert into emp(empno,name,city,salary) values(102,'Chandra','Chennai',50000);
insert into emp(empno,name,city,salary) values(103,'Preetham','Bangalore',55000);
insert into emp(empno,name,city,salary) values(104,'Kiran','Bangalore',62000);
insert into emp(empno,name,city,salary) values(105,'Zohra','Hyderabad',35000);


