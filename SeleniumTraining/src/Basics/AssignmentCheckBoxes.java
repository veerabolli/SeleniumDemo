package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class AssignmentCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","C:\\Users\\abvb163\\Downloads\\SeleniumWork\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("http://qaclickacademy.com/practice.php");
		Thread.sleep(2000);
		System.out.println(d.getCurrentUrl());
		
		/* Normal code
	
		System.out.println(d.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		d.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		System.out.println(d.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		d.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		System.out.println(d.findElement(By.cssSelector("input[id='checkBoxOption1']")).isSelected());
		System.out.println(d.findElements(By.cssSelector("input[type='checkbox']")).size());
		*/
		
		// Using Assertions
		
		Assert.assertFalse(d.findElement(By.cssSelector("input[value='option1']")).isSelected()); //continue if the check box is not selected
		d.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		Assert.assertTrue(d.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		d.findElement(By.cssSelector("input[id='checkBoxOption1']")).click();
		Assert.assertFalse(d.findElement(By.cssSelector("input[value='option1']")).isSelected());
		System.out.println("The Size of check boxes on the web page is: " + d.findElements(By.cssSelector("input[type='checkbox']")).size());
		System.out.println("passed");
	}

}
