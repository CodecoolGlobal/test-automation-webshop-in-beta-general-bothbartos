package com.codecool.Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CartPageTest extends BaseTest {

    @Test
    void checkoutNoItemsTest(){
        loginPage.login("standard_user", "secret_sauce");
        loginPage.clickShoppingCartButton();
        cartPage.fillOutShippingForm("asd","asd","asd");
        assertTrue(cartPage.isCheckoutCompleteMessageDisplayed());
    }

    @Test
    void checkoutNoItemsThen

}