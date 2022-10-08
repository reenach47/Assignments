package ASSIGNMENTS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelements2 {

					WebDriver driver = new ChromeDriver();
		void login() throws InterruptedException {  
			driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
			System.setProperty("webdriver.chrome.driver", "C:\\reena\\chromedriver.exe");
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList");
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
		    Thread.sleep(1000);



}
}
