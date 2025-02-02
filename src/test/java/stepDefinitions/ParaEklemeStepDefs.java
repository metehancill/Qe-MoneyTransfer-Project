package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TransferPage;

public class ParaEklemeStepDefs {

    TransferPage transferPage = new TransferPage();

    @When("Add Money butonuna tıklanır")
    public void add_money_butonuna_tıklanır() {
        transferPage.buttons.addMoneyButton.click();
    }

    @And("Card Number inputu girilir")
    public void card_number_inputu_girilir() {
        transferPage.buttons.cardNumberInput.click();
        transferPage.buttons.cardNumberInput.sendKeys("1234123412341234");
    }

    @And("Card Holder inputu girilir")
    public void card_holder_inputu_girilir() {
        transferPage.buttons.cardHolderInput.click();
        transferPage.buttons.cardHolderInput.sendKeys("Metehan Çil");
    }

    @And("Expiry Date inputu girilir")
    public void expiry_date_inputu_girilir() {
        transferPage.buttons.expiryDateInput.click();
        transferPage.buttons.expiryDateInput.sendKeys("1026");
    }

    @And("CVV inputu girilir")
    public void cvv_inputu_girilir() {
        transferPage.buttons.cvvInput.click();
        transferPage.buttons.cvvInput.sendKeys("110");
    }

    @And("Amount inputuna tutar girilir")
    public void amount_inputuna_tutar_girilir() {
        transferPage.buttons.amountInput.click();
        transferPage.buttons.amountInput.sendKeys("1000");
    }

    @Then("Add butonuna tıklanır")
    public void add_butonuna_tıklanır() {
        transferPage.buttons.addButton.click();
    }
}