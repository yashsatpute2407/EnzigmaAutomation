//YASH SATPUTE
package noKodr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class ForgotPasswordTryCatch {

    public static void main(String[] args) throws InterruptedException {
        // Initialize Scanner for user input
        Scanner sc = new Scanner(System.in);
        // Set up ChromeDriver
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);

        
        try {
  
            // Navigate to the noKodr
            driver.get("https://app-staging.nokodr.com/");
            Thread.sleep(2000);

            // Log in to the noKodr
            WebElement email = driver.findElement(By.xpath("(//input[@type=\"email\"])[1]"));
            email.sendKeys("yashsatpute2407@gmail.com");
            WebElement pass = driver.findElement(By.xpath("(//input[@type=\"password\"])[1]"));
            pass.sendKeys("Yash@2022");
            driver.findElement(By.xpath("//div[text()=\"Log In\"]")).click();
            Thread.sleep(2000);

            // Click on "Forgot Password?"
            driver.findElement(By.xpath("//a[text()='Forgot Password?']")).click();
            Thread.sleep(2000);

            // Enter email for password reset
            WebElement email1 = driver.findElement(By.xpath("(//input[@type=\"email\"])[2]"));
            System.out.print("Please enter your email for password reset: ");
            String inputEmail = sc.nextLine();
            email1.sendKeys(inputEmail);
            Thread.sleep(2000);

            // Click to proceed
            driver.findElement(By.xpath("//div[@title=\"Proceed\"]")).click();
            Thread.sleep(2000);

            System.out.println("Password reset request submitted for: " + inputEmail);

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