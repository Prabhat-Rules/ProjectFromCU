package locators;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class actitimeUserRegister {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String str2="https://demo.actitime.com/login.do";
		driver.get(str2);
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("admin");
		WebElement pwd=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pwd.sendKeys("manager");
		WebElement login=driver.findElement(By.xpath("//div[text()='Login '] "));
		login.click();
		Thread.sleep(1000);
		WebElement tasks=driver.findElement(By.xpath("//div[@id='container_tasks']"));
		tasks.click();
		WebElement addnew=driver.findElement(By.xpath("//div[@class='addNewButton']"));
		addnew.click();
		Thread.sleep(1000);
		WebElement newcustomer=driver.findElement(By.xpath("//div[@class='item createNewCustomer']"));
		newcustomer.click();
		Thread.sleep(2000);
		WebElement cust_name=driver.findElement(By.className("newNameField"));
		cust_name.sendKeys("San");
		Thread.sleep(2000);
		WebElement created=driver.findElement(By.xpath("//div[text()='Create Customer']"));
		created.click();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/actitime.png");
		FileHandler.copy(src, dest);
		
		

	}

}
