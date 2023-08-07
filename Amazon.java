package week1.day1;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bags");
		
		driver.findElement(By.xpath("(//div[text()=\"bags\"])[2]")).click();
		
		driver.findElement(By.xpath("//span[text()='ADISA']")).click();
		
		driver.findElement(By.xpath("//span[text()='Featured']")).click();
	    
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
	    
		driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")).click();
		
		System.out.println("Title of Page: " + driver.getTitle());

		
	
	}

}
