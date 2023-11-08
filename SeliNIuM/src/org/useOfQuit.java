package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class useOfQuit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		String str1 = "https://www.instagram.com/";
		driver.get(str1);
		driver.quit();//it will end task the chrome driver method

	}

}
