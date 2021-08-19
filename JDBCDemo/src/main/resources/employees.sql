CREATE TABLE address (
address_id int NOT NULL,
address_house_no varchar(10),
address_street varchar(50),
address_area varchar(50),
address_taluk varchar(50),
address_district varchar(50),
address_state varchar(50),
address_country varchar(50),
address_pincode varchar(50),
PRIMARY KEY (address_id)
);


CREATE TABLE employee (
emp_id int NOT NULL,
employee_id int NOT NULL,
employee_name varchar(50),
employee_salary decimal(10,2),
address_id int NOT NULL,
PRIMARY KEY (emp_id),
FOREIGN KEY (address_id) REFERENCES Address(address_id)
);
