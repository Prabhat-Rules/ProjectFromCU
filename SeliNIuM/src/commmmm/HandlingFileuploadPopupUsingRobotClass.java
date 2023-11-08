package commmmm;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingFileuploadPopupUsingRobotClass {

		// TODO Auto-generated method stub
		public static void main(String[] args) throws InterruptedException, AWTException {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://www.naukri.com/registration/createAccount");
			
			driver.findElement(By.id("name")).sendKeys("Harsh Goel");
			
			driver.findElement(By.id("email")).sendKeys("harshgoel2303@gmail.com");
			
			driver.findElement(By.id("password")).sendKeys("Harsh@1234");
			
			driver.findElement(By.id("mobile")).sendKeys("9813501997");
			
			driver.findElement(By.xpath("(//div[@class=\"textWrap\"])[2]")).click();
			
			driver.findElement(By.xpath("//span[text()='New Delhi']")).click();
		
			driver.findElement(By.className("uploadResume")).click();
			
			StringSelection path = new StringSelection("C:\\Users\\palla\\OneDrive\\Desktop\\PrabhReSUME.pdf");
			
			// copy
			
			Clipboard cp = Toolkit.getDefaultToolkit().getSystemClipboard();
			
			cp.setContents(path, null);
			
			Robot r = new Robot();
			
			Thread.sleep(2000);
			
			// pasting
			
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			
			
			// Enter
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);

			
			
			
			
			
			

	}

}
