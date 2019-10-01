drop table foodshop CASCADE CONSTRAINTS;
drop table address CASCADE CONSTRAINTS;
create table FOODSHOP(
fid number not null PRIMARY key,
fname VARCHAR2(30) not null,
address VARCHAR2 (100) not null,
latitude VARCHAR2(50) not null,
longitude VARCHAR2(50) not null,
foodstyle VARCHAR2(30),
image VARCHAR2(100),
image_menu VARCHAR2(100),
loc VARCHAR2(30),
discount INT,
holiday VARCHAR2(30),
octime VARCHAR2(30),
tel VARCHAR2(30)
);

alter table foodshop add CONSTRAINT foodshop_fk FOREIGN key(address) REFERENCES address;


--insert into foodshop
insert into foodshop(fid, fname, address, latitude, longitude, foodstyle, image, image_menu, loc, discount, holiday, octime, tel)
values((select nvl(max(FID),0)+1 from foodshop),'대낚식당','서울시 강남구 역삼동 751-17','37.496055','127.0322023', '한식', './img_foodshop/daenak.jpg',
		'./img_menu/daenak_menu.png', '강남역', 50, 'SUN', '12:00 - 24:00', '02-558-5561');

insert into foodshop(fid, fname, address, latitude, longitude, foodstyle, image, image_menu, loc, discount, holiday, octime, tel)
values((select nvl(max(FID),0)+1 from foodshop),'Original Pancake House','서울시 강남구 신사동 523-20','37.5209791', '127.0194026', '브런치', './img_foodshop/pancake.jpg',
		'./img_menu/pancake_menu.jpg', '가로수길', 10, 'MON', ' 09:30 - 21:30', '02-511-7481');

insert into foodshop(fid, fname, address, latitude, longitude, foodstyle, image, image_menu, loc, discount, holiday, octime, tel)
values((select nvl(max(FID),0)+1 from foodshop),'Lit It Tommy','서울시 서초구 방배동 451-31', '37.4783475', '126.9815775', '햄버거', './img_foodshop/lit_it_Tommy.jpg',
		'./img_menu/lit_it_Tommy_menu.jpg', '동작/사당', 20, 'MON', '11:30 - 22:00', '02-525-1976');
        
insert into foodshop(fid, fname, address, latitude, longitude, foodstyle, image, image_menu, loc, discount, holiday, octime, tel)
values((select nvl(max(FID),0)+1 from foodshop),'게방식당','서울시 강남구 논현동 118-20', '37.5172825', '127.0372336', '한식', './img_foodshop/gebang_sikdang.jpg',
		'./img_menu/gebang_sikdang_menu.png', '방배/반포/잠원', 15, 'SUN', '11:30 - 21:00', '010-8479-1107');
        
insert into foodshop(fid, fname, address, latitude, longitude, foodstyle, image, image_menu, loc, discount, holiday, octime, tel)
values((select nvl(max(FID),0)+1 from foodshop),'Chick Peace','서울시 강남구 신사동 540-18', '37.5190811', '127.0225191', '베지테리언', './img_foodshop/chick_peace.jpg',
		'./img_menu/chick_peace_menu.png', '이태원/한남동', 30, 'TUE', '11:30~22:00', '02-6956-6780'); 

		
--전체 list 보여주기 		
select*from(select rownum row#, fid, fname, address, latitude, longitude, foodstyle, image, image_menu, loc, discount, holiday, octime, tel 
				from (select * from foodshop order by fid)) where row# between 1 and 2;		
-- Wildcard 설정 ? ?		
select*from(select rownum row#, fid, fname, address, latitude, longitude, foodstyle, image, image_menu, loc, discount, holiday, octime, tel 
				from (select * from foodshop order by fid)) where row# between ? and ?;		
				
				
				
				
				