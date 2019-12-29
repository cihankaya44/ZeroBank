package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivtyPage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class AccountActivityStep {
    AccountActivtyPage accountActivtyPage = new AccountActivtyPage();

    LoginPage loginPage = new LoginPage();


    @Given("the	user is	logged in")
    public void the_user_is_logged_in() {

        Driver.get().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.wait(3);
        loginPage.signinButton();
        loginPage.loginwithValidCredantiels("username", "password");

    }

    @When("User clicks at the account activity link")
    public void user_clicks_at_the_account_activity_link() {
        accountActivtyPage.AccountActivityLinkClick();

    }

    @Then("the account activity page should be displayed")
    public void the_account_activity_page_should_be_displayed() {

    }

    @Then("page title is {string}")
    public void page_title_is(String string) {
        accountActivtyPage.Subtitle();
        Assert.assertEquals(string, Driver.get().getTitle());
        BrowserUtils.wait(5);
    }
    @When("User clicks at the account activity submodule")
    public void user_clicks_at_the_account_activity_submodule() {

    }

    @When("Option Should be {string}")
    public void option_Should_be(String string) {

    }



}
