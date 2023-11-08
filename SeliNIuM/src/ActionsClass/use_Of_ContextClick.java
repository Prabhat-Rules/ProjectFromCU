package ActionsClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class use_Of_ContextClick {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String str="https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=676742234347&hvpos=&hvnetw=g&hvrand=2478883068490222261&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007801&hvtargid=kwd-10573980&hydadcr=14453_2367553";
		driver.get(str);
		Actions act=new Actions(driver);
		act.contextClick().perform();
		Robot rbt=new Robot();
		for(int i=0;i<10;i++)
		{
			rbt.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(4000);
		}
		rbt.keyPress(KeyEvent.VK_ENTER);
	}

}
