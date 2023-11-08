package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class useOf_isEnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		String str2="https://demo.actitime.com/login.do";
		driver.get(str2);
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		if(username.isEnabled())
		{
			username.sendKeys("admin");
		}
		else
		{
			System.out.println("username is disabled");
		}
		WebElement pwd=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		if(pwd.isEnabled())
		{
			pwd.sendKeys("manager");
		}
		else
		{
			System.out.println("Pasword is disabled");
		}
		WebElement check = driver.findElement(By.xpath("//input[@type='checkbox']"));
		//check.click();
		if(check.isSelected())
		{
			WebElement login=driver.findElement(By.xpath("//*[@id=\"loginButton\"]/div"));
			login.click();
		}
		else
		{
			System.out.println("Checkbox is not selected");
		}
		

	}

}
