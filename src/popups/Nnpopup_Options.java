package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Nnpopup_Options {
//PROGRAM TO AVOID NOTIFICATION POPUP IN CHROME USING CHROMEOPTIONS CLASS
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
//		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("nameishemanth105@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Testing@123");
		driver.findElement(By.name("login")).click();
	}
}
