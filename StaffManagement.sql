create Table employee(
 EID varchar(10),
 Name varchar(30), 
 DOB date, 
 sex varchar(10), 
 Marital_Status varchar(10), 
 Address varchar(100), 
 Tel varchar(10), 
 Email varchar(100), 
 Profession varchar(20)
 )


 Create Table academic_staff(
 EID varchar(10), 
 Qualifications varchar(100)
 )

 Create Table non_academic_staff(
 EID varchar(10), 
 experience varchar(100)
 )




 select *
 From employee

 select *
 From academic_staff

 select *
 From non_academic_staff

 drop table employee
 drop table academic_staff
 drop table non_academic_staff


