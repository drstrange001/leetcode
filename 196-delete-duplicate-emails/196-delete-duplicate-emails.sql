# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below

DELETE E2 FROM Person E1
JOIN
Person E2 ON E1.email = E2.email AND E1.id < E2.id;