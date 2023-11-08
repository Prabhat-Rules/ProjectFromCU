package commmmm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingFrameUsingSwitchToFrameByIndex {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("file:///C:/Users/palla/AppData/Local/Microsoft/Windows/INetCache/IE/J9Q4BK7M/iframe[1].html");
		//driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.switchTo().frame(1);
		driver.findElement(By.className("bars")).click();
	}

}