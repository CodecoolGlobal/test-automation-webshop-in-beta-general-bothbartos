package com.codecool.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;

public class LoginPage extends BasePage{

    @FindBy(id = "user-name")
    private WebElement usernameField;
    @FindBy(id = "password")
    private WebElement passwordField;
    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/div[3]")
    private WebElement errorMessage;
    @FindBy(id = "login-button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver, FluentWait<WebDriver> fluentWait) {
        super(driver, fluentWait);
    }
}
