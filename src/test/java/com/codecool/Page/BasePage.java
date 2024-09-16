package com.codecool.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class BasePage {
    protected WebDriver driver;
    protected FluentWait<WebDriver> fluentWait;

    public BasePage(WebDriver driver, FluentWait<WebDriver> fluentWait) {
        this.driver = driver;
        this.fluentWait = fluentWait;
    }
}
