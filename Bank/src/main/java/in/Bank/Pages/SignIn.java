package in.Bank.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	@FindBy(id="username")
	private WebElement Username;
	
	@FindBy(id="password")
	private WebElement Password;
	
	@FindBy(xpath="//*[@id=\"submit\"]")
	private WebElement SIGNIN;
	
	public SignIn(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void enterUsername(String s) {
		 Username.sendKeys(s);
	}
	public void enterPassword(String p) {
		 Password.sendKeys(p);
	}
	public void clickSignIn() {
		 SIGNIN.click();
	}
	
	
	

}
