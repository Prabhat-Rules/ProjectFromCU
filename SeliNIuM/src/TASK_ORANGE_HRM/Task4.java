package TASK_ORANGE_HRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//GO TO COMMMMM PACKAGE AND OPEN Handling FRames
public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String str1="file:///C:/Users/palla/AppData/Local/Microsoft/Windows/INetCache/IE/J9Q4BK7M/iframe[1].html";
		driver.get(str1);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();

	}

}
