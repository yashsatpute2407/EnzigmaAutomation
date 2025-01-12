//YASH SATPUTE
package noKodr;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Navigate to URL
		driver.get("https://app-staging.nokodr.com/");
		Thread.sleep(4000);
		driver.close();
	}

}
//YASH SATPUTE