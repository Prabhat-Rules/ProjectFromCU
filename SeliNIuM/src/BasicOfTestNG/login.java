package BasicOfTestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class login {
	@Test(priority=2)
	public void Login()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rabha2104@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("iam@prabh");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.quit();

	}

}
