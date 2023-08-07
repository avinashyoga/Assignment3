package week1.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {

	public static void main(String[] args) {
		
              ChromeDriver driver=new ChromeDriver();
              driver.manage().window().maximize();
              driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
                    
		driver.get("https://www.abhibus.com/");
		
		driver.findElement(By.id("source")).sendKeys("Chennai");
		
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		
		driver.findElement(By.xpath("//input[@id='destination']")).sendKeys("Bangalore");
		
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		
		driver.findElement(By.xpath("//a[@class='ui-state-default']")).click();
		
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
		driver.findElement(By.xpath("//input[@id='Bustypes4']")).click();
		
		driver.findElement(By.xpath("//span[text()='Select Seat']")).click();
		
		driver.findElement(By.xpath("//a[@class='tooltip tooltipstered']")).click();
		
		driver.findElement(By.xpath("//input[@class='button shadow']")).click();
		
		WebElement findElement = driver.findElement(By.xpath("//select[@id='boardingpoint_id']"));
		
		Select dropdown=new Select(findElement);
		
		dropdown.selectByVisibleText("Shollinganallaur-21:16");
		
		WebElement findElement2 = driver.findElement(By.xpath("//select[@name='droppingpoint_id']"));
		
		Select dropdown2=new Select (findElement2);
		
		dropdown2.selectByVisibleText("Electronic City Toll Gate-05:07");
		
		driver.close();

	}

}
