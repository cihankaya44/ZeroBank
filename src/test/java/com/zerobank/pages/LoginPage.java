package com.zerobank.pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {


    @FindBy(css = "[id = 'signin_button']")
    public WebElement Signin_Button;

    @FindBy(css = "[id = 'user_login']")
    public WebElement UserLogin;

    @FindBy(css = "[id = 'user_password']")
    public WebElement Password;

    @FindBy(css = "[class = 'alert alert-error']")
    public WebElement warningMessage;

    @FindBy(css = "[class = 'alert alert-error']")
    public WebElement invalidPassword;

    @FindBy(css = "[class='alert alert-error']")
    public WebElement invalidUsernameAndPassword;

    public void signinButton(){

        Signin_Button.click();
    }
public void loginwithValidCredantiels(String UserName, String password){
//Signin_Button.click();

UserLogin.sendKeys(UserName);

Password.sendKeys(password, Keys.ENTER);




}


}
