package com.codecool.Test;

import com.codecool.component.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartPageTest extends BaseTest {

    @Test
    void checkoutNoItemsTest(){
        loginPage.login("standard_user", "secret_sauce");
        inventoryPage.clickShoppingCartButton();
        cartPage.fillOutShippingForm("Pista","Lakatos","1234, Valahol, Kossuth u. 69.");
        cartPage.clickFinishButton();
        assertTrue(cartPage.isCheckoutCompleteMessageDisplayed());
    }

    @Test
    void checkoutNoItemsThenLeaveFormEmptyTest(){
        loginPage.login("standard_user", "secret_sauce");
        inventoryPage.clickShoppingCartButton();
        cartPage.fillOutShippingForm("","","");
        assertTrue(cartPage.isErrorMessageSameAsDisplayed("Error: First Name is required"));
    }

    @Test
    void checkoutWithOneItemTest(){
        loginPage.login("standard_user", "secret_sauce");
        Item cartItem = inventoryPage.getItem("Sauce Labs Backpack");
        cartItem.addToCart();
        inventoryPage.clickShoppingCartButton();
        cartPage.fillOutShippingForm("Pista","Lakatos","1234, Valahol, Kossuth u. 69.");
        assertTrue(cartPage.isTotalPriceSame());
        cartPage.clickFinishButton();
        assertTrue(cartPage.isCheckoutCompleteMessageDisplayed());
    }

    @Test
    void checkoutWithTwoItemsTest(){
        loginPage.login("standard_user", "secret_sauce");
        Item cartItem = inventoryPage.getItem("Sauce Labs Backpack");
        Item cartItem2 = inventoryPage.getItem("Sauce Labs Bike Light");
        cartItem.addToCart();
        cartItem2.addToCart();
        inventoryPage.clickShoppingCartButton();
        cartPage.fillOutShippingForm("Pista", "Lakatos","1234, Valahol, Kossuth u. 69.");
        assertTrue(cartPage.isTotalPriceSame());
        cartPage.clickFinishButton();
        assertTrue(cartPage.isCheckoutCompleteMessageDisplayed());
    }

}