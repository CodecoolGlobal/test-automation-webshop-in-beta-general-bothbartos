package com.codecool.Test;

import com.codecool.Page.InventoryPage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryPageTest extends BaseTest {


    @Test
    public void userCanSeeItems() {
        InventoryPage inventoryPage = loginPage.login("standard_user", "secret_sauce");
        assertFalse(inventoryPage.getItems().isEmpty());
    }

    @Test
    public void logOut(){
        InventoryPage inventoryPage = loginPage.login("standard_user", "secret_sauce");
        inventoryPage.logOut();
    }
}
