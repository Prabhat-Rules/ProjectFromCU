package commmmm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalenderPopUpIRCTC {

		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			//driver.get("https://jqueryui.com/datepicker/");
			driver.get("https://www.irctc.co.in/");
			
			//driver.switchTo().frame(0);
			
			//driver.findElement(By.id("datepicker")).click();
			//driver.findElement(By.id("datepicker")).sendKeys("03/23/2002",Keys.ENTER);
			
			driver.findElement(By.xpath("(//input[@role='searchbox'])[1]")).sendKeys("New Delhi");
			driver.findElement(By.xpath("(//input[@role='searchbox'])[2]")).sendKeys("Borivali");
			
			driver.findElement(By.id("journeyClass")).click();
			
			driver.findElement(By.xpath("(//li[@class='ui-dropdown-item ui-corner-all'])[11]")).click();
			
			
			//Select s1 = new Select(dropdown);
			
			//s1.selectByVisibleText("Sleeper (SL)");
			
			driver.findElement(By.id("jDate")).click();
			
			while(true) {
				
			String month = driver.findElement(By.className("ui-datepicker-month")).getText();
			
			String year = driver.findElement(By.className("ui-datepicker-year")).getText();
			
			if(month.equals("November") && year.equals("2023")) {
				
				driver.findElement(By.xpath("//a[text()='22']")).click();
				break;
				
			}
			 
			else {
				
				driver.findElement(By.className("ui-datepicker-next-icon")).click();
			}
				
			}
			
			driver.findElement(By.xpath("//button[@label='Find Trains']")).click();

	}

}
