package com.codecool.component;

import org.openqa.selenium.WebElement;

public abstract class BaseComponent {
    WebElement root;

    public BaseComponent(WebElement root) {
        this.root = root;
    }
}