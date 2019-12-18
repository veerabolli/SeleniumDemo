package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownDynamicFields {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abvb163\\Downloads\\SeleniumWork\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click(); // CLICK ON From drop down
		driver.findElement(By.xpath("//a[@value='BLR']")).click(); // select the value From/ Depature drop down
		//driver.findElement(By.xpath("//a[@value='MAA']")).click();  // select the value from To City drop down
		
		
		// parent child relation xpath. Syntax: Parent xpath space childxpath
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		System.out.println(driver.getTitle());
		//To select the current populated date
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active")).click(); 
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date1")).getText());
		
	}

}
