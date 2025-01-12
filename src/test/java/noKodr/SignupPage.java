//YASH SATPUTE//
package noKodr;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignupPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://app-staging.nokodr.com/");
		Thread.sleep(2000);
		//click on signup
		driver.findElement(By.xpath("//a[text()='Sign up']")).click();
	    Thread.sleep(2000);
	    //Enter valid Email address
		WebElement email=driver.findElement(By.xpath("(//input[@type=\"email\"])[2]"));
		Thread.sleep(2000);
		email.sendKeys("yashsatpute2407@gmail.com");
		//select checkbox
		driver.findElement(By.className("slds-checkbox_faux")).click();
		//click to proceed
		driver.findElement(By.xpath("//div[text()=\"Proceed\"]")).click();
		Thread.sleep(10000);
		
		//Check of OTP
		String otp = sc.next();
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(otp);
		
		//PLEASE ENTER YOUR OTP IN CONSOLE AND PRESS ENTER AND CHECK AGAIN ON WEBSITEE//
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"Verify Code\"]")).click();
		
	}
}
//YASH SATPUTE//
