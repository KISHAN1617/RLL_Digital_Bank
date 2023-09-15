package in.Bank.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Transferamount {
	
	@FindBy(id="extAmount")
	private WebElement Amount;
	
	public Transferamount(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enterAmount(String i) {
		 Amount.sendKeys(i);

}}
