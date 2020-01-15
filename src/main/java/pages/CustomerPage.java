package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomerPage {

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[1]/button[3]")
    WebElement opentCustomerTab;

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/form/div/div/input")
    WebElement search;

    public void getcheckAccount(String fullnameOutput, Boolean success){

    }
}
