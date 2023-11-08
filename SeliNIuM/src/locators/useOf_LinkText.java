package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class useOf_LinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String str1="https://demowebshop.tricentis.com/";
		driver.get(str1);
		WebElement Books = driver.findElement(By.linkText("Books"));
		Books.click();

	}

}
