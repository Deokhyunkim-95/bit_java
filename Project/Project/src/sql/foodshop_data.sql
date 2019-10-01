insert into foodshop(fid, fname, address, foodstyle, image, image_menu, loc, discount, holiday, octime, tel)
values((select nvl(max(FID),0)+1 from foodshop),'대낚식당','서울시 강남구 역삼동 751-17', '한식', './img_foodshop/daenak.jpg',
		'./img_menu/daenak_menu.png', '강남역', 50, 'SUN', '12:00 - 24:00', '02-558-5561');

insert into foodshop(fid, fname, address, foodstyle, image, image_menu, loc, discount, holiday, octime, tel)
values((select nvl(max(FID),0)+1 from foodshop),'오리지널팬케이크하우스','서울시 강남구 신사동 523-20', '브런치', './img/pancake.jpg',
		'./img_menu/pancake_menu.jpg', '가로수길', 10, 'MON', ' 09:30 - 21:30', '02-511-7481');

insert into foodshop(fid, fname, address, foodstyle, image, image_menu, loc, discount, holiday, octime, tel)
values((select nvl(max(FID),0)+1 from foodshop),'Lit It Tommy','서울시 서초구 방배동 451-31', '햄버거', './img/lit_it_Tommy.jpg',
		'./img_menu/lit_it_Tommy_menu.jpg', '동작/사당', 20, 'MON', '11:30 - 22:00', '02-525-1976');
		
insert into foodshop(fid, fname, address, foodstyle, image, image_menu, loc, discount, holiday, octime, tel)
values((select nvl(max(FID),0)+1 from foodshop),'게방식당','서울시 강남구 논현동 118-20', '한식', './img_foodshop/gebang_sikdang.jpg',
		'./img_menu/gebang_sikdang_menu.png', '방배/반포/잠원', 15, 'SUN', '11:30 - 21:00', '010-8479-1107');
        
insert into foodshop(fid, fname, address, foodstyle, image, image_menu, loc, discount, holiday, octime, tel)
values((select nvl(max(FID),0)+1 from foodshop),'Chick Peace','	서울시 강남구 신사동 540-18', '베지테리언', './img_foodshop/chick_peace.jpg',
		'./img_menu/chick_peace_menu.png', '이태원/한남동', 30, 'TUE', '11:30~22:00', '02-6956-6780');    