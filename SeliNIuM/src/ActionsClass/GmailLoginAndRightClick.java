package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GmailLoginAndRightClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		String str1="https://www.google.co.in/";
		driver.get(str1);
		WebElement gmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions act=new Actions(driver);
		act.moveToElement(gmail).perform();
		act.contextClick().perform();
		
		
		
		

	}

}
