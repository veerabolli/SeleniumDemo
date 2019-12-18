
/*On Spicejet, Check if the Family and Friend Check Box is selected
Capture the From and To Cities
Select the Check Box
and get the total number of check boxex on the webpage
*/

package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\abvb163\\Downloads\\SeleniumWork\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.spicejet.com/");
		System.out.println(d.getTitle());
		Thread.sleep(2000);
		System.out.println(d.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).isSelected()); //To check if the checkbox is selected
		
		d.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		d.findElement(By.cssSelector("a[text='Delhi (DEL)']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@text='Chennai (MAA)']")).click();
		
		d.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).click();
		System.out.println(d.findElement(By.cssSelector("input[id*='chk_friendsandfamily']")).isSelected());
		System.out.println(d.findElements(By.cssSelector("input[type='checkbox']")).size()); //To get the total number of checkbox elements on the page


	}

}
