package commmmm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingWindowUsingIdorOrNameAttbtValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/palla/AppData/Local/Microsoft/Windows/INetCache/IE/J9Q4BK7M/iframe[1].html");
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input[@class=\"search-box-text ui-autocomplete-input\"]")).sendKeys("Books",Keys.ENTER);

	}

}
