-- Last updated: 09/07/2026, 15:11:59
# Write your MySQL query statement below
select S.score,count(s2.score) as 'rank' from scores S,
(select distinct score from scores) S2
where S.score<=S2.score
group by S.ID
order by S.score desc;