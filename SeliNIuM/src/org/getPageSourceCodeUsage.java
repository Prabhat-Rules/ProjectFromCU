package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getPageSourceCodeUsage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver Driver=new ChromeDriver();
		String str1="https://www.instagram.com/";
		Driver.get(str1);
		System.out.println(Driver.getPageSource());//THIS METHOD WILL GIVE THE SOURCE CODE OF WEB APPLICATIONS

	}

}
