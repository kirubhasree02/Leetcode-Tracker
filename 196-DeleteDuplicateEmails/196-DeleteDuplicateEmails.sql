-- Last updated: 09/07/2026, 15:11:35
# Write your MySQL query statement below
delete p1 from Person p1
join person p2
on p1.email=p2.email and p1.id>p2.id;