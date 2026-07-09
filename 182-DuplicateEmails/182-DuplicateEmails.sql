-- Last updated: 09/07/2026, 15:11:50
# Write your MySQL query statement below
SELECT email FROM Person
GROUP BY email
HAVING COUNT(email)>1;