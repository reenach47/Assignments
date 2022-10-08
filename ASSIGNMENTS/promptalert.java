package ASSIGNMENTS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class promptalert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\reena\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://demo.automationtesting.in/Alerts.html");
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		   driver.findElement(By.xpath(" //button[@onclick='promptbox()']")).click();
		   driver.switchTo().alert().sendKeys("reena");
		   driver.switchTo().alert().accept();
		   
	}

}
