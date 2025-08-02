package org.ii.tests;

import org.ii.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testcase2loginFailed extends BaseTest {

    @Test
    public void loginSkillo() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateToLogin();
        loginPage.login("Ivan.", "pHunkYJ03.");

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("login"), "Потребителят не би трябвало да влезе успешно");
    }
}