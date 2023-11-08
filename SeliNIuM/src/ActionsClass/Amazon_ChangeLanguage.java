package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Amazon_ChangeLanguage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String str="https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=676742234347&hvpos=&hvnetw=g&hvrand=2478883068490222261&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007801&hvtargid=kwd-10573980&hydadcr=14453_2367553";
		driver.get(str);
		WebElement lang=driver.findElement(By.xpath("//div[text()='EN']"));
		Actions act=new Actions(driver);
		act.moveToElement(lang).click().perform();
		
		WebElement lang23=driver.findElement(By.xpath("//*[@id=\"icp-language-settings\"]/div[3]/div/label/i"));
		lang23.click();
		WebElement subm=driver.findElement(By.xpath("//input[@class='a-button-input']"));
		subm.click();
		

	}

}
