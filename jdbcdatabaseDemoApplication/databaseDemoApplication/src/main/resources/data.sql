create table person
(
   id integer not null,
   first_name varchar(255) not null,
   last_name varchar(255) not null,
   location varchar,
   birth_date varchar(255),
   primary key(id)
);

  INSERT INTO PERSON(id,first_name, last_name, location, birth_date )
  VALUES(10001,'Ronald','Kosgei','Kajiado','12/10/2000'),
  INSERT INTO PERSON(id,first_name, last_name, location, birth_date )
  VALUES(10002,'Fred','Maina','Nakuru','01/01/2010'),
  INSERT INTO PERSON(id,first_name, last_name, location, birth_date )
  VALUES(10003,'Kelvin','Anyona','Taita','12/10/2012'),