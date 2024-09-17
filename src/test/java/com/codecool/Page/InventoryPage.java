package com.codecool.Page;

import com.codecool.component.SideBar;
import com.codecool.component.Item;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;

import java.util.List;
import java.util.function.Predicate;

public class InventoryPage extends BasePage {


    @FindBy(id = "react-burger-menu-btn")
    private WebElement menuBtn;

    @FindBy(xpath = "//*[@data-test='shopping-cart-link']")
    private WebElement cart;

    @FindBy(xpath = "//*[@data-test='inventory-item']")
    private List<WebElement> items;

    public InventoryPage(WebDriver driver, FluentWait<WebDriver> fluentWait) {
        super(driver, fluentWait);
        PageFactory.initElements(driver, this);
    }

    public List<Item> getItems() {
        return items.stream()
                .map(Item::new)
                .toList();
    }

    public Item getItem(Predicate<Item> predicate) throws NoSuchElementException {
        return getItems().stream()
                .filter(predicate)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("No item found matching the provided predicate"));
    }

    public Item getItem(String name) throws NoSuchElementException {
        return getItems().stream()
                .filter(item -> item.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("No item found matching the provided name"));
    }

    public SideBar menu(){
         menuBtn.click();
         return new SideBar(driver.findElement(By.id("menu_button_container")));
    }


    public LoginPage logOut(){
        SideBar sideBar = menu();
        sideBar.logOut();
        return new LoginPage(driver, wait);
    }



}
