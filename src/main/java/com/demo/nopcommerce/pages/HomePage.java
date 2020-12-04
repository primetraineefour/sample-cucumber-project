package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Jay
 */
public class HomePage extends Utility {

    @FindBy(linkText = "Log in")
    WebElement _loginLink;

    @FindBy(xpath = "//a[@class='ico-register']")
    WebElement _registerLink;


    public void clickOnLoginLink() {
        clickOnElement(_loginLink);
    }

    public void clickOnRegisterLink() {
        clickOnElement(_registerLink);
    }
}
