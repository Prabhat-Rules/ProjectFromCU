package commmmm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingDropDown_usingSelectByVisibleText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String str1="https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html";
		driver.get(str1);
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='course']"));
		Select s=new Select(dropdown);
		s.selectByVisibleText("Java");
		
		
		//SELECTING TWO VALUE 
		Thread.sleep(2000);
		s.selectByValue("js");
		Thread.sleep(2000);
		s.selectByValue("net");
		
		
		

	}

}
