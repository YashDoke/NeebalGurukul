drop database if exists bookstore;
create database bookstore;
use bookstore;

create table books (
		book_id int  primary key,
        title varchar(100) not null unique,
        author_id int not null,
        publication_year int not null,
        price decimal(10,2) not null
        );
        
create table authors(
		author_id int primary key,
        author_name varchar(100) not null unique,
		birth_year int not null
);

create table orders(
		order_id int  primary key,
        book_id int not null,
        customer_id int not null ,
        order_date date not null        
);

create table customers(
		customer_id int  primary key,
        f_name varchar(50) not null,
        l_name varchar(50)
);

alter table books 
add constraint  fk_author_id
foreign key (author_id) references authors(author_id);

alter table orders
add constraint fk_book_id
foreign key (book_id) references books(book_id);

alter table orders
add constraint fk_cust_id
foreign key (customer_id) references customers(customer_id);




-- Insert authors
INSERT INTO authors (author_name, birth_year) VALUES
('Chetan Bhagat', 1974),
('Arundhati Roy', 1961),
('Amish Tripathi', 1974),
('Ruskin Bond', 1934),
('Jhumpa Lahiri', 1967),
('Rabindranath Tagore', 1861),
('R.K. Narayan', 1906),
('J.K. Rowling', 1965),
('Rohinton Mistry', 1952),
('Vikram Seth', 1952);

-- Insert books
INSERT INTO books (title, author_id, publication_year, price) VALUES
('Five Point Someone', 1, 2004, 12.99),
('The God of Small Things', 2, 1997, 14.99),
('The Immortals of Meluha', 3, 2010, 16.99),
('The Blue Umbrella', 4, 1980, 9.99),
('The Namesake', 5, 2003, 11.99),
('Gitanjali', 6, 1910, 11.99),
('Swami and Friends', 7, 1935, 9.99),
('Harry Potter and the Sorcerer''s Stone', 8, 1997, 14.99),
('A Fine Balance', 9, 1995, 13.99),
('A Suitable Boy', 10, 1993, 15.99),
('The Jungle Book', 4, 1894, 10.99),
('Midnight''s Children', 9, 1981, 12.99),
('The Casual Vacancy', 8, 2012, 16.99),
('The Alchemist', 3, 1988, 14.99),
('The Great Indian Novel', 9, 1989, 13.99),
('The White Tiger', 9, 2008, 12.99),
('The Golden Gate', 10, 1986, 11.99),
('Harry Potter and the Chamber of Secrets', 8, 1998, 15.99),
('A Suitable Girl', 10, 2019, 17.99),
('The Secret of the Nagas', 3, 2011, 14.99),
('The Hungry Tide', 5, 2004, 12.99);

-- Insert customers
INSERT INTO customers (f_name, l_name) VALUES
('Amit', 'Kumar'),
('Priya', 'Sharma'),
('Raj', 'Patel'),
('Neha', 'Gupta'),
('Sunil', 'Singh'),
('Pooja', 'Chauhan'),
('Rahul', 'Srivastava'),
('Sneha', 'Verma'),
('Deepak', 'Yadav'),
('Mala', 'Rao'),
('Suresh', 'Iyer'),
('Anita', 'Menon'),
('Vishal', 'Mukherjee'),
('Rajesh', 'Reddy'),
('Meera', 'Nair'),
('Sanjay', 'Rajput'),
('Smita', 'Das'),
('Karan', 'Bose'),
('Pallavi', 'Thakur'),
('Vijay', 'Malik'),
('Asha', 'Mishra');

-- Insert orders
INSERT INTO orders (book_id, customer_id, order_date) VALUES
(1, 1, '2023-01-15'),
(2, 2, '2023-02-20'),
(3, 3, '2023-03-25'),
(4, 4, '2023-04-10'),
(5, 5, '2023-05-05'),
(6, 6, '2023-06-12'),
(7, 7, '2023-07-18'),
(8, 8, '2023-08-24'),
(9, 9, '2002-09-02'),
(10, 10, '2023-10-09'),
(11, 11, '2023-11-15'),
(12, 12, '2000-12-21'),
(13, 13, '2023-01-27'),
(14, 14, '2004-02-03'),
(15, 15, '2023-03-11'),
(16, 16, '2009-04-17'),
(17, 17, '2023-05-23'),
(18, 18, '2005-06-29'),
(19, 19, '2023-07-05'),
(20, 20, '2001-08-11');




-- 1. Retrieve a list of all books with their titles and corresponding author names.
select b.title as Title, a.author_name as Author_Name
from books b
join authors a on b.author_id= a.author_id;

-- 2. List all orders with the book title, customer name, and order date

select b.title as Title,
		concat_ws(' ',c.f_name,c.l_name) as Customer_Name,
        o.order_date as Order_Date
from orders o 
join books b on b.book_id = o.book_id
join customers c on c.customer_id = o.customer_id;

-- 3. Find the total price of all orders, including book prices, for a specific customer (e.g., customer_id =1)

-- 4. Display the author names who have books published before the year 2000
select a.author_name as Author_Name,
		b.publication_year as Publication_Year
from authors a
right join books b on b.author_id = a.author_id
where b.publication_year<=2000;

-- 5. List the titles of books and their authors where the author's birth year is later than 1970. 
select b.title as Title,
		a.author_name as Author_Name,
        a.birth_year as Birth_Year
from authors a
join books b on b.author_id = a.author_id
where a.birth_year>1970 ;

-- 6. Find the book titles and prices of books written by authors born before 1980

select b.title as Title,
		b.price as Prices
from books as b 
where b.author_id in (select author_id
    from authors
    where birth_year < 1980);
    

-- 7. Retrieve the names of authors who have written more than 3 books.

select author_name as Author_Names
from authors 
where author_id in (
select author_id
from books
group by author_id
having count(author_id)>=3);

-- select a.author_name as Author_Name
-- from authors a
-- join books b on b.author_id = a.author_id
-- group by a.author_name
-- having count(a.author_id)>=3;

-- 8. List the book titles and authors where the book price is higher than the average book price.

select b.title as Title,
	a.author_name as Author_Name,
    b.price as price
    from books b, authors a
    where b.price > (
	select avg(price)
    from books);

-- 9. Find the authors with the highest and lowest average book prices for their books.

-- 10. List the customers who have placed orders for books written by a specific author (e.g., author_id= 3).

select concat_ws(' ',f_name,l_name) as Sustomers 
from customers
where customer_id in (select customer_id 
	from orders
	where book_id in(
		select book_id 
		from books
		where author_id=3
        )
	);


-- **Filtering:**
-- 11. Find all books priced between $10 and $20.

select title 
from books 
where price>=10 and price<=20;

-- 12. List the books published in the last 5 years.
select title , publication_year
from books 
where (year(current_date())-publication_year)<=5;

-- 13. Retrieve the orders placed in the month of June.
select order_id,order_date
from orders 
where month(order_date)=6;

-- 14. Find books by a specific author (e.g., author_id = 3) with a price less than $15.
select title,price
from books 
where price<15 and author_id=4;

-- 15. List orders placed by a specific customer (e.g., customer_id = 4) for books published before 2005
select order_id
from orders 
where year(order_date)<=2005 and customer_id=9;


-- **Combining Joins, Subqueries, and Filtering:**
-- 16. Display the book titles and authors for books ordered by a specific customer (e.g., customer_id =2).

select b.title as Title,
	   a.author_name as Author_Name
from (select book_id 
from orders
where customer_id=2) book_od
join books b on b.book_id = book_od.book_id
join authors a on a.author_id = b.author_id;



-- 17. List the authors who have written books ordered by a specific customer (e.g., customer_id = 3).
	select
	   a.author_name as Author_Name
from (select book_id 
from orders
where customer_id=3) book_od
join books b on b.book_id = book_od.book_id
join authors a on a.author_id = b.author_id;


-- 18. Find the most expensive book(s) written by authors born after 1990.

select b.title , b.price
from (select author_id
from authors
where birth_year>=1965) authors_born
join books b on b.author_id = authors_born.author_id
order by b.price desc
limit 1;

-- 19. Retrieve the total number of orders placed for books published in a specific year (e.g., 2004).
select o.order_id
from (
select b.book_id
from books b
where publication_year=2004)book_ordered
join orders o on o.book_id = book_ordered.book_id
;


-- 20. Display the book titles and authors for books ordered by customers who have ordered books written by authors born before 1975.
