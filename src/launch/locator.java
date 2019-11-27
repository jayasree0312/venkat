package launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.WebElementHandler;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class locator extends BaseClass {
	public locator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id="username")
	private WebElement txtUsername;
	
	@FindBy (name="password")
	private WebElement txtPassword;
	
	@FindBy (id="login")
	private WebElement btnlogin;

	public WebElement getTxtUsername() {
		return txtUsername;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
		
	}

