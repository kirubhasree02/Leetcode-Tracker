-- Last updated: 09/07/2026, 15:07:13
# Write your MySQL query statement below
select tweet_id from tweets
where length(content)>15;