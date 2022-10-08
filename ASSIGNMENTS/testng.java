package ASSIGNMENTS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class testng {
			@Test(priority=2)
			void HrmLogin() throws InterruptedException
			{
				System.setProperty("webdriver.chrome.driver", "C:\\reena\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				driver.manage().window().maximize();
				Thread.sleep(1000);
				driver.findElement(By.name("username")).clear();
				driver.findElement(By.name("username")).sendKeys("Admin");
				driver.findElement(By.name("password")).clear();
				//driver.findElement(By.cssSelector("css=#txtPassword")).sendKeys("Admin");
				driver.findElement(By.name("password")).sendKeys("admin123");
				driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			}
			void leave() {
			}{
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']")).click();
				driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
					}
				{//	WebDriver driver=null;
					WebDriver driver = null;
					driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
					driver.findElement(By.name("txtUsername")).sendKeys("Admin");
					driver.findElement(By.id("txtPassword")).sendKeys("admin123");
					driver.findElement(By.name("Submit")).click();
					driver.findElement(By.linkText("Assign Leave")).click();
					driver.findElement(By.id("assignleave_txtEmployee_empName")).sendKeys("Paul Collings");
					WebElement leaveType=driver.findElement(By.name("assignleave[txtLeaveType]"));
				    Select leave=new Select(leaveType);
				    leave.selectByIndex(2);
				    driver.findElement(By.id("assignleave_txtFromDate")).clear();
				    driver.findElement(By.id("assignleave_txtFromDate")).sendKeys("2022-04-20");
				    driver.findElement(By.id("assignleave_txtToDate")).clear();
				    driver.findElement(By.id("assignleave_txtToDate")).sendKeys("2022-04-20");
				    driver.findElement(By.id("assignBtn")).click();
				}
}
				

			
			
			

		
		
