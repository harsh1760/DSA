# Write your MySQL query statement below

DELETE p FROM Person p inner join Person p1 
where p.email=p1.email AND p.id>p1.id;