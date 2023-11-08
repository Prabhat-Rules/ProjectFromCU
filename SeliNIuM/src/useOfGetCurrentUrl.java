import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class useOfGetCurrentUrl {

	public static void main(String[] args) {
		WebDriver Driver=new ChromeDriver();
		String str1="https://www.instagram.com/";
		Driver.get(str1);
		String actualUrl=Driver.getCurrentUrl();
		String actualTitle="Instagram";
		String expectedUrl="https://www.instagram.com/";
		String expectedTitle="Instagram";
		System.out.println(actualUrl);
		if(actualUrl.equals(expectedUrl))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		// TODO Auto-generated method stub

	}

}
