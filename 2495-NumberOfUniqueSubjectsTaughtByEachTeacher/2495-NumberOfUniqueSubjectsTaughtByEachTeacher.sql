-- Last updated: 09/07/2026, 15:06:41
# Write your MySQL query statement below
select teacher_id,count(distinct subject_id) as cnt
from Teacher
group by teacher_id;