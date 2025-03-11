SELECT Users.name, SUM(Transactions.amount) AS balance
FROM Transactions
JOIN Users ON Transactions.account=Users.account
GROUP BY Users.name
HAVING SUM(Transactions.amount)>10000;
