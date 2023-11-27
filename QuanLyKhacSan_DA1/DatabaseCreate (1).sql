

Insert Into KhachHang 
values
	(N'KH001',N'Dương Ngọc Như Ý','0774166232','079303009389'),
	(N'KH002',N'Trần Quỳnh Hương','0835366768','099303221097'),
	(N'KH003',N'Nguyễn Lâm Ngọc Hân','0389635337','011302309364'),
	(N'KH004',N'Chu Minh Hiếu','0984166244','079301119381'),
	(N'KH005',N'Nguyễn Huy Hoàng','0978866899','033738271008'),
	(N'KH006',N'Hoàng Duy Nam','0774166232','079303009389'),
	(N'KH007',N'Lê Đức Anh Vũ','0774166232','079303009389'),
	(N'KH008',N'Giang Hải Chương','0774166232','079303009389'),
	(N'KH009',N'Nguyễn Anh Khôi','0774166232','079303009389'),
	(N'KH010',N'Bùi Đình Phương Nam','0774166232','079303009389');




Insert into Phong 
values
	(N'LP101',N'Phòng Standard',700000,N'Standard.jpg',''),
	(N'LP201',N'Phòng Standard',700000,N'Standard.jpg',''),
	(N'LP301',N'Phòng Standard',700000,N'Standard.jpg',''),
	(N'LP102',N'Phòng Superior',900000,N'Superior.jpg',''),
	(N'LP202',N'Phòng Superior',900000,N'Superior.jpg',''),
	(N'LP302',N'Phòng Superior',900000,N'Superior.jpg',''),
	(N'LP103',N'Phòng Deleuxe',1000000,N'Deleuxe.jpg',''),
	(N'LP203',N'Phòng Deleuxe',1000000,N'Deleuxe.jpg',''),
	(N'LP303',N'Phòng Deleuxe',1000000,N'Deleuxe.jpg',''),
	(N'LP104',N'Phòng Suite',1500000,N'Suite.jpg',''),
	(N'LP204',N'Phòng Suite',1500000,N'Suite.jpg',''),
	(N'LP304',N'Phòng Suite',1500000,N'Suite.jpg',''),
	(N'LP401',N'Connecting Room',2000000,N'SingleR.jpg',''),
	(N'LP402',N'Phòng Single',200000,N'SingleR.jpg',''),
	(N'LP403',N'Phòng Twin',400000,N'DoubleR.jpg',''),
	(N'LP404',N'Phòng Triple',600000,N'TripleR.jpg','');



Insert Into NhanVien
values
	(N'NV001',N'123',N'Trần Quỳnh Hương',1,N''),
	(N'NV002',N'123',N'Dương Ngọc Như Ý',1,N''),
	(N'NV003',N'123',N'Nguyễn Lâm Ngọc Hân',1,N''),
	(N'NV004',N'123',N'Chu Minh Hiếu',1,N'');

	select *from NhanVien


Insert Into DichVu 
values
	(N'DV001',N'Mỳ ly',20000,''),
	(N'DV002',N'Nước suối',15000,''),
	(N'DV003',N'Pepsi',15000,''),
	(N'DV004',N'7up',15000,''),
	(N'DV005',N'Giặt',40000,''),
	(N'DV006',N'Ủi',30000,'');



Insert into DatPhong
values 
	(N'DP021',N'KH010',N'LP101',N'DV002','2022-11-19','2022-11-20',N'',N''),
	(N'DP002',N'KH008',N'LP103',N'DV003','2022-07-05','2022-07-08',N'',N''),
	(N'DP003',N'KH004',N'LP401',N'DV004','2023-04-01','2023-04-04',N'',N''),
	(N'DP004',N'KH006',N'LP302',N'DV005','2021-02-20','2021-02-24',N'',N''),
	(N'DP005',N'KH009',N'LP303',N'DV001','2021-02-14','2021-02-15',N'',N''),
	(N'DP006',N'KH002',N'LP201',N'DV003','2022-12-30','2023-01-03',N'',N''),
	(N'DP007',N'KH001',N'LP203',N'DV006','2022-09-02','2022-09-05',N'',N''),
	(N'DP008',N'KH009',N'LP301',N'DV001','2023-01-01','2023-01-04',N'',N''),
	(N'DP009',N'KH008',N'LP202',N'DV002','2023-02-14','2023-02-16',N'',N''),
	(N'DP010',N'KH003',N'LP102',N'DV003','2022-10-12','2022-10-15',N'',N''),
	(N'DP011',N'KH007',N'LP302',N'DV004','2022-04-26','2022-04-30',N'',N''),
	(N'DP012',N'KH005',N'LP201',N'DV005','2022-05-29','2022-01-06',N'',N''),
	(N'DP013',N'KH007',N'LP402',N'DV006','2022-07-22','2022-07-27',N'',N''),
	(N'DP014',N'KH001',N'LP403',N'DV004','2021-08-21','2021-08-23',N'',N''),
	(N'DP015',N'KH002',N'LP102',N'DV002','2023-01-25','2023-01-30',N'',N''),
	(N'DP016',N'KH010',N'LP101',N'DV006','2023-03-20','2023-03-21',N'',N''),
	(N'DP017',N'KH004',N'LP201',N'DV001','2022-06-16','2022-06-19',N'',N''),
	(N'DP018',N'KH010',N'LP301',N'DV003','2022-10-10','2022-10-13',N'',N''),
	(N'DP019',N'KH003',N'LP401',N'DV005','2022-06-14','2022-06-17',N'',N''),
	(N'DP020',N'KH009',N'LP202',N'DV005','2022-12-03','2022-12-05',N'',N'');



insert into ChiTietDV
	values
	(N'DV002',N'DP021',1,50000),
	(N'DV003',N'DP002',2,100000),
	(N'DV004',N'DP003',3,150000),
	(N'DV005',N'DP004',4,200000),
	(N'DV001',N'DP005',5,250000),
	(N'DV003',N'DP006',1,50000),
	(N'DV006',N'DP007',3,150000),
	(N'DV001',N'DP008',5,250000),
	(N'DV002',N'DP009',2,100000),
	(N'DV003',N'DP010',4,200000),
	(N'DV004',N'DP011',5,250000),
	(N'DV005',N'DP012',4,200000),
	(N'DV006',N'DP013',3,150000),
	(N'DV004',N'DP014',2,100000),
	(N'DV002',N'DP015',1,50000),
	(N'DV006',N'DP016',4,200000),
	(N'DV001',N'DP017',2,100000),
	(N'DV003',N'DP018',5,250000),
	(N'DV005',N'DP019',3,150000),
	(N'DV005',N'DP020',1,50000);

	select * from NhanVien