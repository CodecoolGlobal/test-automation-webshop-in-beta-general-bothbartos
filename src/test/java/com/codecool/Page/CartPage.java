package com.codecool.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class CartPage extends BasePage{

    @FindBy(id = "continue-shopping")
    private WebElement backToMainPageButton;

    @FindBy(id = "checkout")
    private WebElement checkoutButton;
    @FindBy(id = "first-name")
    private WebElement firstNameField;
    @FindBy(id = "last-name")
    private WebElement lastNameField;
    @FindBy(id = "postal-code")
    private WebElement postalCodeField;
    @FindBy(xpath = "//*[@id=\"checkout_info_container\"]/div/form/div[1]/div[4]/h3")
    private WebElement errorMessageField;

    @FindBy(id = "continue")
    private WebElement continueButton;

    @FindBy(id = "finish")
    private WebElement finishButton;

    @FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/h2")
    private WebElement checkoutCompleteMessage;


    public CartPage(WebDriver driver, FluentWait<WebDriver> wait) {
        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    public void fillOutShippingForm(String firstName, String lastName, String postalCode) {
        wait.until(ExpectedConditions.visibilityOf(checkoutButton)).click();
        wait.until(ExpectedConditions.visibilityOf(firstNameField)).sendKeys(firstName);
        wait.until(ExpectedConditions.visibilityOf(lastNameField)).sendKeys(lastName);
        wait.until(ExpectedConditions.visibilityOf(postalCodeField)).sendKeys(postalCode);
        wait.until(ExpectedConditions.visibilityOf(continueButton)).click();
        wait.until(ExpectedConditions.visibilityOf(finishButton)).click();
    }

    public boolean isCheckoutCompleteMessageDisplayed() {
        return checkoutCompleteMessage.isDisplayed();
    }


}
