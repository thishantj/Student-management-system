create table LeavesN(

	Name varchar(100),
	Id varchar(20) not null,
	Days int,
	Timein int,
	Timeout int,
	Fullday int,
	Halfday int,
	ShortLeaves int,
	AnnualLeaves int,
	CasualLeaves int,
	DutyLeaves int,

	CONSTRAINT pk_LeavesN PRIMARY KEY(Id)
)



create table PayrollN(

	Name varchar(100),
	Id varchar(20)  not null,
	Year int,
	Ordinary varchar,
	Advanced varchar,
	Diploma varchar,
	Language varchar,
	Others varchar,

	CONSTRAINT pk_PayrollN PRIMARY KEY(Id)
)

create table SalaryN(

	Name varchar(100),
	Id varchar(20)  not null,
	Designation varchar,
	Bank varchar,
	BankAccountNo varchar(15),
	PresentDays int,
	BasicPay int,
	OverTime int,
	MedicalAllowance int,
	DearnessAllowance int,
	TotalEarnings int,
	ProfesionalTax int,
	ProvidentFund int,
	Insurance int,
	TotalDeductions int,
	Netay int,

	CONSTRAINT pk_SalaryN PRIMARY KEY(Id)
)