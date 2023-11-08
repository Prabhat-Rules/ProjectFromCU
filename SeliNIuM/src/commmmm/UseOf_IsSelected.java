package commmmm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UseOf_IsSelected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String str1="https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html";
		driver.get(str1);
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='ide']"));
		Select s=new Select(dropdown);
		if(s.isMultiple())
		{
			System.out.println("Yes it is multiple dropdown");
		}
		else
		{
			System.out.println("No, it is not multiple dropdown");
		}
	}

}
