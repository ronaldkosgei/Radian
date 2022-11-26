CREATE TABLE employee(
     id UUID NOT NULL PRIMARY KEY,
     name VARCHAR(100) NOT NULL,
     emailAddress VARCHAR(150), NOT NULL,
     nationality VARCHAR(80) NOT NULL,
     phoneNo INT NOT NULL,
     city VARCHAR(100) NOT NULL
   );