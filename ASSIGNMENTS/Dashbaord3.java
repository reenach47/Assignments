package ASSIGNMENTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dashbaord3 {
		public static void main(String[] args) throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "C:\\reena\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	        driver.findElement(By.xpath("//button")).click();
	        driver.findElement(By.xpath("//li[4]")).click();
	        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Paul collings");
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        
	      }

}
