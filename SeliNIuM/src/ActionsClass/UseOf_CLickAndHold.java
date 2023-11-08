package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UseOf_CLickAndHold {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			String str="https://selenium08.blogspot.com/2020/01/click-and-hold.html";
			driver.get(str);
			WebElement hold1=driver.findElement(By.xpath("//li[@name='A']"));
			Actions act=new Actions(driver);
			act.clickAndHold(hold1).perform();
			

	}

}
