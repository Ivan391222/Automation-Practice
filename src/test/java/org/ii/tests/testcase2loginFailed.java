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
        Thread.sleep(5000);

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("login"), "Потребителят не би трябвало да влезе успешно");


    }
}


















// Когато бях овчарче и овците пасях...

//        String Username = "Ivan.";
//        String Password = "pHunkYJ03.";
//
//        String Username_INPUT_FIELD_CSS = "#defaultLoginFormUsername";
//        String Password_INPUT_FIELD_CSS = "#defaultLoginFormPassword";
//        String Sign_IN_Button_CSS = "#sign-in-button";

//        driver.get("http://training.skillo-bg.com:4300/users/login");
//        Thread.sleep(1000);
//
//        WebElement userName = driver.findElement(By.cssSelector(Username_INPUT_FIELD_CSS));
//        WebElement password = driver.findElement(By.cssSelector(Password_INPUT_FIELD_CSS));
//        WebElement signInButton = driver.findElement(By.cssSelector(Sign_IN_Button_CSS));
//
//        userName.click();
//        Thread.sleep(1000);
//
//        userName.sendKeys(Username);
//        Thread.sleep(1000);
//
//        password.click();
//        Thread.sleep(1000);
//
//        password.sendKeys(Password);
//        Thread.sleep(1000);
//
//        signInButton.click();
//        Thread.sleep(1000);