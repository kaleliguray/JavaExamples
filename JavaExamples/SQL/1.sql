-- DDL Data Defination Language
-- DML Data Manipulation Language

-- USE classicmodels;
DESC employees;

SELECT 
	*
FROM
	employees;

SELECT 
	firstName,
    lastName,
    jobTitle
FROM employees;

SELECT
	firstName,
    lastName
FROM
	employees
ORDER BY 
	firstName DESC,
	lastName ASC;
    
SELECT
	orderNumber,
    orderLineNumber,
    quantityOrdered * priceEach AS subtotal
FROM
	orderdetails
WHERE
	quantityOrdered * priceEach > 10000
ORDER BY
	subtotal DESC;
    
SELECT
	orderNumber,
    status
FROM
	orders
ORDER BY
	FIELD(status,
		'In Process',
        'On Hold',
        'Cancelled',
        'Resolved',
        'Disputed',
        'Shipped'
    );
    
SELECT
	firstName,
    lastName,
    jobTitle
FROM
	employees
WHERE
	jobTitle = 'Sales Rep' OR 
    officeCode = 1
ORDER BY
	officeCode,
    jobTitle;
    
SELECT
	firstName,
    lastName,
    officeCode
FROM
	employees
WHERE
	officeCode BETWEEN 2 AND 4;
    
SELECT
	firstName,
    lastName
FROM
	employees
WHERE
	lastName NOT LIKE 'B__n%';
    
SELECT
	firstName,
    lastName,
    officeCode
FROM
	employees
WHERE
	officeCode NOT IN (1,2,3)
ORDER BY
	officeCode;
    
SELECT
	firstName,
    lastName,
    reportsTo
FROM
	employees
WHERE
	reportsTo IS NOT NULL;
    
SELECT
	firstName,
    lastName
FROM
	employees
WHERE
	firstName = 'Loui';
    
SELECT
	DISTINCT firstName
FROM
	employees;
    
SELECT
	COUNT(DISTINCT state)
FROM
	customers
WHERE 
	country = 'USA';
    
SELECT
	DISTINCT state
FROM
	customers
WHERE
	state IS NOT NULL
ORDER BY state DESC
LIMIT 5;