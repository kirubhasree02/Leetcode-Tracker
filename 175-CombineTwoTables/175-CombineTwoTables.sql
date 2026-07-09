-- Last updated: 09/07/2026, 15:12:04
# Write your MySQL query statement below
SELECT firstName,lastName,city,state
FROM Person
LEFT JOIN Address
 ON Person.personId=Address.personId;