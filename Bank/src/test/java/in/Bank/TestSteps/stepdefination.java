package in.Bank.TestSteps;
import static org.testng.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.Reporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefination extends Driver {

    @Given("is user on Landing Page")
    public void is_user_on_landing_page() throws InterruptedException {
        w.enterUsername("Dio@gmail.com");
        w.enterPassword("Dio@1234");
        w.clickSignIn();
        String expectedErrMsg = "Welcome Dio";
        String actualErrmsg = k.verify3();
        System.out.println(expectedErrMsg);
        System.out.println(actualErrmsg);
        Assert.assertEquals(actualErrmsg, expectedErrMsg);
        logger.info("Login successfully");
    }

    @When("he clicks on the VISA Direct Transfer")
    public void he_clicks_on_the_visa_direct_transfer() throws InterruptedException {
        Thread.sleep(100);
        z.clickVISADirectTransfers();
        logger.info("VISA Direct Transfer opened");
    }

    @When("he select a VISA Account Number")
    public void he_select_a_visa_account_number() {
        y.clickVISA();
        logger.info("Account number added successfully");
    }

    @When("he enter the transfer Amount")
    public void he_enter_the_transfer_amount() {
        transferPage.enterAmount("100");
        logger.info("Added the transfer amount successfully");
    }

    @Then("click Submit to VISA successfully.")
    public void click_submit_to_visa_successfully() throws IOException {
        l.enterSubmit();
       // String expectedErrMsg = "Verify VISA Transfer Submit successfully";
       // String actualErrmsg = k.verify2();
       // System.out.println(expectedErrMsg);
        //System.out.println(actualErrmsg);
        try {
		    assertTrue(driver.getTitle().equals("Verify VISA Transfer Submit successfully"));
		    logger.info("User Sees welcome message");
		} catch (AssertionError e) {
		    String screenshotPath = takeScreenshot();
		    Reporter.log( screenshotPath);
		    throw e;
		}

	}

	// Add a method to capture a screenshot
	public String takeScreenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		String path = "C:\\Users\\User\\Pictures\\Screenshots\\myscreenshot_" + System.currentTimeMillis() + ".png";

		File target = new File(path);
		FileUtils.copyFile(source, target);
		String targetPath = target.getAbsolutePath();
		return targetPath;
	}
}

