# Write your MySQL query statement below
select name as Employee from Employee emp where salary>(select salary from Employee where id=emp.managerId);


