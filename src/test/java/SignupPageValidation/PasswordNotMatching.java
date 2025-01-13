package SignupPageValidation;

import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PasswordNotMatching {
	public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        
       WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        try {
            
            driver.get("https://app-staging.nokodr.com/");
            Thread.sleep(2000);

            
            driver.findElement(By.xpath("//a[text()='Sign up']")).click();
            Thread.sleep(2000);

            
            WebElement email = driver.findElement(By.xpath("(//input[@type=\"email\"])[2]"));
            Thread.sleep(2000);
            email.sendKeys("yashsatpute2407@gmail.com");

            
            driver.findElement(By.className("slds-checkbox_faux")).click();

           
            driver.findElement(By.xpath("//div[text()=\"Proceed\"]")).click();
            Thread.sleep(10000);

            
            System.out.print("Please enter your OTP: ");
            String otp = sc.next();

           
            if (otp.length() != 6 || !otp.matches("\\d+")) {
                System.out.println("Invalid OTP format. Please enter a 6-digit numeric OTP.");
                return; 
            }

            driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(otp);
            Thread.sleep(3000);
            
            driver.findElement(By.xpath("//div[text()=\"Verify Code\"]")).click();
            System.out.println("OTP submitted successfully.");
            Thread.sleep(5000);
            
            driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Yash");
            Thread.sleep(2000);
          
            driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Satpute");
            Thread.sleep(2000);
           
            driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Yash@2022");
          
            driver.findElement(By.xpath("(//input[@type='password'])[3]")).sendKeys("Yash@123");
            Thread.sleep(2000);
          
            String web =  driver.findElement(By.xpath("//div[text()=' The password and confirmation password do not match ']")).getText();
            System.out.println(web);
            Thread.sleep(3000);
          
            System.out.println(" please enter matching password");
            
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            if (driver != null) {
                
            	
            	driver.quit();
            }
            sc.close();
        }
    }
}
