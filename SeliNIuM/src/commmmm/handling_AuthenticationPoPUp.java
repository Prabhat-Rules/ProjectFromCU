package commmmm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_AuthenticationPoPUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
//		SYNTAX-->>Protocol://username:Password@URL
		String str2="http://admin:admin@the-internet.herokuapp.com/basic_auth";
		driver.get(str2);
		

	}

}
