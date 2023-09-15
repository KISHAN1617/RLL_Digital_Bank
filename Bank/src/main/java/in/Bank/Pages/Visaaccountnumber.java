package in.Bank.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Visaaccountnumber {
	
	@FindBy(xpath="//*[@id=\"extAccount\"]/option[2]")
	private WebElement VISA;
	
	
	public Visaaccountnumber(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clickVISA() {
		VISA.click();
	}
	 
	 

	 

}
