package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath_AMAZON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		String st1="https://www.amazon.in/events/greatindianfestival?tag=googmantxtmob96-21&ascsubtag=_k_EAIaIQobChMIgpOmjef5gQMVJwyDAx2DPQMZEAAYASAAEgK5s_D_BwE_k_&gclid=EAIaIQobChMIgpOmjef5gQMVJwyDAx2DPQMZEAAYASAAEgK5s_D_BwE";
		driver.get(st1);
		WebElement search = driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']"));
		search.sendKeys("OnePlus phones");
		WebElement button=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		button.click();
		WebElement name=driver.findElement(By.xpath("//span[text()='OnePlus 11 5G (Titan Black, 8GB RAM, 128GB Storage)']"));
		String NAme=name.getText();
		System.out.println("PHONE NAME IS "+NAme);
		WebElement Price=driver.findElement(By.xpath("//span[text()='OnePlus 11 5G (Titan Black, 8GB RAM, 128GB Storage)']/../../../..//span[text()='56,999']"));
		String Priceandname=Price.getText();
		System.out.println("Price is ====>"+Priceandname);
		}

}
