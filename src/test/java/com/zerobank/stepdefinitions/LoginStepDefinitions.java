package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();

    @FindBy(css = "[id = 'signin_button']")
    public WebElement Signin_Button;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {

        Driver.get().get(ConfigurationReader.getProperty("url"));


    }

    @Then("User logs in Authorized user")
    public void user_logs_in_Authorized_user() {

//        PageFactory.initElements(Driver.get(), this);
//        Signin_Button.click();
        loginPage.signinButton();

        BrowserUtils.wait(3);
        String userName = ConfigurationReader.getProperty("username");
        String Password = ConfigurationReader.getProperty("password");
        loginPage.loginwithValidCredantiels(userName, Password);


    }

    @Then("Account Summary page should be displayed")
    public void account_Summary_page_should_be_displayed() {
       String pageTitle =  Driver.get().getTitle();
        String exceptedText = "Zero - Account Summary";
        BrowserUtils.wait(5);
        Assert.assertEquals(exceptedText, pageTitle);
    }
    @Then("User enters {string} username and {string} password")
    public void user_enters_username_and_password(String string, String string2) {
        loginPage.signinButton();
        loginPage.loginwithValidCredantiels(string, string2);
        System.out.println("Login with "+ string + "User name " + string2 + " password");

}

    @Then("user verifies that {string} message is displayed")
    public void user_verifies_that_message_is_displayed(String string) {
       String actualResult = loginPage.warningMessage.getText();
        Assert.assertEquals(string, actualResult );
        System.out.println("Warning message "+ string);
    }
    @Then("User enters {string} password and {string} username")
    public void user_enters_password_and_username(String string, String string2) {
        loginPage.signinButton();
        loginPage.loginwithValidCredantiels(string, string2);
        System.out.println("Invalid password "+ string);

    }

    @Then("user verifies that {string}")
    public void user_verifies_that(String string) {
        System.out.println("Invalid username and password "+ string);
    }
    @Then("User enters {string} username and {string} username")
    public void user_enters_username_and_username(String string, String string2) {
        System.out.println("Invalid username: " + string + " and invalid password: " + string2 );

    }





}
