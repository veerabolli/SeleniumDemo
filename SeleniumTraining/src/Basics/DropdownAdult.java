package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropdownAdult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\abvb163\\Downloads\\SeleniumWork\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText()); //to print the default text value of the drop down field
		System.out.println(driver.getTitle());

		driver.findElement(By.cssSelector("#divpaxinfo")).click(); //click on the Adults drop-down
		

		//while loop to increase Adults count in the drop down		

		int i=1;
		while(i<=5)
			{driver.findElement(By.cssSelector("#hrefIncAdt")).click();
			i++;
			}
		driver.findElement(By.cssSelector("#btnclosepaxoption")).click();  	// click on the 'Done' button
		System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
		driver.close();
	}

}
