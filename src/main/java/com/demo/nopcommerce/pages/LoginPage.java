package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;


/**
 * Created by Jay
 */
public class LoginPage extends Utility {

    By emailField = By.id("Email");
    By passwordField = By.id("Password");
    By loginBtn = By.xpath("//input[@class='button-1 login-button']");
    By welcomeText = By.xpath("//div[@class='page-title']//h1");

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginBtn);
    }

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);

    }

    public void loginToApplication(String username, String password) {
        enterEmailId(username);
        enterPassword(password);
        clickOnLoginButton();
    }


}
