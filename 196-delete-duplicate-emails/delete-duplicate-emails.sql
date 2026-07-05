delete p from Person as p inner join Person as p1 on p.email=p1.email 
and  p.id>p1.id; 