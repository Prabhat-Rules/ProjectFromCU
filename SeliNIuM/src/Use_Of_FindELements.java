import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Use_Of_FindELements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		String str1="https://www.flipkart.com/?s_kwcid=AL!739!3!675380631255!e!!g!!flipkart%27&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gclid=EAIaIQobChMI9rjUypr4gQMVi299Ch2G_Aw_EAAYASAAEgLpT_D_BwE";
		driver.get(str1);
		WebElement cross = driver.findElement(By.xpath("/html/body/div[3]/div/span"));
		cross.click();
		WebElement search=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/header/div[1]/div[2]/form/div/div/input"));
		search.sendKeys("iphone14");
		WebElement searchClick=driver.findElement(By.xpath("//button[contains(@class,'iLD')]"));
		searchClick.click();
		 List<WebElement> iphone = driver.findElements(By.xpath("//div[contains(@class,'_4rR01T')]"));
		 //for fetching all the iphone names
		 for(WebElement opt:iphone)
		 {
			 System.out.println(opt.getText());
		 }
		 System.out.println("Price OF  Iphones");
		 //for fetching all the prices
		 List<WebElement> prices=driver.findElements(By.xpath("//div[contains(@class,'_4rR01T')]/../..//div[contains(@class,'_30jeq3 _1_WHN1')]"));
		 for(WebElement opt2:prices)
		 {
			 System.out.println(opt2.getText());
		 }
	}

}
