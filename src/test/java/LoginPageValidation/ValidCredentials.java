package LoginPageValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidCredentials {
	public static void main(String[] args) throws InterruptedException {
		String actual_url = "https://app-staging.nokodr.com/";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app-staging.nokodr.com/super/apps/auth/v1/index.html#/login");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("yashsatpute2407@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Yash@2022");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='rememberMe']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@id='staticElement'])[3]")).click();
		Thread.sleep(1000);
		String current_url = driver.getCurrentUrl();
		Thread.sleep(10000);
        if (actual_url!=current_url) {
			System.out.println("Account Login successfully!");
		}
        driver.quit();
	}
}
