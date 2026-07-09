-- Last updated: 09/07/2026, 15:08:59
# Write your MySQL query statement below
select *
from cinema c
where c.id %2=1
and c.description!='boring'
order by c.rating desc;