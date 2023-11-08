package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class useOf_Relase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		String str="https://selenium08.blogspot.com/2020/01/click-and-hold.html";
		driver.get(str);
		WebElement a=driver.findElement(By.xpath("//li[@name='A']"));
		WebElement b=driver.findElement(By.xpath("//li[@name='B']"));
		Actions act=new Actions(driver);
		act.clickAndHold(b).perform();
		Thread.sleep(2000);
		act.moveToElement(a).perform();
		Thread.sleep(2000);
		act.release().perform();

	}

}
