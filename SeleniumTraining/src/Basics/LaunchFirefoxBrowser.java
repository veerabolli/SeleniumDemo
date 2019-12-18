package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\abvb163\\Downloads\\SeleniumWork\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		WebDriver m =new FirefoxDriver();
		m.get("https://google.co.za");
		System.out.println(m.getTitle());
		System.out.println(m.getCurrentUrl());
		
	}

}
