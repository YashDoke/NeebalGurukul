
create database company;
use company;

create table employees 
		(emp_id int(5) auto_increment not null unique,
        emp_fname varchar(50) not null,
        emp_lname varchar(50) not null,
        date_of_birth date not null,
        salary numeric not null,
        role_id int(5) not null ,
        team_id int(5)  not null );


        
create table teams 
		(team_id   int(5) not null unique,
        team_name varchar(50) not null,
        team_lead varchar(50) not null);


create table role (role_id int(5) not null unique auto_increment,
					role_name varchar(50) not null unique);


INSERT INTO employees (emp_fname, emp_lname, date_of_birth, salary, role_id, team_id)
VALUES
    ('Rahul', 'Gupta', '1990-03-15', 55000.00, 1, 1),
    ('Priya', 'Sharma', '1985-07-20', 60000.00, 2, 1),
    ('Amit', 'Verma', '1992-12-10', 62000.00, 1, 2),
    ('Kavita', 'Patel', '1998-05-05', 53000.00, 2, 2),
    ('Sanjay', 'Joshi', '1987-09-30', 58000.00, 1, 3),
    ('Sneha', 'Kumar', '1991-11-25', 54000.00, 2, 3),
    ('Neha', 'Rajput', '1983-04-18', 61000.00, 1, 4),
    ('Amitabh', 'Yadav', '1995-08-08', 57000.00, 2, 4),
    ('Deepak', 'Singh', '1993-02-03', 63000.00, 1, 5),
    ('Pooja', 'Mishra', '1997-06-12', 52000.00, 2, 5);
    
    INSERT INTO employees (emp_fname, emp_lname, date_of_birth, salary, role_id, team_id)
VALUES
    ('Mehul', 'Gupta', '1990-03-14', 45000.00, 2, 1);
    

INSERT INTO teams (team_id, team_name, team_lead)
VALUES
    (1, 'Development', 'Amit Sharma'),
    (2, 'Marketing', 'Priya Patel'),
    (3, 'Sales', 'Rahul Singh'),
    (4, 'Customer Support', 'Sneha Verma'),
    (5, 'HR', 'Deepak Kumar'),
    (6, 'Finance', 'Neha Gupta'),
    (7, 'Quality Assurance', 'Sanjay Joshi'),
    (8, 'Operations', 'Pooja Yadav'),
    (9, 'Research and Development', 'Amitabh Singh'),
    (10, 'IT Support', 'Kavita Rajput');
    
insert into role (role_name) values ('SR.Member');
insert into role (role_name) values ('Member');

alter table employees
add constraint pk_emp_id primary key (emp_id);

alter table teams
add constraint pk_team_id primary key (team_id);

alter table role
add constraint pk_role_id primary key (role_id);

alter table employees
add constraint fk_team_id
foreign key(team_id)
references teams (team_id);

alter table employees
add constraint fk_role_id
foreign key(role_id)
references role (role_id);

-- 1. Write a query to list the employee names, their team names and their role in the team. Sort the results by decreasing
-- order of role ID and in alphabetical order of names. Your result set should look something like this (your result set
-- will vary of course, this is just for representation purposes)

select concat_ws(' ',emp_fname,emp_lname) as Employee_Name,
team_name as Team_Name,
role_name as Role_name 
From 
employees,teams,role
where 
employees.team_id=teams.team_id and 
employees.role_id=role.role_id
order by concat_ws(' ',emp_fname,emp_lname), employees.role_id;

-- 2. Write a query to print out the name of the team, its Leader (s) and the name of Members in that team. Your result set
-- should look something like this (your result set will vary of course, this is just for representation purposes)

select team_name as Team_Name, 
		team_lead as Team_Lead,
        concat_ws(' ',emp_fname,emp_lname) as Team_Members
From teams as t,employees as e
where e.team_id = t.team_id;

-- 3. Write a query to select the name of an employee and their age in years and months and sort them from youngest to
-- the oldest. Your result set should look something like this (your result set will vary of course, this is just for
-- representation purposes). [Hint: Look at timestampdiff(), current_date(), month() functions]

select concat_ws(' ',emp_fname,emp_lname) as Employee_Name,
		timestampdiff(year,date_of_birth,current_date()) as age 
        from employees;

-- 4. If you solve problem 3, can you modify the query to give the age result in 2 separate columns as shown below?
select concat_ws(' ',emp_fname,emp_lname) as Employee_Name,
		timestampdiff(year,date_of_birth,current_date()) as Years,
        timestampdiff(month,date_of_birth,current_date())%12 as Months
        from employees;
-- 5. Write a query to find how many employees were born in the same year
select year(date_of_birth) as Birth_Year,
		count(year(date_of_birth)) as People_Born
        from employees
        group by year(date_of_birth);
        
-- 6. Write a query to print the name of the employees and their gross salary
select concat_ws(' ',emp_fname,emp_lname) as Employee_Name,
		salary as Salary
        from employees;
        
        
-- 7. Write a query to find the number of Sr. Members and Members per team.

-- i have written query but i cant able to solve properly.

-- select team_id as Team_id,
-- 		team_name as Team_Name,
--         count(role_name='SR.Member') as No_of_SR_Members,
--         count(role_name='Member') as No_of_Members
--         from teams,role
--         group by team_id;




