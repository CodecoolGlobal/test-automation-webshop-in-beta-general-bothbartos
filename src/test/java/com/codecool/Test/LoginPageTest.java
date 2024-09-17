package com.codecool.Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LoginPageTest extends BaseTest {
    @Test
    void loginWithValidCredentialsTest() {
        loginPage.login("standard_user", "secret_sauce");
        assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
    }

    @Test
    void loginWithInvalidCredentialsTest() {
        loginPage.login("NOT_VALID", "NOT_VALID");
        assertTrue(loginPage.isErrorMessageSameAsDisplayed("Epic sadface: Username and password do not match any user in this service"));
    }

    @Test
    void loginWithValidCredentialsThenLogout(){
        loginPage.login("standard_user", "secret_sauce");
        loginPage.logout();
        assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");
    }


}