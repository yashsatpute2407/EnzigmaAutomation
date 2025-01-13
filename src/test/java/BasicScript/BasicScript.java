//Yash Satpute//
package BasicScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScript 
{
	public static void main(String[] args) throws InterruptedException {
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     Thread.sleep(3000);
	     driver.get("https://app-staging.nokodr.com/");
	     
	    }
}
