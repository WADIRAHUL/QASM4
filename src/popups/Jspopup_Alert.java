package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Jspopup_Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage() .window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("file:///C:/Users/rahul/Desktop/Property/Alert.html");
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = driver.switchTo().alert();
		
		String expectedAlertText = "Wake Up";
		String actualAlertText = alert.getText();
		
		System.out.println("expectedAlertText: "+expectedAlertText);
		System.out.println("actualAlertText: "+actualAlertText);
		
		if (actualAlertText.equals(expectedAlertText)) {
			System.out.println("Pass:: Alert text is correct");
		} else {
			System.out.println("Fail:: Alert text is Incorrect");
		}
		alert.accept();
		driver.quit();
	}
}
