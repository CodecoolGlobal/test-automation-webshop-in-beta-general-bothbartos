package com.codecool.Test.Mobile;

import com.codecool.Page.CartPage;
import com.codecool.Page.InventoryPage;
import com.codecool.Test.Desktop.BaseTestDesktop;
import com.codecool.component.Item;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryPageTestMobile extends BaseTestDesktop {


    @ParameterizedTest
    @CsvFileSource(resources = "/usernames.csv", numLinesToSkip = 1)
    public void userCanSeeItems(String username) {
        InventoryPage inventoryPage = loginPage.login(username, "secret_sauce");
        assertFalse(inventoryPage.getItems().isEmpty());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/usernames.csv", numLinesToSkip = 1)
    public void sortPageZToATest(String username) {
        InventoryPage inventoryPage = loginPage.login(username, "secret_sauce");
        inventoryPage.sortPageBy("za");
        assertFalse(inventoryPage.isPageSortedAToZ());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/usernames.csv", numLinesToSkip = 1)
    public void sortPageLowToHigh(String username) {
        InventoryPage inventoryPage = loginPage.login(username, "secret_sauce");
        inventoryPage.sortPageBy("lohi");
        assertTrue(inventoryPage.isPageSortedLowToHighPrice());
    }


    @ParameterizedTest
    @CsvFileSource(resources = "/usernames.csv", numLinesToSkip = 1)
    public void isItemAddedToCart() {
        InventoryPage inventoryPage = loginPage.login("standard_user", "secret_sauce");
        Item item = inventoryPage.getItem("Sauce Labs Backpack");
        item.clickButton();
        assertEquals(1, inventoryPage.getBadgeCounter());
        item = inventoryPage.getItem("Sauce Labs Backpack");
        assertEquals("Remove", item.getButtonText());
        CartPage cartPage = inventoryPage.clickShoppingCartButton();
        assertEquals(1, cartPage.getCartItems().size());

    }
}
