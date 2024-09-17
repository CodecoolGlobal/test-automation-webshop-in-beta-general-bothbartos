package com.codecool.component;

import com.codecool.Page.InventoryPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SideBar extends BaseComponent{

    private final WebElement logOutLink;
    private final WebElement allItemsLink;

    public SideBar(WebElement root) {
        super(root);
        logOutLink = root.findElement(By.id("logout_sidebar_link"));
        allItemsLink = root.findElement(By.id("inventory_sidebar_link"));
    }


    public void logOut() {
        logOutLink.click();
    }

    public void allItems() {
        allItemsLink.click();
    }
}
