# Write your MySQL query statement below

  SELECT distinct author_id AS id
FROM Views
WHERE author_id = viewer_id
  AND viewer_id >= 1 order by id asc;
