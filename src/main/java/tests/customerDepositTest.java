package tests;

import cucumber.api.java.en.When;

public class customerDepositTest extends PageProvider {

    @When("^I click DepositTop button$")
    public void clickDepTopBtn() throws InterruptedException {
        Thread.sleep(3000);
        getcustomerDepositPage().clickDepTopBtn();
    }

    @When("^I type Amount to be Deposited as (.*)$")
    public void inputAmount(String userSelect) throws InterruptedException {
        Thread.sleep(3000);
        getcustomerDepositPage().inputAmount();
    }

    @When("^I click DepositBottom button$")
    public void clickDepBottomBtn() throws InterruptedException {
        Thread.sleep(3000);
        getcustomerDepositPage().clickDepBottomBtn();
    }


}
