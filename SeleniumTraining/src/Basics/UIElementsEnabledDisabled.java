/* Check if the Round trip radio button is selected
 
 Print default calendar field display status

 If not selected then select the round trip radio button*/

package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UIElementsEnabledDisabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abvb163\\Downloads\\SeleniumWork\\chromedriver_win32\\chromedriver.exe");
		WebDriver s= new ChromeDriver();
		s.manage().window().maximize();
		s.get("https://www.spicejet.com/");
		System.out.println(s.getTitle());
		System.out.println(s.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected()); // Check if the Round trip radio button is selected
		
		//System.out.println(s.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled()); // To check if Return date is enabled. It supposed to be disabled.The script giving result as true which means its selected. 
		// Hence we have to use alternate finding using getAttribute method as per below
		
		// *****  Find out the attribute value that is changed for field enabled/disabled.**** //
		
		
		System.out.println(s.findElement(By.id("Div1")).getAttribute("style")); // Print defaults field display status
		
		s.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); // Click on the 'Round Trip' radio button
		
		System.out.println(s.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).isSelected()); // to check if the radio button 'Round trip' is selected
		
	if (s.findElement(By.id("Div1")).getAttribute("style").contains("1"))
	{
		System.out.println("its enabled");
		Assert.assertTrue(true);
	}
		
	else
	{
		Assert.assertTrue(false);
	}
		
	
		
	}

}
