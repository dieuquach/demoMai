package tests;

import org.openqa.selenium.support.PageFactory;
import pages.*;
import runner.TestRunner;

public class PageProvider {
    private static CustomerLoginPage customerLoginPage;
    private static CustomerDepositPage customerDepositPage;
    private static AddCustomerPage addCustomerPage;
    private static OpenAccountPage openAccountPage;
    private static CommonPage commonPage;
    private static CustomerPage customerPage;


    public static CustomerLoginPage getcustomerLoginPage() {
        if (customerLoginPage == null) {
            customerLoginPage = PageFactory.initElements(TestRunner.driver, CustomerLoginPage.class);
        }
        return customerLoginPage;
    }

    public static CustomerDepositPage getcustomerDepositPage() {
        if (customerDepositPage == null) {
            customerDepositPage = PageFactory.initElements(TestRunner.driver, CustomerDepositPage.class);
        }
        return customerDepositPage;
    }

    public static AddCustomerPage getAddCustomerPage() {
        if (addCustomerPage == null) {
            addCustomerPage = PageFactory.initElements(TestRunner.driver, AddCustomerPage.class);
        }
        return addCustomerPage;
    }


    public static OpenAccountPage getOpenAccountPage() {
        if (openAccountPage == null) {
            openAccountPage = PageFactory.initElements(TestRunner.driver, OpenAccountPage.class);
        }
        return openAccountPage;
    }


    public static CommonPage getCommonPage() {
        if (commonPage == null) {
            commonPage = PageFactory.initElements(TestRunner.driver, CommonPage.class);
        }
        return commonPage;
    }

    public static CustomerPage getCustomerPage(){
        if (customerPage == null) {
            customerPage = PageFactory.initElements(TestRunner.driver, CustomerPage.class);
        }
        return customerPage;
    }
}
