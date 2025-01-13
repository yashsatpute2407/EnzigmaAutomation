package LoginPageValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IncorrectUserPass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app-staging.nokodr.com/");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("yash#satpute@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("yash@12");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@id='staticElement'])[3]")).click();
		Thread.sleep(1000);
		String web =  driver.findElement(By.xpath("//div[@class='content-margin']/h2")).getText();
	    System.out.println(web);
	}
}
