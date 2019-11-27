package launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	static WebDriver driver;

	public static void launchBrowser(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shiyanz\\eclipse-workspace\\sree\\project\\dri\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}

	public static void type(WebElement loc, String in) {
		loc.sendKeys(in);
	}

	public static void click(WebElement loc) {

		loc.click();
	}

	public static void CloseBrowser() {
		driver.quit();
	}

}
