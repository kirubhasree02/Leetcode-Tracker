-- Last updated: 09/07/2026, 15:07:33
# Write your MySQL query statement below
select euni.unique_id,e.name
from Employees e
left join EmployeeUNI euni
on e.id=euni.id;