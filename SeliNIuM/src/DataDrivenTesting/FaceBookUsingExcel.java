package DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FaceBookUsingExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fs=new FileInputStream("C:\\Users\\palla\\OneDrive\\Documents\\fb.xlsx");
		Workbook book = WorkbookFactory.create(fs);
		Sheet sheets=	book.getSheet("sheet1");
		Row row = sheets.getRow(0);
		Cell cell = row.getCell(
				0);
		Cell cell1=row.getCell(1);
		Cell cell2=row.getCell(2);
		Cell cell3=row.getCell(3);
		System.out.println(cell3);
		Cell cell4=row.getCell(4);
		Cell cell5=row.getCell(5);
		Cell cell6=row.getCell(6);
		Cell cell7=row.getCell(7);
		String url=cell.getStringCellValue();
		System.out.println(url);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(cell.getStringCellValue());
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		driver.findElement(By.name("firstname")).sendKeys(cell1.getStringCellValue());
		driver.findElement(By.name("lastname")).sendKeys(cell2.getStringCellValue());
		driver.findElement(By.name("reg_email__")).sendKeys(cell3.getStringCellValue());
		driver.findElement(By.id("password_step_input")).sendKeys(cell4.getStringCellValue());
		
		WebElement dropdown = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		 Select s1=new Select(dropdown);
		 s1.selectByVisibleText(cell5.getStringCellValue());
		 
		 WebElement dropdown2 = driver.findElement(By.xpath("//select[@aria-label='Month']")) ;
		 Select s2=new Select(dropdown2);
		 s2.selectByVisibleText(cell6.getStringCellValue());
		 
		 WebElement dropdown3 = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		 Select s3=new Select(dropdown3);
		 s3.selectByVisibleText(cell7.getStringCellValue());
		 
		 driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
		 
		
		
		
	}

}
