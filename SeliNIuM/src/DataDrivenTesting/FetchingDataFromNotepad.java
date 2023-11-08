package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFromNotepad {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fs = new FileInputStream("C:\\Users\\palla\\OneDrive\\Pictures\\fi.properties");
		Properties pobj=new Properties();
		pobj.load(fs);
		String url=pobj.getProperty("url");
		System.out.println(url);
		
		String username=pobj.getProperty("un");
		System.out.println(username);
		
		String pass=pobj.getProperty("pass");
		System.out.println(pass);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get(url);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username,Keys.TAB,pass,Keys.ENTER);
		
	}
	

}
