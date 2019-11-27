package launch;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class parent {
	@BeforeClass
	public void launchbrowser() {
		System.out.println("launch");
	}
	@AfterClass
	public void closebrowser() {
		System.out.println("close");
		
	}
		
}
