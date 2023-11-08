package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class useOf_isDisplayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		String str2="https://demo.actitime.com/login.do";
		driver.get(str2);
		WebElement logo = driver.findElement(By.className("atLogoImg"));
		if(logo.isDisplayed())
		{
			System.out.println("Logo is displayed");
		}
		else
		{
			System.out.println("Logo is not displayed");
		}
				
	

	}

}
