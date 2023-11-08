package commmmm;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class takeScreenshotOfElement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		String str2="https://demo.actitime.com/login.do";
		driver.get(str2);
		WebElement ts = driver.findElement(By.className("atLogoImg"));
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshot/actim.png");
		FileHandler.copy(src, dest);
		

	}

}
