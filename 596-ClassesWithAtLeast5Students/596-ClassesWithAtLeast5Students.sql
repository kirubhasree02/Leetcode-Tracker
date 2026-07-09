-- Last updated: 09/07/2026, 15:09:06
# Write your MySQL query statement below
select class from Courses
group by class
having count(student)>=5;