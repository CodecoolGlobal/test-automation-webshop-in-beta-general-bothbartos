package com.codecool.component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SideBar extends BaseComponent{

    private final WebElement logOutLink;

    public SideBar(WebElement root) {
        super(root);
        logOutLink = root.findElement(By.id("logout_sidebar_link"));
    }


    public void logOut() {
        logOutLink.click();
    }

}
