package in.Bank.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class verifyerrormessage {
	@FindBy(xpath="//*[@id=\"right-panel\"]/div[1]/div[2]/div/div/ol/li")
	 private WebElement verifying;
	
	@FindBy(xpath="//*[@id=\"right-panel\"]/div[2]/div/div/div/div/div[2]/div/div/span[2]")
	 private WebElement verify;
	
	public verifyerrormessage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public String verify2() {
		 String message= verify.getText();
			return message;
	}
	public String verify3() {
		 String message= verifying.getText();
			return message;
	}


}
