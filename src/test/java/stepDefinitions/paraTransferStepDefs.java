package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TransferPage;

public class paraTransferStepDefs {

    TransferPage transferPage = new TransferPage();

    @When("Transfer Money butonuna tıklanır")
    public void transfer_money_butonuna_tıklanır() {
        transferPage.buttons.transferMoneyButton.click();
    }

    @And("Recivier account seçilir")
    public void recivier_account_seçilir() {
        transferPage.buttons.receiverAccountSelect.click();
        transferPage.buttons.receiverAccountSelect.click();
    }

    @And("Transfer amountu girilir")
    public void amount_inputuna_tutar_girilir() {
        transferPage.buttons.transferMoneyAmountButton.click();
        transferPage.buttons.transferMoneyAmountButton.sendKeys("9000");
    }

    @Then("Send butonuna tıklanır")
    public void send_butonuna_tıklanır() {
        transferPage.buttons.transferMoneySendButton.click();
    }
}
