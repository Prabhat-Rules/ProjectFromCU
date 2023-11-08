package org;
import java.util.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class sample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice");
		int x=sc.nextInt();
		String url="https://www.instagram.com/";
		switch(x)
		{
		case 1:{
			System.out.println("Starting Chrome");
			//ChromeDriver driver=new ChromeDriver();
			WebDriver ch=new ChromeDriver();
			ch.get(url);
			break;
			
		}
		case 2:{
			System.out.println("Starting FireFox");
			//FirefoxDriver FD=new FirefoxDriver();
			WebDriver FD=new FirefoxDriver();
			break;
			
		}
		case 3:{
			System.out.println("Starting Edge");
			//EdgeDriver ED=new EdgeDriver();
			WebDriver ED=new EdgeDriver();
			break;
			
		}
		default:{
			System.out.println("Sorry");
		}
		
		
		}

	}

}
