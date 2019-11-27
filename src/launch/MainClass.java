package launch;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MainClass extends BaseClass {
	static locator l;
	static JavascriptExecutor js;

	@BeforeClass
	public void launch() {
		launchBrowser("http://www.adactin.com/HotelApp/");

	}

	@AfterClass
	public void Close() {
		driver.close();

	}

	@Test
	public void test1() {
		l = new locator();
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','sree')", l.getTxtUsername());

	}

	@Test
	public void test2() {
		js.executeScript("arguments[0].setAttribute('value','sree13')", l.getTxtPassword());

	}

	@Test
	public void test3() {
		js.executeScript("arguments[0].click()", l.getBtnlogin());

	}

}
