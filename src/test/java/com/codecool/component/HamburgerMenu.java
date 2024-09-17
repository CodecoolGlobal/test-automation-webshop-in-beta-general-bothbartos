package com.codecool.component;

import com.codecool.Page.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HamburgerMenu extends BaseComponent{

    private final WebElement logOutLink;
    private final WebElement allItemsLink;

    public HamburgerMenu(WebElement root) {
        super(root);
        logOutLink = root.findElement(By.id("logout_sidebar_link"));
        allItemsLink = root.findElement(By.id("inventory_sidebar_link"));
    }


    private void logOut() {
        logOutLink.click();
    }

    private void allItems() {
        allItemsLink.click();
    }
}
