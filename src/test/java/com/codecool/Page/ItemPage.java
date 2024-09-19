package com.codecool.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;

public class ItemPage extends BasePage{
    @FindBy(xpath = "//*[@data-test='inventory-item-name']")
    private WebElement itemName;
    @FindBy(xpath = "//*[@data-test='inventory-item-desc']")
    private WebElement itemDescription;
    @FindBy(xpath = "//*[@data-test='inventory-item-price']")
    private WebElement itemPrice;
    @FindBy(xpath = "//*[@data-test='add-to-cart']")
    private WebElement addToCartButton;
    @FindBy(xpath = "//*[@data-test='back-to-products']")
    private WebElement backToProductsButton;

    public ItemPage(WebDriver driver, FluentWait<WebDriver> wait) {
        super(driver, wait);
        PageFactory.initElements(driver, this);
    }

    public String getItemDescription(){
        return itemDescription.getText();
    }

    public double getPrice() {
        return Double.parseDouble(itemPrice.getText().replaceAll("\\$", ""));
    }

    public void clickBackToProductsButton() {
        backToProductsButton.click();
    }
}
