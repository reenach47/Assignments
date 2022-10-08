package ASSIGNMENTS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\reena\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://demo.automationtesting.in/Alerts.html");
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		WebElement element=  driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		element.click();
		  driver.switchTo().alert().accept();
		 /* WebElement element1=  driver.findElement(By.xpath("//a[@aria-expanded='true']"));
		  element1.click();
		  driver.switchTo().alert().dismiss();
		  WebElement element11=  driver.findElement(By.xpath("//a[@href='#Textbox']"));
		  element11.click();
		  driver.switchTo().alert().sendKeys("ok");*/
	

	}

}
