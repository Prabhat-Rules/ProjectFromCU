package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class useOfclose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver=new ChromeDriver();
		String str1 = "https://www.instagram.com/";
		String str2="https://www.amazon.in/";
		Driver.get(str1);
		Driver.close();//it will not end task the chrome driver
		
//	
//		Driver.manage().window().fullscreen();
//		Driver.close();

	}

}
