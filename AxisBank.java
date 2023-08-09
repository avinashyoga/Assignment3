package Assignment4;

public class AxisBank extends BankInfo {
	public void deposit()
	{
		System.out.println("deposit");
	}
	public static void main(String[] args)
	{
	
		BankInfo obj=new BankInfo();
		obj.deposit();
		obj.fixed();
		obj.saving();
		
	}

}
