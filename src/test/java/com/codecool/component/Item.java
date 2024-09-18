package com.codecool.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Item extends BaseComponent {

    private final WebElement itemName;

    private final WebElement itemPrice;

    private final WebElement addToCart;

    public Item(WebElement root) {
        super(root);
        this.itemName = root.findElement(By.xpath(".//*[@data-test='inventory-item-name']"));
        this.itemPrice = root.findElement(By.xpath(".//*[@data-test='inventory-item-price']"));
        this.addToCart = root.findElement(By.xpath(".//*[contains(@data-test, 'add-to-cart')]"));
    }

    public String getName() {
        return itemName.getText();
    }

    public double getPrice() {
        return Double.parseDouble(itemPrice.getText().replaceAll("\\$", ""));
    }

    public double addToCart() {
        addToCart.click();
        return this.getPrice();
    }

}
