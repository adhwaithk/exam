package exam3;
class customer{
	private int customerid;
	private String customername;
	private String emailid;
	public customer(int customerid,String customername,String emailid) {
		this.customerid=customerid;
		this.customername=customername;
		this.emailid=emailid;
	}
	public int getcustomerid() {
		return customerid;
	}
	public void setcustomerid(int customerid) {
		this.customerid=customerid;
	}
	public String getcustomername() {
		return customername;
	}
	public void setcustomername(String customername) {
		this.customername=customername;
	}
	public String getemailid() {
		return emailid;
	}
	public void setemailid(String emailid) {
		this.emailid=emailid;
	}
}
abstract class account1{
	protected int accountnumber;
	protected customer customerobj;
	protected double balance;
	public account1(int accountnumber,customer customerobj,double balance) {
		this.accountnumber=accountnumber;
		this.customerobj=customerobj;
		this.balance=balance;
	}
	public int getaccountnumber() {
		return accountnumber;
	}
	public void setaccountnumber(int accountnumber) {
		this.accountnumber=accountnumber;
	}
	public customer getcustomerobj() {
		return customerobj;
	}
	public void setcustomerobj(customer customerobj) {
		this.customerobj=customerobj;
	}
	public double getbalance() {
		return balance;
	}
	public void setbalnce(double balance) {
		this.balance=balance;
	}
	public abstract boolean withdraw(double amount);
}
	
class savingsaccount extends account1{
	private double minimumbalance;
	public savingsaccount(int accountnumber, customer customerobj, double balance, double minimumbalance) {
		super(accountnumber, customerobj, balance);
		this.minimumbalance=minimumbalance;
	}
	public double getminimumbalance() {
		return minimumbalance;
	}
	public void setminimumbalace(double minimumbalace) {
		this.minimumbalance=minimumbalance;
	}
	@Override
	public boolean withdraw(double amount) {
		if(balance - amount> minimumbalance) {
			balance-=amount;
			return true;
		}
		return false;
	}
}

public abstract class account{
	

	public static void main(String[] args) {
		customer customer = new customer(101,"Ritam","ritam@gmail.com");
		savingsaccount  savingsaccount=new savingsaccount(1001,customer,10000,500);
		if(savingsaccount.withdraw(9000)) {
			System.out.println(savingsaccount.getbalance());
		}
		

	}

}


