package commmmm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingiframeUsingswitchtoWebElemnt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/palla/AppData/Local/Microsoft/Windows/INetCache/IE/J9Q4BK7M/iframe[1].html");
		WebElement elem=driver.findElement(By.xpath("//iframe[@src='https://demowebshop.tricentis.com']"));
		driver.switchTo().frame(elem);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		//driver.switchTo().defaultContent();//now switching back to main page again (IT will direct switch to main page no matter in which frame driver is focussing 
		driver.switchTo().parentFrame();//It will switch to immediate parent 
		driver.findElement(By.xpath("//a[text()='Google']")).click();

	}

}
