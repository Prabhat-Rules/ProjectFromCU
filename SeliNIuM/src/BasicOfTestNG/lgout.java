package BasicOfTestNG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class lgout extends lgin {
	@Test
	public void logo()
	{
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		driver.quit();
	}

}
