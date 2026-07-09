-- Last updated: 09/07/2026, 15:07:06
# Write your MySQL query statement below
select employee_id,department_id
from Employee
where primary_flag ='Y'
union 
select employee_id,department_id
from Employee
group by employee_id
having count(employee_id)=1
order by employee_id;