DROP DATABASE kamazon;
CREATE DATABASE kamazon DEFAULT CHARACTER SET 'utf8';
USE kamazon;

CREATE TABLE department (
	id 			INT 			AUTO_INCREMENT,
    name		VARCHAR(255)	NOT NULL,
    address		VARCHAR(512),
    CONSTRAINT pk_dep
		PRIMARY KEY(id)
);

CREATE TABLE employee (
	id			INT				AUTO_INCREMENT,
    first_name	VARCHAR(50)		NOT NULL,
    last_name	VARCHAR(50)		NOT NULL,
    dep_id		INT				NOT NULL,
    salary		FLOAT,
    CONSTRAINT pk_employee
		PRIMARY KEY (id),
	CONSTRAINT fk_dep_id
		FOREIGN KEY (dep_id)
			REFERENCES department(id)
);

CREATE TABLE address (
	emp_id		INT,
    line		VARCHAR(255)	NOT NULL,
    city		VARCHAR(255)	NOT NULL,
    CONSTRAINT	pk_address
		PRIMARY KEY (emp_id),
	CONSTRAINT	fk_address_emp_id
		FOREIGN KEY (emp_id)
			REFERENCES employee(id)
);

CREATE TABLE credential (
	emp_id		INT,
	username	VARCHAR(255)	NOT NULL,
    password	VARCHAR(32)		NOT NULL,
    CONSTRAINT	pk_credential
		PRIMARY KEY (emp_id),
	CONSTRAINT	fk_credential_emp_id
		FOREIGN KEY (emp_id)
			REFERENCES employee (id),
	CONSTRAINT uq_credential_username
		UNIQUE (username)
);

CREATE TABLE project (
	id		INT					AUTO_INCREMENT,
    name	VARCHAR(255)		NOT NULL,
    CONSTRAINT pk_project
		PRIMARY KEY (id),
	CONSTRAINT uq_project_name
		UNIQUE (name)
);

CREATE TABLE employee_project (
	emp_id	INT,
    pro_id	INT,
    CONSTRAINT pk_employee_project
		PRIMARY KEY (emp_id, pro_id),
    CONSTRAINT fk_emp_pro_emp_id
		FOREIGN KEY (emp_id)
			REFERENCES employee (id),
	CONSTRAINT fk_emp_pro_pro_id
		FOREIGN KEY (pro_id)
			REFERENCES project (id)
);
