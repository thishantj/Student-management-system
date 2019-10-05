package itp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SHARUKH
 */
public class TSalary {
    
    private String Name ,Designations,Bank,BankAccountNo;
    private int PresentDays,Id ,BasicPay,OverTime,MedicalAllowance,DearnessAllowance,TotalEarnings,ProfessionalTax,ProvidentFund,Insurance,TotalDeductions,NetPay;

    public TSalary(String Name, int Id, String Designation, int PresentDays, String Bank, String BankAccountNo, int BasicPay, int OverTime, int MedicalAllowance, int DearnessAllowance, int TotalEarnings, int ProfessionalTax, int ProvidentFund, int Insurance, int TotalDeductions, int NetPay) {
        this.Name = Name;
        this.Id = Id;
        this.Designations = Designation;
        this.Bank = Bank;
        this.BankAccountNo = BankAccountNo;
        this.PresentDays = PresentDays;
        this.BasicPay = BasicPay;
        this.OverTime = OverTime;
        this.MedicalAllowance = MedicalAllowance;
        this.DearnessAllowance = DearnessAllowance;
        this.TotalEarnings = TotalEarnings;
        this.ProfessionalTax = ProfessionalTax;
        this.ProvidentFund = ProvidentFund;
        this.Insurance = Insurance;
        this.TotalDeductions = TotalDeductions;
        this.NetPay = NetPay;
    }

    public String getName() {
        return Name;
    }

    public int getId() {
        return Id;
    }

    public String getDesignation() {
        return Designations;
    }

    public String getBank() {
        return Bank;
    }

    public String getBankAccountNo() {
        return BankAccountNo;
    }

    public int getPresentDays() {
        return PresentDays;
    }

    public int getBasicPay() {
        return BasicPay;
    }

    public int getOverTime() {
        return OverTime;
    }

    public int getMedicalAllowance() {
        return MedicalAllowance;
    }

    public int getDearnessAllowance() {
        return DearnessAllowance;
    }

    public int getTotalEarnings() {
        return TotalEarnings;
    }

    public int getProfessionalTax() {
        return ProfessionalTax;
    }

    public int getProvidentFund() {
        return ProvidentFund;
    }

    public int getInsurance() {
        return Insurance;
    }

    public int getTotalDeductions() {
        return TotalDeductions;
    }

    public int getNetPay() {
        return NetPay;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setDesignation(String Designation) {
        this.Designations = Designation;
    }

    public void setBank(String Bank) {
        this.Bank = Bank;
    }

    public void setBankAccountNo(String BankAccountNo) {
        this.BankAccountNo = BankAccountNo;
    }

    public void setPresentDays(int PresentDays) {
        this.PresentDays = PresentDays;
    }

    public void setBasicPay(int BasicPay) {
        this.BasicPay = BasicPay;
    }

    public void setOverTime(int OverTime) {
        this.OverTime = OverTime;
    }

    public void setMedicalAllowance(int MedicalAllowance) {
        this.MedicalAllowance = MedicalAllowance;
    }

    public void setDearnessAllowance(int DearnessAllowance) {
        this.DearnessAllowance = DearnessAllowance;
    }

    public void setTotalEarnings(int TotalEarnings) {
        this.TotalEarnings = TotalEarnings;
    }

    public void setProfessionalTax(int ProfessionalTax) {
        this.ProfessionalTax = ProfessionalTax;
    }

    public void setProvidentFund(int ProvidentFund) {
        this.ProvidentFund = ProvidentFund;
    }

    public void setInsurance(int Insurance) {
        this.Insurance = Insurance;
    }

    public void setTotalDeductions(int TotalDeductions) {
        this.TotalDeductions = TotalDeductions;
    }

    public void setNetPay(int NetPay) {
        this.NetPay = NetPay;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
