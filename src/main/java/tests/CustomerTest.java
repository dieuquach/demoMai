package tests;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class CustomerTest extends PageProvider{

    @When("^I type some text (.+) into the search box$")
        public void searchTest(String firstname) throws InterruptedException{

    }

    @Then("^I verify the rearch results$")
    public void verifyUserSearch() throws InterruptedException {
        Thread.sleep(3000);
//        getCustomerPage().getcheckAccount();

    }

}
