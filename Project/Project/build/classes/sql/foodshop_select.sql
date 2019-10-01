select * from ( select rownum row#,bookid, bookname, publisher, price , img "+
 					   "from (select * from Book where "+condition+" like '%'||?||'%' " +"order by bookid desc) "+ 
 					    ") where row# between ? and ? ;
 					    

 -- 이거 잘 select 되는것 확인 했음					    
select*from (select rownum row#, fid, fname, address, latitude, longitude, foodstyle, image, loc, discount, holiday, octime, tel
			  from (select * from foodshop where loc = '강남역' order by fid))
			  where row# between 1 and 2;
			  
			  
-- wildcard 사용			
select*from (select rownum row#, fid, fname, address, latitude, longitude, foodstyle, image, loc, discount, holiday, octime, tel
			  from (select * from foodshop where loc = ? order by fid))
			  where row# between ? and ?;
			  
			  
			  
select*from (select rownum row#, fid, fname, address, latitude, longitude, foodstyle, image, loc, discount, holiday, octime, tel
			  from (select * from foodshop where fname like '%'||?||'%' order by fid))
			  where row# between ? and ?;			  
			  