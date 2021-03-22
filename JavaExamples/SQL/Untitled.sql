SELECT
	customerName,
    country,
    state
FROM
	customers
WHERE 
	country = 'USA' 
    AND state = 'CA' 
    AND creditLimit > 100000
ORDER BY creditLimit;


SELECT
	customerName,
    country,
    creditLimit
FROM
	customers
WHERE
	(country = 'USA'
    OR country = 'FRANCE')
    AND creditLimit > 100000;
    
SELECT
	officeCode,
    city,
    phone,
    country
FROM 
	offices
WHERE
	country NOT IN ('USA','France');
    
SELECT
	orderNumber,
    customerNumber,
    status,
    shippedDate
FROM
	orders
WHERE orderNumber IN 
(
	SELECT 
		orderNumber
	FROM
		orderdetails
	GROUP BY 
		orderNumber
	HAVING
		SUM(quantityOrdered * priceEach) > 60000
);

SELECT
	productCode,
    productName,
    buyPrice
FROM
	products
WHERE
	buyPrice NOT BETWEEN 90 AND 100;

SELECT
	orderNumber,
    requiredDate,
    status
FROM
	orders
WHERE
	requiredDate BETWEEN
		CAST('2003-01-01' AS DATE) AND
        CAST('2003-01-31' AS DATE);
        
SELECT
	employeeNumber,
    firstName,
    lastName
FROM
	employees
WHERE
	firstName NOT LIKE 'T_m';
    
SELECT
	customerNumber,
    customerName,
    creditLimit
FROM
	customers
LIMIT 20 OFFSET 25;

SELECT
	customerName,
    country,
    salesRepEmployeeNumber
FROM
	customers
WHERE
	salesRepEmployeeNumber IS NOT NULL
ORDER BY
	customerName;

SELECT
	concat_ws(', ', firstname, lastName) AS Fullname
FROM
	employees
ORDER BY
	Fullname;
    
SELECT
	orderNumber AS 'Order Number'
FROM
	orderdetails;







