-- Last updated: 09/07/2026, 15:11:41
# Write your MySQL query statement below
select d.name as Department,e1.name as Employee,e1.salary as Salary
from Employee e1 join Department d on e1.DepartmentId=d.id
where 3>(select count(distinct(e2.salary))
          from Employee e2
          where e2.Salary>e1.Salary
          and e1.DepartmentId=e2.DepartmentId)