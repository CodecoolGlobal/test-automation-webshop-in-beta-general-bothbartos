package com.codecool.Page;

import com.codecool.component.CartItem;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.List;

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

    @FindBy(className = "cart_item")
    private List<WebElement> cartItems;

    @FindBy(className = "summary_subtotal_label")
    private WebElement subtotalLabel;

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
    }

    public boolean isCheckoutCompleteMessageDisplayed() {
        return checkoutCompleteMessage.isDisplayed();
    }

    public boolean isErrorMessageSameAsDisplayed(String errorMessage) {
        return wait.until(ExpectedConditions.visibilityOf(errorMessageField)).getText().equals(errorMessage);
    }

    public void clickFinishButton() {
        wait.until(ExpectedConditions.visibilityOf(finishButton)).click();
    }

    public List<CartItem> getCartItems() {
        return cartItems.stream()
                .map(CartItem::new)
                .toList();
    }

    public double calculateTotalPrice() {
        return getCartItems().stream().mapToDouble(CartItem::getItemPrice).sum();
    }

    public double pageCalculatedTotalPrice() {
        return Double.parseDouble(wait.until(ExpectedConditions.visibilityOf(subtotalLabel))
                .getText().replaceAll("[a-zA-Z$:]", ""));
    }

    public boolean isTotalPriceSame(double expectedTotalPrice){
        double calculatedTotalPrice = pageCalculatedTotalPrice();
        return expectedTotalPrice == calculatedTotalPrice;
    }

    public boolean isTotalPriceSame(){
        double calculatedTotalPrice = pageCalculatedTotalPrice();
        double expectedTotalPrice = calculateTotalPrice();
        return expectedTotalPrice == calculatedTotalPrice;
    }
}
