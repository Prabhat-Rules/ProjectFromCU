package org;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class setSizeUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver=new ChromeDriver();
		String str1 = "https://www.instagram.com/";
		Driver.get(str1);
		Dimension dim=new Dimension(700,1400);//TO USE setsize()method we need to create a constructor of DIMENSION class first and pass the values in that constructor
		Driver.manage().window().setSize(dim);
		
	
	}

}
