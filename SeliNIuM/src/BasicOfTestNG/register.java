package BasicOfTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class register {
	@Test
	public void Register()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']"));
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Prabh");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Jha");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rabha204@gmail.com");
		driver.findElement(By.xpath("(//input[@class='text-box single-line password'])[1]")).sendKeys("iam@prabh");
		driver.findElement(By.xpath("(//input[@class='text-box single-line password'])[2]")).sendKeys("iam@prabh");
		
//		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		driver.quit();
	}

}
