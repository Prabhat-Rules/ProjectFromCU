package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class manageMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver = new ChromeDriver();
		Options Man = Driver.manage();// this method will return Option interface which contains a method Window
		Window win = Man.window();// and this method can be accessed with Man variable and returns window INERFACE and contains 5 abstract methods
		String str1 = "https://www.instagram.com/";
		Driver.get(str1);
	//win.maximize();//now this method will maximise the window and launch rhe web application in full screen
		win.fullscreen();//this method will fullscreen the webapp
		System.out.println(win.getPosition());
		System.out.println(win.getSize());
		
		
	
//	THIS IS OPTIMIZED CODE FOR ABOVE CODE	String str1 = "https://www.instagram.com/";
//		Driver.get(str1);
//		Driver.manage().window().fullscreen();
		

	}

}
