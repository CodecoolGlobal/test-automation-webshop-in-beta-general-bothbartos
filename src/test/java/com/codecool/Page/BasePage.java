package com.codecool.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class BasePage {
    protected WebDriver driver;
    protected FluentWait<WebDriver> wait;

    public BasePage(WebDriver driver, FluentWait<WebDriver> wait) {
        this.driver = driver;
        this.wait = wait;
    }
}
