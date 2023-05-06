# Spring-H2-starter


How to connect to the h2 DB. 
After you start the h2 db, from the console pick the value after mem: ( this string )  
& past it in the h2-console inside the JDBC  URL. 
No need to put anyting in password / username.  keep it same as it is. 

in the console log it would say something like. 
Database available at 'jdbc:h2:mem:280ef9e4-3909-4a8d-b99f-22f92faa9bee'



Dont use sysdate but use  CURRENT_DATE()



INSERT INTO PERSON 
        (ID, NAME, LOCATION, BIRTH_DATE)
VALUES(10002, 'RON', 'NY', CURRENT_DATE() ); 

select * from person
