package in.Bank.TestSteps;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import org.testng.Assert;

import io.cucumber.java.After;
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
        String expectedErrMsg = "Verify VISA Transfer Submit successfully";
        String actualErrmsg = k.verify2();
        System.out.println(expectedErrMsg);
        System.out.println(actualErrmsg);
        try {
            Assert.assertEquals(expectedErrMsg, actualErrmsg);
        } catch (AssertionError e) {
            captureScreenshotAndFail(e);
        }
    }

    @After
    public void afterScenario() {
        if (driver != null) {
            driver.quit();
        }
    }

    private void captureScreenshotAndFail(AssertionError e) throws IOException {
        try {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);

            String screenshotPath = "C:\\Users\\User\\Desktop\\Myscreenshots"+System.currentTimeMillis()+".png";
            

            File screenshotFile = new File(screenshotPath + "/screenshot.png");
            FileOutputStream outputStream = new FileOutputStream(screenshotFile);
            outputStream.write(screenshot);
            outputStream.close();
            

            System.out.println("Screenshot saved to: " + screenshotPath);
            // Attach the screenshot to your report here (e.g., using your reporting library)
            // You can also save the screenshot to a file for further analysis
        } catch (WebDriverException ex) {
            System.err.println("Failed to take screenshot: " + ex.getMessage());
        }
        Assert.fail(e.getMessage());
    }
}
