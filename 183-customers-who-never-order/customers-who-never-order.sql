# Write your MySQL query statement below
SELECT C.name AS Customers 
FROM Customers C
LEFT JOIN Orders O 
ON C.id = o.customerId
WHERE O.id IS NULL;