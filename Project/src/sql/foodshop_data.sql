insert into foodshop(fid, fname, address, foodstyle, image, image_menu, loc, discount, holiday, octime, tel)
values((select nvl(max(FID),0)+1 from foodshop),'�볬�Ĵ�','����� ������ ���ﵿ 751-17', '�ѽ�', './img_foodshop/daenak.jpg',
		'./img_menu/daenak_menu.png', '������', 50, 'SUN', '12:00 - 24:00', '02-558-5561');

insert into foodshop(fid, fname, address, foodstyle, image, image_menu, loc, discount, holiday, octime, tel)
values((select nvl(max(FID),0)+1 from foodshop),'��������������ũ�Ͽ콺','����� ������ �Ż絿 523-20', '�귱ġ', './img/pancake.jpg',
		'./img_menu/pancake_menu.jpg', '���μ���', 10, 'MON', ' 09:30 - 21:30', '02-511-7481');

insert into foodshop(fid, fname, address, foodstyle, image, image_menu, loc, discount, holiday, octime, tel)
values((select nvl(max(FID),0)+1 from foodshop),'Lit It Tommy','����� ���ʱ� ��赿 451-31', '�ܹ���', './img/lit_it_Tommy.jpg',
		'./img_menu/lit_it_Tommy_menu.jpg', '����/���', 20, 'MON', '11:30 - 22:00', '02-525-1976');
		
insert into foodshop(fid, fname, address, foodstyle, image, image_menu, loc, discount, holiday, octime, tel)
values((select nvl(max(FID),0)+1 from foodshop),'�Թ�Ĵ�','����� ������ ������ 118-20', '�ѽ�', './img_foodshop/gebang_sikdang.jpg',
		'./img_menu/gebang_sikdang_menu.png', '���/����/���', 15, 'SUN', '11:30 - 21:00', '010-8479-1107');
        
insert into foodshop(fid, fname, address, foodstyle, image, image_menu, loc, discount, holiday, octime, tel)
values((select nvl(max(FID),0)+1 from foodshop),'Chick Peace','	����� ������ �Ż絿 540-18', '�����׸���', './img_foodshop/chick_peace.jpg',
		'./img_menu/chick_peace_menu.png', '���¿�/�ѳ���', 30, 'TUE', '11:30~22:00', '02-6956-6780');    