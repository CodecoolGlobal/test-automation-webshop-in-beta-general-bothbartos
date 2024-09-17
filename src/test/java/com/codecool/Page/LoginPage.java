package com.codecool.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
    @FindBy(xpath = "//button[text()='Open Menu']")
    private WebElement openHamburgerMenuButton;
    @FindBy(className = "shopping_cart_link")
    private WebElement shoppingCartButton;

    public LoginPage(WebDriver driver, FluentWait<WebDriver> wait) {
        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password) {
        wait.until(ExpectedConditions.visibilityOf(usernameField)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOf(passwordField)).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    public boolean isErrorMessageSameAsDisplayed(String message) {
        return errorMessage.getText().equals(message);
    }

    public void logout(){
        wait.until(ExpectedConditions.visibilityOf(openHamburgerMenuButton)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Logout']"))).click();
    }

    public void clickShoppingCartButton() {
        wait.until(ExpectedConditions.elementToBeClickable(shoppingCartButton)).click();
    }

}
