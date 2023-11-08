package TASK_ORANGE_HRM;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Task5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://selenium08.blogspot.com/2019/11/selenium-iframe.html");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//a[text()='Free Mock Tests'])[2]")).click();
		String mainId=driver.getWindowHandle();
		Set<String> All_Id = driver.getWindowHandles();
		for(String id:All_Id)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().contains("      FreshersNow Test Series | 100% Free Mock Tests     "))
			{
				break;
			}
		}
		WebElement element=driver.findElement(By.xpath("//a[text()='All Exams ']"));
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
		WebElement element2=driver.findElement(By.xpath("(//li[@id='ssc-17'])[1]"));
		act.click(element2).perform();
		driver.findElement(By.xpath("(//a[text()='SSC MTS'])[1]")).click();
//		TakesScreenshot ss=(TakesScreenshot) driver;
//		File src=ss.getScreenshotAs(OutputType.FILE);
//		File dest=new File("./Screenshot/SSC.png");
//		FileHandler.copy(src,dest);
		WebElement ts = driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div[1]/div/ul/li[1]/h1"));
		//html/body/div[1]/div/div/div[2]/div[1]/div/ul/li[1]/h1/../..
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/TASK5.png");
		FileHandler.copy(src, dest);
		

	}

}
