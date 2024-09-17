package com.codecool.Test;

import com.codecool.Page.InventoryPage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryPageTest extends BaseTest {


    @Test
    public void getItems() {
        InventoryPage inventoryPage = loginPage.login("standard_user", "secret_sauce");
        inventoryPage.getItems();
        assertFalse(inventoryPage.getItems().isEmpty());
    }
}
