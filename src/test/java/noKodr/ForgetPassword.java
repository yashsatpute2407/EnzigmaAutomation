//YASH SATPUTE//
package noKodr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgetPassword {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://app-staging.nokodr.com/");
		Thread.sleep(2000);
		WebElement email=driver.findElement(By.xpath("(//input[@type=\"email\"])[1]"));
		Thread.sleep(2000);
		email.sendKeys("yashsatpute2407@gmail.com");
		WebElement pass=driver.findElement(By.xpath("(//input[@type=\"password\"])[1]"));
		Thread.sleep(2000);
		pass.sendKeys("Yash@2022");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"Log In\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
		WebElement email1=driver.findElement(By.xpath("(//input[@type=\"email\"])[2]"));
		Thread.sleep(2000);
		email1.sendKeys("yashsatpute2407@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@title=\"Proceed\"]")).click();
	}	

}
//YASH SATPUTE//
