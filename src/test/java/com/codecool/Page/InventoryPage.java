package com.codecool.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.FluentWait;

public class MainPage extends BasePage{

    public MainPage(WebDriver driver, FluentWait<WebDriver> fluentWait) {
        super(driver, fluentWait);
    }

    @FindBy(id="react-burger-menu-btn")
    private WebElement menuBtn;

    @FindBy(id="react-burger-menu-btn")
    private WebElement cart;

}
