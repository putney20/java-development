use northwind;

insert into suppliers(
SupplierID, 
CompanyName,
ContactName,
ContactTitle,
Address,
City,
PostalCode,
Country,
Phone)
Values(30, "Hello", "Mark Cuban", "Manager", "123 MAin Street", "Charlotte", 28078, "US", 7041236745);

insert into products(
ProductID,
ProductName,
SupplierID,
UnitPrice)
values(78, "FitBit", 30, 100);

SELECT p.productName, s.companyName
from products p
join suppliers s
on p.supplierID = s.supplierID;

Update products
set unitprice = unitprice + (unitprice * .15)
Where productid = 78;  

select productname, unitprice
from products
where supplierid = 30;

delete from products
where productid = 78;

delete from suppliers
where supplierid = 30;

select * 
from products;

select *
from suppliers;