package TASK_ORANGE_HRM;



import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class actitimeTask {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String str2="https://demo.actitime.com/login.do";
		driver.get(str2);
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[7]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/div[2]/div/div[1]/div/div")).click();
		driver.findElement(By.xpath("//a[text()='Types of Work']")).click();
		driver.findElement(By.xpath("//span[text()='Create Type of Work']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Pragini3");
		Thread.sleep(2000);
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='active']"));
		Thread.sleep(2000);
		Select s=new Select(dropdown);
		s.selectByValue("false");
		driver.findElement(By.xpath("//input[@id='billingType_setBillable']")).click();
		driver.findElement(By.xpath("//input[@id='billingRate_input']")).sendKeys("2000");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@onclick='handleCancel();']")).click();
		Thread.sleep(1000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		TakesScreenshot ss=(TakesScreenshot) driver;
		File src=ss.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/ACTitIME.png");
		FileHandler.copy(src,dest);
	}

}
