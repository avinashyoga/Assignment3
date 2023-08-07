package week1.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Leadfacebook {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//FaceBook URL
		driver.get("https://en-gb.facebook.com/");
		//maximize
		driver.manage().window().maximize();
		//implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Create new account
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		//firstName
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Avinash");
		//LastName
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("avinashyogabalan");
		//Email
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9790546788");
		//PassWord
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Avinash@950025");
		//Date of birth day
		WebElement findElement = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		//findElement
		Select Dateofbirth=new Select(findElement);
		//selectValue
		Dateofbirth.selectByValue("2");
		//Date of month
		driver.findElement(By.xpath("//select[@name='birthday_month']"));
		//dropDown
	    Select Dropdown=new Select(findElement);
	    //visibleText
	    Dropdown.selectByVisibleText("9");	    
	    //Date of year
	    WebElement findElement2 = driver.findElement(By.xpath("//select[@id='year']"));
	    //Date of year
	    Select Dateofyear=new Select(findElement2);
	    //selectValue
	    Dateofyear.selectByValue("1999");
	     //radio Button
	    driver.findElement(By.xpath("//input[@name='sex']")).click();
	    
	    
	     
	}
	
	

}
