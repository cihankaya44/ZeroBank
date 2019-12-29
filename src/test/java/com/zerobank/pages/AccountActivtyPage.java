package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountActivtyPage extends BasePage {

    @FindBy(linkText = "Account Activity")

    public WebElement accountActivityElement;

    public void AccountActivityLinkClick(){
        accountActivityElement.click();
    }

    public void Subtitle(){
        String title = Driver.get().getTitle();
    }

}
