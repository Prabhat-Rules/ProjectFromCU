package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitmeLoginInOneLine {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		String str2="https://demo.actitime.com/login.do";
		driver.get(str2);
		Thread.sleep(2000); 
		//Syntax of First Xpath=//tagname[@attribute='atribute value']
		
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("admin",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);

	}

}
