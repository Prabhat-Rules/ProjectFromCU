package commmmm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class useOf_GetOptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String str1="https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html";
		driver.get(str1);
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='ide']"));
		Select s=new Select(dropdown);
		List<WebElement> opt = s.getOptions();
		for(WebElement ele:opt)
		{
			System.out.println(ele.getText());
		}

	}

}
