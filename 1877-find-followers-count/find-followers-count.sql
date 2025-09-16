# Write your MySQL query statement below
select distinct user_id,count(follower_id) as followers_count from Followers
GROUP BY user_id  order by user_id;