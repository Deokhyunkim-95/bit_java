drop table book;

CREATE TABLE Book (
  bookid      NUMBER(2) PRIMARY KEY,
  bookname    VARCHAR2(40),
  publisher   VARCHAR2(40),
  price       NUMBER(8) 
);


drop table book;
CREATE TABLE Book (
  bookid      NUMBER(5) PRIMARY KEY,
  bookname    VARCHAR2(100),
  publisher   VARCHAR2(100),
  price       NUMBER(8), 
  img         VARCHAR2(100)
);



select * from ( select rownum row#,bookid, bookname, publisher, price 
 					   from (select * from Book order by bookid desc)  
 					    ) where row# between 1 and 5 ;
 					    
 					    
 					    