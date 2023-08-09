package org.college;

public class College {
	public void collegeName()
	{
		System.out.println("Bishop Heber College");
	}
	public void collegeCode()
	{
		System.out.println("621215");
	}
	public void collegeRank() 
	{
		System.out.println("Grade 'A'");
	}
	public static void main(String[] args) 
	{
		College obj=new College();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
	}

}
