package TASK_ORANGE_HRM;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TASK_ADDTOCART3ITEMS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String str1="https://www.flipkart.com/";
		driver.get(str1);
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone 14",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']")).click();
		String Mid=driver.getWindowHandle();
		Set<String> Allid = driver.getWindowHandles();
		
		for(String id:Allid)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().contains("APPLE iPhone 14"))
			{
				break;
			}
			
		}
		
		
			driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
			
		for(String z:Allid)
		{
			driver.switchTo().window(z);
			if(driver.getTitle().contains("Shopping Cart | Flipkart.com"));
			{
				break;
			}
		}
//		driver.findElement(By.xpath("//input[@class='_3704LK']")).clear();
//		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("oneplus",Keys.ENTER);

		

	}

}
