package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\Users\\abvb163\\Downloads\\SeleniumWork\\chromedriver_win32\\chromedriver.exe"
		  ); WebDriver o = new ChromeDriver();
		  
		  o.get("https://www.google.co.za/"); System.out.println(o.getTitle());
		  System.out.println(o.getCurrentUrl());
		  System.out.println(o.getWindowHandle()); //o.close();
		  System.out.println(o.manage()); // Gets the option interface
		  o.navigate().to("https://www.xe.com/"); // Navigate to new url within the
		  o.navigate().back(); // Navigates to back to the previOus

		 		


		

	}

}
