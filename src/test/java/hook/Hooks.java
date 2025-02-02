package hook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.TransferPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.ByteArrayInputStream;

public class Hooks {

    TransferPage transferPage = new TransferPage();

    @Before
    public void setUp() {
        Driver.getDriver().get(ConfigReader.getProperty("transferPageURL"));
        transferPage.usernameInput.sendKeys("metehan.cil");
        transferPage.passwordInput.sendKeys("Busem0311");
        ReusableMethods.waitFor(1);
        transferPage.buttons.multiUseButton.click();
        ReusableMethods.waitFor(1);
        transferPage.buttons.multiUseButton.click();
    }

    @After
    public void tearDown(Scenario scenario) {
        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png", "Screenshot - " + scenario.getName());

            Allure.addAttachment("Failure Screenshot - " + scenario.getName(), "image/png", new ByteArrayInputStream(screenshot), "png");
        }
        Driver.closeDriver();
    }
}
