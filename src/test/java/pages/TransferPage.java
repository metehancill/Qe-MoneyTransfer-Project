package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TransferPage {

    public TransferPage() {
        PageFactory.initElements(Driver.getDriver(), this);
        PageFactory.initElements(Driver.getDriver(), buttons);

    }

    public Buttons buttons = new Buttons();

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordInput;


    public static class Buttons {
        @FindBy(xpath = "//div[@class='css-146c3p1 r-jwli3a r-1b43r93']")
        public WebElement multiUseButton;

        @FindBy(xpath = "//div[@class='css-146c3p1 r-jwli3a r-1b43r93' and text()='Edit account']")
        public WebElement editAccountButton;

        @FindBy(xpath = "//div[@class='css-146c3p1 r-jwli3a r-1b43r93' and text()='Transfer money']")
        public WebElement transferMoneyButton;

        @FindBy(xpath = "//div[@class='css-146c3p1 r-jwli3a r-1b43r93' and text()='Add money']")
        public WebElement addMoneyButton;

        @FindBy(xpath = "(//input[@class=\"css-11aywtz r-6taxm2 r-1eh6qqt r-z2wwpe r-rs99b7 r-h3s6tt r-1qhn6m8\"])[1]")
        public WebElement accountNameInput;

        @FindBy(xpath = "//div[@class='css-146c3p1 r-jwli3a r-1b43r93' and text()='UPDATE']")
        public WebElement editAccountUpdateButton;

        @FindBy(xpath = "(//input[contains(@class, 'css-11aywtz')])[1]")
        public WebElement cardNumberInput;

        @FindBy(xpath = "(//input[contains(@class, 'css-11aywtz')])[2]")
        public WebElement cardHolderInput;

        @FindBy(xpath = "(//input[contains(@class, 'css-11aywtz')])[3]")
        public WebElement expiryDateInput;

        @FindBy(xpath = "(//input[contains(@class, 'css-11aywtz')])[4]")
        public WebElement cvvInput;

        @FindBy(xpath = "(//input[contains(@class, 'css-11aywtz')])[5]")
        public WebElement amountInput;

        @FindBy(xpath = "//div[@class='css-146c3p1 r-jwli3a r-1b43r93' and text()='Add']")
        public WebElement addButton;

        @FindBy(xpath = "//input[@class='css-11aywtz r-6taxm2 r-1eh6qqt r-z2wwpe r-rs99b7 r-h3s6tt r-1qhn6m8']")
        public WebElement transferMoneyAmountButton;

        @FindBy(xpath = "//select/option[@value='528e70c4-381b-4331-9955-e77a9bf72660']")
        public WebElement receiverAccountSelect;

        @FindBy(xpath = "//div[@class='css-146c3p1 r-jwli3a r-1b43r93' and text()='Send']")
        public WebElement transferMoneySendButton;

    }
}
