package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class useOf_Xpath_Locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		String str2="https://demo.actitime.com/login.do";
		driver.get(str2);
		Thread.sleep(2000); 
		//Syntax of First Xpath=//tagname[@attribute='atribute value']
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("admin");
		Thread.sleep(2000);
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("manager");
		Thread.sleep(2000);
		WebElement login=driver.findElement(By.xpath("//a[@id='loginButton']"));
		login.click();

	}

}
