package commmmm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		String str="https://www.facebook.com/";
		driver.get(str);
		WebElement signin=driver.findElement(By.xpath("//a[contains(@id,'0_0')]"));
		signin.click();
		Thread.sleep(2000);
		WebElement day=driver.findElement(By.xpath("//select[contains(@id,'day')]"));
		Select s1=new Select(day);
		s1.selectByVisibleText("21");
		Thread.sleep(2000);
		WebElement month=driver.findElement(By.xpath("//select[contains(@id,'month')]"));
		Select s2=new Select(month);
		s2.selectByVisibleText("Apr");
		Thread.sleep(2000);
		WebElement year=driver.findElement(By.xpath("//select[contains(@id,'year')]"));
		Select s3=new Select(year);
		s3.selectByValue("2002");
		
		//WE ARE CHECKING IF DROPDOWN OF DAY IS MULTIPLE DROPDOWN  OR SINGLE DROPDOWN
		Select is_multiple=new Select(day);
		if(is_multiple.isMultiple())
		{
			System.out.println("Multiple");
		}
		else
		{
			System.out.println("Not Multiple");
		}
		

	}

}
