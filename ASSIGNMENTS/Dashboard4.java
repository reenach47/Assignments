package ASSIGNMENTS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dashboard4 {

			public static void main(String[] args) throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "C:\\reena\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	        driver.findElement(By.xpath("//button")).click();
	        driver.findElement(By.xpath("//li[9]")).click();
	        driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Paul collings");
	        driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).click();
	        driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
	        driver.findElement(By.xpath("//*[contains(text(),'Account Assistant')]")).click();
	        driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div[1]/div[1]")).click();
	        driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
	        driver.findElement(By.xpath("//*[contains(text(),'Canadian Regional HQ')]")).click();
	        driver.findElement(By.xpath("//button[@type='submit']")).click();
	        
	        
		

	}

}
