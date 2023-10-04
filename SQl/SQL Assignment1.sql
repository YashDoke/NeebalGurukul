create database neebaldb;
use neebaldb;
create table employees (
		EmployeeID int primary key,
        FirstName varchar(50),
        LastName varchar(50),
        Department varchar(50),
        Salary numeric
);

insert into employees values (1,'Yash','Doke','Developement',55000);
insert into employees values (2,'Mohit','Kumar','Marketing',48000);
insert into employees values (3,'Ravi','Sharma','Developement',78000);
insert into employees values (4,'Kartik',null,'Sales',34000);
insert into employees values (5,'Sachin','Yadav','Marketing',34000);
insert into employees values (6,null,'Mane','Sales',23000);

select * from employees;

update  employees set salary=90000 where EmployeeID=1;
select * from employees;

insert into employees values 
		(7,'Ram','Verma','Developement',67000),
        (8,'Virat','Kohli','Marketing',56000);
        
delete from employees where EmployeeID=5;

update employees set department='Sales' where EmployeeID=3;

select * from employees;

alter table employees modify column EmployeeID int  auto_increment;

select * from employees;
insert into employees values(0,'Sarthak',null,'HR',90000);
insert into employees values(0,'Sham','Mohite','HR',92000);
insert into employees values(0,'Ajay','Patil','HR',94000);

delete from employees where Department='HR';
select * from employees;

update employees set LastName='Chahal' where EmployeeID=4;

insert into employees values(2,'Janvi','Deshmukh','HR',56000); 

delete from employees where Salary<=45000;
select * from employees;

update employees set Department='Sales' where Department='Marketing';
select * from employees;

#delete from employees; #this can be used or 
#truncate table employees; 


select * from employees;

                                                                            
INSERT INTO employees (FirstName, LastName, Department, Salary)
VALUES
    ('Rajesh', 'Patel', 'Department1', 23000),
    ('Priya', 'Sharma', 'Department2', 89000),
    ('Aisha', 'Gupta', 'Department3', 67890);
    
select * from employees;

update employees set Department='Finance' where EmployeeID in (10,11,12);
                                                                            
update employees set Salary = Salary * 1.10 where Department='Finance';
select * from employees;

delete from employees where Salary>70000;
select * from employees;

update employees set Salary = Salary * 1.05;
select * from employees;

insert into employees (FirstName,LastName,Department,Salary) values('Rahul','Singh',null,34500);
insert into employees (FirstName,LastName,Department,Salary) values('Arjun','Kumar',null,45000);
select * from employees;

delete from employees where Department IS NULL;
select * from employees;

alter table employees rename to employees2;
select * from employees2;

alter table employees2 rename to employees;


alter table employees add column email varchar(50);
select * from employees;

alter table employees modify Department varchar(100);

desc employees;
select * from employees;

alter table employees modify FirstName varchar(50) NOT NULL;

alter table employees rename column Salary to AnnualSalary;
select * from employees;

alter table employees drop column email;
select * from employees;








