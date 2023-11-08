package TASK_ORANGE_HRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//HANDLING DIVISION POPuP
public class ActitimeDelete_Task {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		String str2="https://demo.actitime.com/login.do";
		driver.get(str2);
		Thread.sleep(2000); 
		//Syntax of First Xpath=//tagname[@attribute='atribute value']
		
		WebDriver w1 = new ChromeDriver();
		w1.manage().window().maximize();
		
		w1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		w1.get("https://demo.actitime.com/login.do");
		
		w1.findElement(By.id("username")).sendKeys("admin",Keys.ENTER.TAB,"manager",Keys.ENTER);
		
		
		w1.findElement(By.cssSelector("[id='container_tasks']")).click();
		
		w1.findElement(By.xpath("(//div[@class='img'])[1]")).click();
		
		w1.findElement(By.cssSelector("[class='delete button']")).click();
		
		WebDriverWait wait = new WebDriverWait(w1,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(w1.findElement(By.xpath("//div[contains(text(),'You are about to delete 68 tasks')]"))));
		
		String s1 =  w1.findElement(By.xpath("//div[contains(text(),'You are about to delete')]")).getText();
		System.out.println(s1);
	}

}
