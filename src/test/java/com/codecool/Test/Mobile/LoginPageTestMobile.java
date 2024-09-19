package com.codecool.Test.Mobile;

import com.codecool.Test.Desktop.BaseTestDesktop;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LoginPageTestMobile extends BaseTestDesktop {
    @ParameterizedTest
    @CsvFileSource(resources = "/usernames.csv", numLinesToSkip = 1)
    void loginWithValidCredentialsTest(String username) {
        loginPage.login(username, "secret_sauce");
        assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
    }

    @Test
    void loginWithInvalidCredentialsTest() {
        loginPage.login("NOT_VALID", "NOT_VALID");
        assertTrue(loginPage.isErrorMessageSameAsDisplayed("Epic sadface: Username and password do not match any user in this service"));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/usernames.csv", numLinesToSkip = 1)
    void loginWithValidCredentialsThenLogout(String username){
        loginPage.login(username, "secret_sauce");
        inventoryPage.logOut();
        assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");
    }


}