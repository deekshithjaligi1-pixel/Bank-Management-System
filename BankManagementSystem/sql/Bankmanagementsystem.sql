CREATE DATABASE Bankmanagementsystem;


USE Bankmanagementsystem;
CREATE TABLE SignOne (formno VARCHAR(20), name VARCHAR(20),father_name VARCHAR(20),dob VARCHAR(20), gender VARCHAR(20), emailaddress VARCHAR(30), Maritalstatus VARCHAR(20),address VARCHAR(40), city VARCHAR(20), state VARCHAR(20),pincode VARCHAR(20));
show tables;
select * from SignOne;

CREATE TABLE SignTwo ( formno varchar(20), Religion varchar(20), category varchar(20), Income varchar(25),Education varchar(20),Occupation varchar(25), Pan varchar(20), Aadhar varchar(20),SeniorCitisen varchar(20),ExistingAccount varchar(20));
select * from SignTwo;

CREATE TABLE SignThree (formno varchar(20),AccountType varchar(20),Cardnumber varchar(20), Pinnumber varchar(20),Facility varchar(20));
CREATE TABLE login (formno varchar(25), cardnumber varchar(20), pinnumber varchar(20));
select * from login;




select * from SignThree;

CREATE TABLE Deposit (pin varchar(20), date varchar(100), type varchar(30) , amount varchar(20));
select * from Deposit;








