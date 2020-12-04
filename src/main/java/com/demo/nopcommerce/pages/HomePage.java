package com.demo.nopcommerce.pages;

import com.demo.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

/**
 * Created by Jay
 */
public class HomePage extends Utility {

    By loginLink = By.linkText("Log in");
    By registerLink = By.xpath("//a[@class='ico-register']");

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
    }

    public void clickOnRegisterLink() {
        clickOnElement(registerLink);
    }
}
