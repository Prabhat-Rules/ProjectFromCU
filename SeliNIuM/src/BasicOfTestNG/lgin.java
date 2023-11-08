package BasicOfTestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class lgin {
	public static WebDriver driver;
	@Test
	public void lgindemobook()
	{
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rabha2104@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("iam@prabh");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		
	}

}
