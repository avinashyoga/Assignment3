package Assignment4;

public class Employee
{
	public void getEmployeeInfo(int employeeId) 
	{
		System.out.println(employeeId);
	}
	public void getEmployeeInfo(int employeeId,String name) 
	{
		System.out.println(employeeId +" - "+ name);
	}
	public void getEmployeeInfo(int employeeId,String name,String email)
	{
		System.out.println(employeeId +" - "+ name +" - "+ email);
	}
	public void getEmployeeInfo(int employeeId,String name,String email,long telephone) 
	{
		System.out.println(employeeId +" - "+ name +" - "+ email+" - "+telephone);
	}
	public static void main(String[] args) 
	{
		Employee EmployeeInfo =  new Employee();
		EmployeeInfo.getEmployeeInfo(101);
		EmployeeInfo.getEmployeeInfo(102, "Avinash");
		EmployeeInfo.getEmployeeInfo(102, "Avinash", "avinashyoga2@gmail.com");
		EmployeeInfo.getEmployeeInfo(102, "Avinash", "avinashyoga2@gmail.com", 8778496446L);
	}

}
