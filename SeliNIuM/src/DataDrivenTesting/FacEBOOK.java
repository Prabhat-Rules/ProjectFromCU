package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacEBOOK {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//u_0_0_Si
		FileInputStream fs=new FileInputStream("C:\\Users\\palla\\OneDrive\\Desktop\\fbdata.properties");
		Properties pobj=new Properties();
		pobj.load(fs);
//		String url=pobj.getProperty("url");
//		String fname=pobj.getProperty("first_name");
//		String lname=pobj.getProperty("last_name");
//		String contact=pobj.getProperty("contact");
//		String pass=pobj.getProperty("pass");
//		String date=pobj.getProperty("date");
//		String month=pobj.getProperty("month");
//		String year=pobj.getProperty("year");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(pobj.getProperty("url"));
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		driver.findElement(By.name("firstname")).sendKeys(pobj.getProperty("first_name"));
		driver.findElement(By.name("lastname")).sendKeys(pobj.getProperty("last_name"));
		driver.findElement(By.name("reg_email__")).sendKeys(pobj.getProperty("contact"));
		driver.findElement(By.id("password_step_input")).sendKeys(pobj.getProperty("pass"));
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		 Select s1=new Select(dropdown);
		 s1.selectByVisibleText(pobj.getProperty("date"));
		 
		 WebElement dropdown2 = driver.findElement(By.xpath("//select[@aria-label='Month']")) ;
		 Select s2=new Select(dropdown2);
		 s2.selectByVisibleText(pobj.getProperty("month"));
		 
		 WebElement dropdown3 = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		 Select s3=new Select(dropdown3);
		 s3.selectByVisibleText(pobj.getProperty("year"));
		 
		 driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
		 
		 
		 
	}

}
