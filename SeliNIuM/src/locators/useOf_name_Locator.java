package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class useOf_name_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		String str2="https://demo.actitime.com/login.do";
		driver.get(str2);
		WebElement check = driver.findElement(By.xpath("//input[@type='checkbox']"));
		check.click();
		if(check.isSelected())
		{
			System.out.println("CheckBox is selected");
		}
		else
		{
			System.out.println("Checkbox is not selected");
		}
		
		
		
	}

}
