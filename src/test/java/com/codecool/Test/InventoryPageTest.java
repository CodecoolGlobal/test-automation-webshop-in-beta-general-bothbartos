package com.codecool.Test;

import com.codecool.Page.InventoryPage;

import com.codecool.Page.LoginPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryPageTest extends BaseTest {


    @Test
    public void userCanSeeItems() {
        InventoryPage inventoryPage = loginPage.login("standard_user", "secret_sauce");
        assertFalse(inventoryPage.getItems().isEmpty());
    }

    @Test
    public void sortPageZToATest(){
        InventoryPage inventoryPage = loginPage.login("standard_user", "secret_sauce");
        inventoryPage.sortPageBy("za");
        assertFalse(inventoryPage.isPageSortedAToZ());
    }

    @Test
    public void sortPageLowToHigh(){
        InventoryPage inventoryPage = loginPage.login("standard_user", "secret_sauce");
        inventoryPage.sortPageBy("lohi");
        assertTrue(inventoryPage.isPageSortedLowToHighPrice());
    }

    @Test
    public void logOut(){
        loginPage.login("standard_user", "secret_sauce").logOut();
        assertEquals(driver.findElement(By.id("login-button")).getAttribute("value"), "Login");
    }
}
