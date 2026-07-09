-- Last updated: 09/07/2026, 15:07:20
# Write your MySQL query statement below
select customer_id,count(v.visit_id) as count_no_trans
from Visits v
left join Transactions t on v.visit_id=t.visit_id
where transaction_id is null
group by customer_id;