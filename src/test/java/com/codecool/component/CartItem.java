package com.codecool.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CartItem extends BaseComponent{
    private WebElement itemName;
    private WebElement itemPrice;


    public CartItem(WebElement root) {
        super(root);
        this.itemName = root.findElement(By.className("inventory_item_name"));
        this.itemPrice = root.findElement(By.className("inventory_item_price"));
    }

    public String getItemName() {
        return itemName.getText();
    }

    public double getItemPrice() {
        return Double.parseDouble(itemPrice.getText().replaceAll("\\$", ""));
    }
}
