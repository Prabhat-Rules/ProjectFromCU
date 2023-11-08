package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Use_Of_Submit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		String str1="https://www.flipkart.com/?s_kwcid=AL!739!3!675380631255!e!!g!!flipkart%27&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gclid=EAIaIQobChMI9rjUypr4gQMVi299Ch2G_Aw_EAAYASAAEgLpT_D_BwE";
		driver.get(str1);
		WebElement cross = driver.findElement(By.xpath("/html/body/div[3]/div/span"));
		String TagName=cross.getTagName();//This method will return the tag name of above xPath 
		System.out.println(TagName);
		cross.click();
		WebElement search=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[1]/header/div[1]/div[2]/form/div/div/input"));
		search.sendKeys("iphone14");
		String TagName2=search.getTagName();
		System.out.println(TagName2);
		Thread.sleep(2000);
		search.clear();
		search.sendKeys("samsung s22");
		search.submit();

	}

}
