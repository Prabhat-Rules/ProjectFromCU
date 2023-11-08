package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class useOfCSSSelector_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String str2="https://demo.actitime.com/login.do";
		driver.get(str2);
		WebElement username = driver.findElement(By.cssSelector("[placeholder='Username']"));
		username.sendKeys("admin");
		

	}

}
