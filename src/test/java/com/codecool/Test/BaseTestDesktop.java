package com.codecool.Test;

import com.codecool.Page.CartPage;
import com.codecool.Page.InventoryPage;
import com.codecool.Page.ItemPage;
import com.codecool.Page.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v126.emulation.Emulation;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.Optional;

public class BaseTestDesktop {
    protected WebDriver driver;
    protected FluentWait<WebDriver> wait;
    protected LoginPage loginPage;
    protected CartPage cartPage;
    protected InventoryPage inventoryPage;
    protected ItemPage itemPage;

    @BeforeEach
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-search-engine-choice-screen");
        driver = new ChromeDriver(options);
        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        loginPage = new LoginPage(driver, wait);
        cartPage = new CartPage(driver, wait);
        inventoryPage = new InventoryPage(driver, wait);
        itemPage = new ItemPage(driver, wait);

        String deviceMode = System.getProperty("device.mode");

        if ("mobile".equalsIgnoreCase(deviceMode)) {
            DevTools devTools = ((ChromeDriver) driver).getDevTools();
            devTools.createSession();
            devTools.send(Emulation.setDeviceMetricsOverride(
                    390, // Width
                    844, // Height
                    100, // Device scale factor
                    true, // Mobile
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty()
            ));
        } else {
            driver.manage().window().maximize();
        }
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterEach
    public void teardown() {
        driver.quit();
    }

}
