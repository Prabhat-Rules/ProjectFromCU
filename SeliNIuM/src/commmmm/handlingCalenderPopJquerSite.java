package commmmm;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class handlingCalenderPopJquerSite {

		// TODO Auto-generated method stub

	
			
			public static void main(String[] args) {
				
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.get("https://jqueryui.com/datepicker/");
				
				driver.switchTo().frame(0);
				
				driver.findElement(By.id("datepicker")).click();
				
				while(true)
				{
					String month = driver.findElement(By.className("ui-datepicker-month")).getText();
					String year = driver.findElement(By.className("ui-datepicker-year")).getText();
					if(month.equals("May")&&year.equals("2002"))
					{
						driver.findElement(By.xpath("//a[text()='15']")).click();
						break;
					}
					else
					{
						driver.findElement(By.xpath("//span[text()='Prev']")).click();
					}
				}
				
			}

		}


