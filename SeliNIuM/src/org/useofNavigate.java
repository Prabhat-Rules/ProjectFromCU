package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class useofNavigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver Driver=new ChromeDriver();
		Driver.manage().window().maximize();
		String str1 = "https://www.instagram.com/";
		String str2="https://www.amazon.in/";
		Navigation nav = Driver.navigate();//this method will return object of type navigation
		//Driver.navigate().to(str1);
		nav.to(str1);
		Thread.sleep(2000);
		//Driver.navigate().to(str2);
		nav.to(str2);
		Thread.sleep(2000);
		//Driver.navigate().back();
		nav.back();//it will take back to previous tab
		Thread.sleep(2000);
		//Driver.navigate().forward();
		nav.forward();//it will take back again to next tab
		//Driver.navigate().refresh();
		nav.refresh();//it will refresh the page
		
		
	}

}
