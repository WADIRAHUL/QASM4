package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DataProvdr7 {
//PROGRAM TO TAKE DATA FROM DIFFERENT CLASS
	@Test(dataProviderClass=DataProvdr6.class, dataProvider = "credentials")
	public void testMultipleLogins(String userData, String passwordData) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys(userData);
		driver.findElement(By.name("pwd")).sendKeys(passwordData);
	}
}
