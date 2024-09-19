package com.codecool.component;

import com.codecool.Page.ItemPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Item extends BaseComponent {

    private final WebElement itemName;

    private final WebElement itemPrice;

    private final WebElement button;

    private final WebElement description;

    public Item(WebElement root) {
        super(root);
        this.itemName = root.findElement(By.xpath(".//*[@data-test='inventory-item-name']"));
        this.itemPrice = root.findElement(By.xpath(".//*[@data-test='inventory-item-price']"));
        this.button = root.findElement(By.xpath(".//following-sibling::div[@class='pricebar']//button"));
        this.description = root.findElement(By.xpath(".//*[@data-test='inventory-item-desc']"));

    }

    public String getName() {
        return itemName.getText();
    }

    public double getPrice() {
        return Double.parseDouble(itemPrice.getText().replaceAll("\\$", ""));
    }

    public void clickButton() {
        button.click();
    }

    public String getButtonText() {
        return button.getText();
    }

    public double addToCart(){
        button.click();
        return this.getPrice();
    }

    public String getDescription() {
        return description.getText();
    }

    public void openItem() {
        itemName.click();
    }
}
