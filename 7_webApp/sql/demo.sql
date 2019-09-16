drop table book;

CREATE TABLE Book (
  bookid      NUMBER(2) PRIMARY KEY,
  bookname    VARCHAR2(40),
  publisher   VARCHAR2(40),
  price       NUMBER(8) 
);


select * from ( select rownum row#,bookid, bookname, publisher, price 
 					   from (select * from Book order by bookid desc)  
 					    ) where row# between 1 and 5 ;
 					    
 					    
 					    