
/*
On ClearTrip check, if One-Way is selected
capture Adults and Childs drop down fields
click on Depart Date and capture current date
Capture Class of Travel and enter Test in the Preferred Airline and click on Search Button
Capture the text on the generated error message
*/
package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentClearTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abvb163\\Downloads\\SeleniumWork\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");

		System.out.println(driver.findElement(By.id("OneWay")).isSelected());

		Select s = new Select(driver.findElement(By.id("Adults")));
		s.selectByValue("4");
		Select s1= new Select(driver.findElement(By.name("childs")));
		s1.selectByValue("2");
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click(); // to select the current populated date
		// driver.findElement(By.linkText("MoreOptionsLink")).click(); // click on MOre Options Hyper Link
		Thread.sleep(2000l);
		driver.findElement(By.cssSelector("i.blue.rArrow")).click();
		driver.findElement(By.xpath("//*[@id=\'AirlineAutocomplete\']")).click();
		driver.findElement(By.xpath("//*[@id=\'AirlineAutocomplete\']")).sendKeys("TEST");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText()); // Print the error message
	}

}
