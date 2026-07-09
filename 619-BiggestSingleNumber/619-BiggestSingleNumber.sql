-- Last updated: 09/07/2026, 15:09:00
# Write your MySQL query statement below
select  MAX(num) as num
from(
    select num
    from MyNumbers
    Group by num
    Having count(num)=1
) as unique_numbers;