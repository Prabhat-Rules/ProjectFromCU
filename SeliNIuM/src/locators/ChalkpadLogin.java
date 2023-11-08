package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChalkpadLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String str1="https://punjab.chitkara.edu.in//Interface/index.php";
		driver.get(str1);
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("2010991299");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("2010991299");
		WebElement login = driver.findElement(By.className("button_send"));
		login.click();

	}

}
