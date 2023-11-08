package commmmm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect_DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String str1="https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html";
		driver.get(str1);
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='ide']"));
		Select s=new Select(dropdown);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.deselectByIndex(2);
		Thread.sleep(2000);
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByIndex(3);
		Thread.sleep(1000);
		//DESELECTALL()
		s.deselectAll();
		//DESELECTBYVISIBLETEXT()
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.deselectByVisibleText(str1);
		
		

	}

}
