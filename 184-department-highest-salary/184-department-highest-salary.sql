# Write your MySQL query statement below

SELECT Department, Employee, salary
FROM (
SELECT b.name as Department, a.name as Employee, a.salary ,
DENSE_RANK() OVER(partition by b.name order by salary DESC) as RNK
from Employee a JOIN Department b on a.departmentId = b.Id
    ) a where RNK=1