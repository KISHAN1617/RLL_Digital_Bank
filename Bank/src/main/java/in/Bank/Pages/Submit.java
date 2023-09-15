package in.Bank.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Submit {
	@FindBy(xpath="//*[@id=\"right-panel\"]/div[2]/div/div/div/div/form/div[2]/button")
	private WebElement submit;
	
	public Submit(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void enterSubmit() {
		 submit.click();

}}


