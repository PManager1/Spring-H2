# Spring-H2-starter

Dont use sysdate but use  CURRENT_DATE()



INSERT INTO PERSON 
        (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10002, 'RON', 'NY', CURRENT_DATE() ); 

select * from person
