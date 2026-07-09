-- Last updated: 09/07/2026, 15:11:46
# Write your MySQL query statement below
SELECT name as Customers
from Customers
where id not in(
    select customerId
    from Orders
);