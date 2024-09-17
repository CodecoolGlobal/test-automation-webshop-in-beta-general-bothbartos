package com.codecool.Page;

import components.Item;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.List;
import java.util.function.Predicate;

public class InventoryPage extends BasePage {


    @FindBy(id = "react-burger-menu-btn")
    private WebElement menuBtn;

    @FindBy(xpath = "//*[@data-test='shopping-cart-link']")
    private WebElement cart;

    @FindBy(xpath = "//*[@data-test='inventory_item']")
    private List<WebElement> items;

    public InventoryPage(WebDriver driver, FluentWait<WebDriver> fluentWait) {
        super(driver, fluentWait);
        PageFactory.initElements(driver, this);
    }

    public List<Item> getItems() {
        return items.stream()
                .map(Item::new)
                .toList();
    }

    public Item getItem(Predicate<Item> predicate) {
        return getItems().stream()
                .filter(predicate) // Filter by product name or price
                .findFirst()
                .orElseThrow();

    }


}
