import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Timeouts;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class useOf_implicitWait  {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		Options opt = driver.manage();
		Timeouts time = opt.timeouts();
		time.implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		//OPTIMIZED WAY::-->>driver.manage().timeout().implicitlyWait(Duration.ofSeconds(20));
		String str2="https://demo.actitime.com/login.do";
		driver.get(str2);
		System.out.println("TITLE BEFORE LOGIN--->>>");
		System.out.println(driver.getTitle());
		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("admin");
		WebElement pwd=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		pwd.sendKeys("manager");
		WebElement login=driver.findElement(By.xpath("//div[text()='Login '] "));
		login.click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("container_tasks"))));
		System.out.println("TITLE AFTER LOGIN--->>>");
		System.out.println(driver.getTitle());
		
		WebElement tasks=driver.findElement(By.xpath("//div[@id='container_tasks']"));
		tasks.click();
		WebElement addnew=driver.findElement(By.xpath("//div[@class='addNewButton']"));
		addnew.click();
		
		WebElement newcustomer=driver.findElement(By.xpath("//div[@class='item createNewCustomer']"));
		newcustomer.click();
		
		WebElement cust_name=driver.findElement(By.className("newNameField"));
		cust_name.sendKeys("San");
		
		WebElement created=driver.findElement(By.xpath("//div[text()='Create Customer']"));
		created.click();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/actitime.png");
		FileHandler.copy(src, dest);
		
		

	}

}
