package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsNameId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\abvb163\\Downloads\\SeleniumWork\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		WebDriver e = new FirefoxDriver();
		e.get("https://za.linkedin.com/");
		System.out.println(e.getTitle());
		e.findElement(By.className("nav__button-secondary")).click();
		System.out.println(e.getTitle());
		e.findElement(By.cssSelector("#username")).sendKeys("01234");
		e.findElement(By.xpath("//*[@id='password']")).sendKeys("test");
		e.findElement(By.cssSelector(".btn__primary--large")).click();
		//e.close();
		/* e.findElement(By.xpath("//*[@id='error-for-password']")).
		 * to validate error message
		 */
	}

}
