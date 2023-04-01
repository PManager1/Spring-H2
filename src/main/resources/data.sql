create table person
(
	id integer not null, 
	name varchar(255) not null, 
	location varchar(255), 
	birth_date timestamp,
	primary key(id)
);

INSERT INTO PERSON 
        (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10000, 'Ranga', 'HYDERABAD', CURRENT_DATE() );

INSERT INTO PERSON 
        (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10001, 'John', 'TX', CURRENT_DATE() );

INSERT INTO PERSON 
        (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10002, 'Zeus', 'IL', CURRENT_DATE() );

INSERT INTO PERSON 
        (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10003, 'Paul', 'ID', CURRENT_DATE() );


INSERT INTO PERSON 
        (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10004, 'Mohan', 'OR', CURRENT_DATE() ); 