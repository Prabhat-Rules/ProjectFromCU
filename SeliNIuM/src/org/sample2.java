package org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="https://www.instagram.com/";
		WebDriver FD=new FirefoxDriver();
		FD.get(str1);
		System.out.println(FD.getTitle());
		if(FD.getTitle().equals("Instagram"))
		{
			System.out.println("My test case is passed");
		}
		else
		{
			System.out.println("TestCase Failed");
		}

	}

}
