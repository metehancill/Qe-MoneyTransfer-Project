package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TransferPage;

public class HesapDuzenlemeStepDefs {
    TransferPage transferPage = new TransferPage();

    @When("Edit Account butonuna tıklanır")
    public void edit_account_butonuna_tıklanır() {
        transferPage.buttons.editAccountButton.click();
    }

    @And("Account Name input alanına tıklanır")
    public void account_name_input_alanına_tıklanır() {
        transferPage.buttons.accountNameInput.click();
    }

    @And("Account Name alanı doldurulur")
    public void account_name_alanı_doldurulur() {
        transferPage.buttons.accountNameInput.sendKeys("Mete Çil");
    }

    @And("Account Name alanı numara ile doldurulur")
    public void account_name_alanı_numaraIle_doldurulur() {
        transferPage.buttons.accountNameInput.sendKeys("1234");
    }


    @Then("Update butonuna tıklanır")
    public void update_butonuna_tıklanır() {
        transferPage.buttons.editAccountUpdateButton.click();
    }
}
