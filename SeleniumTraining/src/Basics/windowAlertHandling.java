package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class windowAlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\abvb163\\Downloads\\SeleniumWork\\chromedriver_win32\\chromedriver.exe");
		WebDriver k = new ChromeDriver();
		k.manage().window().maximize();
		String i = "kishore"; // decalre a varible to pass the string as argument
		String j = "Hello World";
		k.get("https://rahulshettyacademy.com/AutomationPractice/");
		k.findElement(By.id("name")).sendKeys(i);
		k.findElement(By.id("alertbtn")).click();
		System.out.println(k.switchTo().alert().getText()); // To print the text on alert
		k.switchTo().alert().accept(); // To accept the window alert

		// Write the script for cancelling the alert
		k.findElement(By.id("name")).sendKeys(j);
		k.findElement(By.id("confirmbtn")).click();
		System.out.println(k.switchTo().alert().getText()); // To print the text on alert
		k.switchTo().alert().dismiss();// To cancel the displayed alert
	}

}
