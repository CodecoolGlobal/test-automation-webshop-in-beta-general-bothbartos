package com.codecool.Test;

import com.codecool.Page.InventoryPage;

import com.codecool.Page.LoginPage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryPageTest extends BaseTest {


    @ParameterizedTest
    @CsvFileSource(resources = "/usernames.csv", numLinesToSkip = 1)
    public void userCanSeeItems(String username) {
        InventoryPage inventoryPage = loginPage.login(username, "secret_sauce");
        assertFalse(inventoryPage.getItems().isEmpty());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/usernames.csv", numLinesToSkip = 1)
    public void sortPageZToATest(String username){
        InventoryPage inventoryPage = loginPage.login(username, "secret_sauce");
        inventoryPage.sortPageBy("za");
        assertFalse(inventoryPage.isPageSortedAToZ());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/usernames.csv", numLinesToSkip = 1)
    public void sortPageLowToHigh(String username){
        InventoryPage inventoryPage = loginPage.login(username, "secret_sauce");
        inventoryPage.sortPageBy("lohi");
        assertTrue(inventoryPage.isPageSortedLowToHighPrice());
    }
}
