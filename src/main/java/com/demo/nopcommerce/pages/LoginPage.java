package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by Jay
 */
public class LoginPage extends Utility {

    @FindBy(id = "Email")
    WebElement _emailField;

    @FindBy(id = "Password")
    WebElement _passwordField;

    @FindBy(xpath = "//input[@class='button-1 login-button']")
    WebElement _loginBtn;

    @FindBy(xpath = "//div[@class='page-title']//h1")
    WebElement _welcomeText;

    @FindBy(xpath = "//div[@class='topic-block-title']//h2")
    WebElement _welcomeToStoreText;

    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement _errorMessage;

    public void enterEmailId(String email) {
        sendTextToElement(_emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(_passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(_loginBtn);
    }

    public String getWelcomeText() {
        return getTextFromElement(_welcomeText);

    }

    public String getWelcomeToStoreText() {
        return getTextFromElement(_welcomeToStoreText);

    }

    public String getErrorMessage() {
        return getTextFromElement(_errorMessage);
    }

    public void loginToApplication(String username, String password) {
        enterEmailId(username);
        enterPassword(password);
        clickOnLoginButton();
    }

}
