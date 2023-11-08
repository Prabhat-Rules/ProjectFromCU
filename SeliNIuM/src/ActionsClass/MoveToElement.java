package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String str="https://www.flipkart.com/";
		driver.get(str);
		WebElement cross = driver.findElement(By.xpath("/html/body/div[3]/div/span"));
		cross.click();
		WebElement move_TO_Fashion=driver.findElement(By.xpath("//span[text()='Fashion']"));
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		act.moveToElement(move_TO_Fashion).perform();
//		WebElement move_TO_Aplliances=driver.findElement(By.xpath("//span[text()='Appliances']"));
//		Thread.sleep(2000);
//		act.moveToElement(move_TO_Aplliances).perform();
//		move_TO_Fashion.click();
		
		WebElement menWear=driver.findElement(By.linkText("Men's T-Shirts"));
		Thread.sleep(3000);
		act.moveToElement(menWear).click().perform();

	}

}
