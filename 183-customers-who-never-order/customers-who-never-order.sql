# Write your MySQL query statement below

select c.name AS Customers from Customers as c where c.id not in(select customerId from Orders );