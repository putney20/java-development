SELECT count(*)
FROM northwind.suppliers;

SELECT SUM(Salary)
from northwind.employees;

SELECT MIN(UnitPrice)
FROM northwind.products;

SELECT AVG(UnitPrice)
FROM northwind.products;

SELECT MAX(UnitPrice)
FROM northwind.products;

SELECT SupplierID, COUNT(QuantityPerUnit)
FROM northwind.products
GROUP BY SupplierID;

SELECT CategoryID, AVG(UnitPrice)
FROM northwind.products
GROUP BY CategoryID;

SELECT SupplierID, count(QuantityPerUnit)
from northwind.products
Group By SupplierID
having count(QuantityPerUnit) >= 5; 

select ProductID, ProductName,
sum(UnitPrice * UnitsInStock) AS Inventory_Value
from northwind.products
group by ProductID
order by Inventory_Value DESC , ProductName;

