package BasicOfTestNG;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	@Test()
	public void Register()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.className("ico-register")).click();
		driver.findElement(By.xpath("//input[@id='gender-male']"));
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Prabh");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Jha");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rabha204@gmail.com");
		driver.findElement(By.xpath("(//input[@class='text-box single-line password'])[1]")).sendKeys("iam@prabh");
		driver.findElement(By.xpath("(//input[@class='text-box single-line password'])[2]")).sendKeys("iam@prabh");
		
//		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		driver.quit();
	}
	@Test(priority=2)
	public void Login()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rabha2104@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("iam@prabh");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.quit();

	}
	@Test(invocationCount=1,priority=3)
	public void AddToCart()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String str1="https://www.flipkart.com/?s_kwcid=AL!739!3!675380631255!e!!g!!flipkart%27&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gclid=EAIaIQobChMI9rjUypr4gQMVi299Ch2G_Aw_EAAYASAAEgLpT_D_BwE";
		driver.get(str1);
		//FOR CROSS 
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();//clicking cross
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone 14",Keys.ENTER);//typing iphone 14 and then hitting enter button
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']")).click();//clicking on iphone 14
			String Mainwindow_id=driver.getWindowHandle();//storing the main window id
			
			Set<String> AllWindowId = driver.getWindowHandles();//storing the all window ids in a string set
			for(String id:AllWindowId)//using for each loop to traverse each window one by one because we want to switch window with the help of Title(means suppose want to switch to window which contains title as apple so we will try to match all the windows title with their title  
			{
				driver.switchTo().window(id);//we want to 
				//switch the window so we are switching window and then checking the title of that window in which driver is focused(present) and matching that title with our title that we want to switch
				if(driver.getTitle().contains("APPLE iPhone 14 ( 128 GB Storage ) Online at Best Price On Flipkart.com"))//here we are checking the title that means if that we window that we switched contains this title or not
				{
					break;//if contains then we will break because we want to switch on that window and we had used switch method in line number 27
				}
			}
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();//Now we switched the window so we are clicking on add to cart button and then hitting enter 
		driver.switchTo().window(Mainwindow_id);//now we are switching back to main window to perform actions on the main window
		driver.findElement(By.xpath("//span[text()='Cart']")).click();//clicking on cart button(present in a main window)
		driver.quit();
	}
	@Test(priority=4)
	public void Logout()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("rabha2104@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("iam@prabh");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		driver.quit();
	}
	@Test(dependsOnMethods="Login",priority=5)
	public void Logout5()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	}

}
