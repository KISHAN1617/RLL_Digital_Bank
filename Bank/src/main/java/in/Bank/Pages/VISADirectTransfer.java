package in.Bank.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VISADirectTransfer {
	
	
	@FindBy(css="#visa-transfer-menu-item")
	private WebElement VISADirectTransfers;
	
	
	public VISADirectTransfer(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void clickVISADirectTransfers() {
		VISADirectTransfers.click();
	}
}
