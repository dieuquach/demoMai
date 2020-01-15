package tests;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class customerLoginTest extends PageProvider {

    @When("^I select (.*) in the YourName label$")
    public void select_Customer_Name(String userSelect) throws InterruptedException {
        Thread.sleep(3000);
        getcustomerLoginPage().chooseYourName(userSelect);
    }

    @When("^I click Login button$")
    public void clickLogBtn() throws InterruptedException {
        Thread.sleep(3000);
        getcustomerLoginPage().clickLogBtn();
    }

    @Then("^I verify Harry Potter is already selected in the YourName label")
    public void verify_CusLog(String userSelect) throws InterruptedException {
        Thread.sleep(3000);
        getcustomerLoginPage().verifyAccount(userSelect);
    }
}
