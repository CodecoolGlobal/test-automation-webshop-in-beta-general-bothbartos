package com.codecool.Test;

import com.codecool.component.Item;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CartPageTest extends BaseTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/usernames.csv", numLinesToSkip = 1)
    void checkoutNoItemsTest(String username){
        loginPage.login(username, "secret_sauce");
        inventoryPage.clickShoppingCartButton();
        cartPage.fillOutShippingForm("Pista","Lakatos","1234, Valahol, Kossuth u. 69.");
        cartPage.clickFinishButton();
        assertTrue(cartPage.isCheckoutCompleteMessageDisplayed());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/usernames.csv", numLinesToSkip = 1)
    void checkoutNoItemsThenLeaveFormEmptyTest(String username){
        loginPage.login(username, "secret_sauce");
        inventoryPage.clickShoppingCartButton();
        cartPage.fillOutShippingForm("","","");
        assertTrue(cartPage.isErrorMessageSameAsDisplayed("Error: First Name is required"));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/usernames.csv", numLinesToSkip = 1)
    void checkoutWithOneItemTest(String username){
        double totalPrice = 0;
        loginPage.login(username, "secret_sauce");
        Item cartItem = inventoryPage.getItem("Sauce Labs Backpack");
        totalPrice += cartItem.addToCart();
        inventoryPage.clickShoppingCartButton();
        cartPage.fillOutShippingForm("Pista","Lakatos","1234, Valahol, Kossuth u. 69.");
        assertTrue(cartPage.isTotalPriceSame(totalPrice));
        cartPage.clickFinishButton();
        assertTrue(cartPage.isCheckoutCompleteMessageDisplayed());
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/usernames.csv", numLinesToSkip = 1)
    void checkoutWithTwoItemsTest(String username){
        double totalPrice = 0;
        loginPage.login(username, "secret_sauce");
        Item cartItem = inventoryPage.getItem("Sauce Labs Backpack");
        Item cartItem2 = inventoryPage.getItem("Sauce Labs Bike Light");
        totalPrice+=cartItem.addToCart();
        totalPrice+=cartItem2.addToCart();
        inventoryPage.clickShoppingCartButton();
        cartPage.fillOutShippingForm("Pista", "Lakatos","1234, Valahol, Kossuth u. 69.");
        assertTrue(cartPage.isTotalPriceSame(totalPrice));
        cartPage.clickFinishButton();
        assertTrue(cartPage.isCheckoutCompleteMessageDisplayed());
    }

}