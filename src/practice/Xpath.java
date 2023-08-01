package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("admin");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		WebElement error = driver.findElement(By.xpath("//span[.='Username or Password is invalid. Please try again.']"));
		if(error.isDisplayed()) {
			driver.findElement(By.id("toPasswordRecoveryPageLink")).click();
		}
		Thread.sleep(5000);
		driver.quit();
	}
}
