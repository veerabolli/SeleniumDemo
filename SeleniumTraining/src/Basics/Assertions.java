
/*Print the default value of Adult drop down text
get the title of the the page
check if the Friends Family check box is selected by Assertions if not select
click on Adult drop down field and select by value
validate the actual Adult text Vs Expected Text using Assertions */



package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assertions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","C:\\Users\\abvb163\\Downloads\\SeleniumWork\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.spicejet.com/");
		
		
		//to print the default text value of the drop down field
		System.out.println("The default Adult text is: " + d.findElement(By.cssSelector("#divpaxinfo")).getText()); 
		System.out.println(d.getTitle());
		//Use Assertions- check if the check box is not selected i.e false
		Assert.assertFalse(d.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).isSelected());
		
		d.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).click();	// click on the check box to select
		//Check if the check box is set to true using Assert.AssertTrue Method
		Assert.assertTrue(d.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).isSelected());	
		d.findElement(By.cssSelector("#divpaxinfo")).click(); //click on the Adults drop-down
		Thread.sleep(2000);
		//Create an object for Select class methods	and choose the value from static drop down
		Select s=new Select(d.findElement(By.cssSelector("#ctl00_mainContent_ddl_Adult")));
		s.selectByValue("6");
		d.findElement(By.cssSelector("#ctl00_mainContent_DropDownListCurrency")).click();; // click on the 'Currency' button
		//To validate the actual vs expected text using AssertEquals
		Assert.assertEquals(d.findElement(By.cssSelector("#divpaxinfo")).getText(), "6 Adult");  
		
		d.close();
		
		
	}

}
