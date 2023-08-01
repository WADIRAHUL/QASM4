package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingEmptyBrowser {
	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		 WebDriver driver =new FirefoxDriver();
		 Thread.sleep(1000);
		 driver.get("https://www.hotstar.com/");
		 Thread.sleep(3000);
		 driver.findElement(By.linkText("Latest & Trending")).click();
		 Thread.sleep(5000);
	}
}
