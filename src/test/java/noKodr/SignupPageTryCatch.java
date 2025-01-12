//YASH SATPUTE
package noKodr;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignupPageTryCatch {

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        // Initialize ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        try {
            // Navigate to the signup page
            driver.get("https://app-staging.nokodr.com/");
            Thread.sleep(2000);

            // Click on signup
            driver.findElement(By.xpath("//a[text()='Sign up']")).click();
            Thread.sleep(2000);

            // Enter valid Email address
            WebElement email = driver.findElement(By.xpath("(//input[@type=\"email\"])[2]"));
            Thread.sleep(2000);
            email.sendKeys("yashsatpute2407@gmail.com");

            // Select checkbox
            driver.findElement(By.className("slds-checkbox_faux")).click();

            // Click to proceed
            driver.findElement(By.xpath("//div[text()=\"Proceed\"]")).click();
            Thread.sleep(10000);

            // Check for OTP
            System.out.print("Please enter your OTP: ");
            String otp = sc.next();

            // Validate OTP input
            if (otp.length() != 6 || !otp.matches("\\d+")) {
                System.out.println("Invalid OTP format. Please enter a 6-digit numeric OTP.");
                return; // Exit the program if OTP is invalid
            }

            driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys(otp);
            Thread.sleep(2000);
            driver.findElement(By.xpath("//div[text()=\"Verify Code\"]")).click();
            System.out.println("OTP submitted successfully.");

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