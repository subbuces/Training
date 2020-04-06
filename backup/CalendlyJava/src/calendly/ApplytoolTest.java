package calendly;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.applitools.eyes.Eyes;
import com.applitools.eyes.RectangleSize;

public class ApplytoolTest {
	static WebDriver driver;
	static Eyes eyes;
	String testName;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\user1.CESIT-LAP-0012\\workspace\\RubyTest\\geckodriver.exe");
		WebDriver browser = new FirefoxDriver();
		eyes = new Eyes();
		eyes.setApiKey("bgdu6CiipGD4o8QxzJs9EWXkjL3eoZxsQta102I1Xoq2g110");
		driver = eyes.open(browser, "Calendly login", "Apply test", new RectangleSize(1000, 600));

		String baseUrl = "https://calendly.com/";
		String expectedTitle = "Free Online Appointment Scheduling Software - Calendly";
		String actualTitle = "";
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		browser.wait(3000);
		eyes.checkWindow("Login page");
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}
		browser.findElement(By.xpath("//div/ul/li/a[contains(text(),'Log In')]")).click();
		browser.wait(3000);
		eyes.checkWindow("Login page - Email");
		browser.findElement(By.xpath("//div/ul/li/a[contains(text(),'Log In')]")).click();
		eyes.close();
		driver.close();
	}

}
