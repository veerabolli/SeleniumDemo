package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSselectorXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\abvb163\\Downloads\\SeleniumWork\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://login.salesforce.com/?locale=eu");
		System.out.println(driver.getTitle());
		driver.findElement(By.cssSelector("input#username")).sendKeys("Ramarao");	
		driver.findElement(By.cssSelector("input#password")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
	}

}
