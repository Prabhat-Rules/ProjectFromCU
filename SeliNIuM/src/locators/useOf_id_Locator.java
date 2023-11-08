package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class useOf_id_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//String str1="https://demowebshop.tricentis.com/";
		String str2="https://demo.actitime.com/login.do";
		driver.get(str2);
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));//this will return the location of web element and that element adress is stored in searchbox
		searchbox.sendKeys("mobiles");//with the helpof that adress we will write our own value in the searchbox
		WebElement searchbox2=driver.findElement(By.id("nav-search-submit-button"));
		searchbox2.click();//this method will help to click the search button after writting mobiles
	}

}
