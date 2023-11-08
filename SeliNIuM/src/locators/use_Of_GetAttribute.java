package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class use_Of_GetAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		String str2="https://de"
				+ "mo.actitime.com/login.do";
		driver.get(str2);
		WebElement username = driver.findElement(By.name("username"));
		String atrbtvalue=username.getAttribute("placeholder");
		System.out.println(atrbtvalue);

	}

}
