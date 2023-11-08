package org;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositonUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver=new ChromeDriver();
		String str1 = "https://www.instagram.com/";
		Driver.get(str1);
		Point pos=new Point(69,69);//TO USE setposition()method we need to use Point class first and pass the position valuses in its constructor
		Driver.manage().window().setPosition(pos);
	}

}
