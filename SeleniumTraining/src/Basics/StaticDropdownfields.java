package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdownfields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\abvb163\\Downloads\\SeleniumWork\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.get("https://spicejet.com");
		
		// use SELECT Class for Static drop down fields which starts with tag:select and import UI
		Select s= new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByValue("AED"); // select the drop down field using 'value'
		s.selectByIndex(3);  	//select the value by Index.Index starts from Zero
		s.selectByVisibleText("INR");
	}

}
