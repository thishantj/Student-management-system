--Create table statements

--from thishan
create table students(
	studentID int primary key identity(1, 1) not null,
	fname varchar(50)
)
--my table 01
create table studentEarlyLeave(
	seid int not null identity(1, 1) PRIMARY KEY,
	studentID int, 
	date date, 
	guardianName varchar(50), 
	nic varchar(10), 
	contactNo int, 
	address varchar(100), 
	reason varchar(50),

	FOREIGN KEY (studentID) REFERENCES students(studentID)
)
--my table 02
create table attendance(
	date date,
	studentID int, 
	name varchar(100),	
	present_absent varchar(50),

	FOREIGN KEY (studentID) REFERENCES students(studentID)
)
--from prabhasha
create table employees(
	empID varchar(10)
)

--my table 03
create table attendanceEmp(
	date date,
	empID varchar(10),
	time_in time,
	time_out time,
	leave varchar(10),

	--FOREIGN KEY (empID) REFERENCES employee(EID)
)

--select statements
select * from employee;
select * from attendanceEmp
select * from studentEarlyLeave;
select * from students;
select * from attendance;

--drop statements
drop table attendanceEmp1;
drop table studentEarlyLeave;
drop table attendance;
drop table students;

insert into students values('Maneesha')
insert into students values('Prabasha')
insert into students values('Dimuthu')
insert into students values('Thilini')
insert into students values('Jayasinghe')
insert into students values('Thishan')
insert into students values('Dhanushka')
insert into students values('Ragavi')
insert into students values('Accash')
insert into students values('Theeraka')


insert into studentEarlyLeave values(1, '2019-10-04', 'Mr.Jayasinghe', '916220585V', 0772556158, 'No 05, Malabe', 'Headache')
insert into studentEarlyLeave values(2, '2019-10-04', 'Mr.Jayaratne', '926220585V', 0771234568, 'No 05, Nuwara Eliya', 'Funeral')
insert into studentEarlyLeave values(3, '2019-10-04', 'Mr.Kularatne', '821365478V', 0715869254, 'No 05, Kaduwela', 'Stomachache')
insert into studentEarlyLeave values(4, '2019-10-04', 'Mrs.Gamage', '895612347V', 0522221584, 'No 05, Colombo', 'Headache')
insert into studentEarlyLeave values(5, '2019-10-02', 'Mr.Amarathunge', '725698436V', 0789456123, 'No 05, Wellampitiya', 'Sick')
insert into studentEarlyLeave values(6, '2019-10-01', 'Mrs.Perera', '789456123V', 0112584694, 'No 05, Battaramulla', 'No')
insert into studentEarlyLeave values(7, '2019-09-19', 'Mr.Kuruppu', '901234856V', 0778457878, 'No 05, Koswatta', 'Stomachache')
insert into studentEarlyLeave values(8, '2019-08-04', 'Mrs.Sathurusinghe', '755469992V', 0701223457, 'No 05, Kotte', 'Sick')
insert into studentEarlyLeave values(9, '2019-07-24', 'Mr.Jayawardena', '852963741V', 0772556158, 'No 05, Hanwella', 'Funeral')
insert into studentEarlyLeave values(10, '2019-08-31', 'Mrs.Jayasinghe', '789456123V', 0725896423, 'No 05, Pittugala', 'Headache')

