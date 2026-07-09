-- Last updated: 09/07/2026, 15:09:09
# Write your MySQL query statement below
select customer_number
from Orders
group by customer_number
order by COUNT(customer_number) desc
limit 1;