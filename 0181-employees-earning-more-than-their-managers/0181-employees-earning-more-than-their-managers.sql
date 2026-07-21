# Write your MySQL query statement below
SELECT E2.name as Employee FROM Employee as E JOIN Employee as E2 ON E.id  = E2.managerID WHERE E.salary < E2.salary;