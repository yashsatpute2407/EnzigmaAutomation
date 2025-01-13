package ForgotPassValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisteredEmail {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app-staging.nokodr.com/");
		driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
		driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys("yashsatpute2407@gmail.com");
		driver.findElement(By.xpath("(//div[@id='staticElement'])[7]")).click();
		Thread.sleep(7000);
		String web =  driver.findElement(By.xpath("//div[@class='content-margin']/h2")).getText();
		if (web!=null) 
		{
			System.out.println(web);
		}
		else
		{
			System.out.println("Please enter valid email");
		}
	}
}
