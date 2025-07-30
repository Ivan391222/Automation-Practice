package org.ii.tests;

import org.ii.pages.LoginPage;
import org.ii.pages.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testcase4loginAndLogout extends BaseTest {

    @Test
    public void loginLogutClose() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateToLogin();
        loginPage.loginWithRememberMe("Kon3884", "1mamDv0ikanatestA");
        Thread.sleep(3000);

        ProfilePage profilePage = new ProfilePage(driver);
        Assert.assertTrue(profilePage.isProfileVisible(), "Профилът не е видим. Вписването неуспешно");

        profilePage.goToProfile();
        Thread.sleep(3000);

        profilePage.logout();
        Thread.sleep(3000);
    }
}










//driver.get("http://training.skillo-bg.com:4300/users/login");
//
//WebElement username = driver.findElement(By.id("defaultLoginFormUsername"));
//        username.click();
//        username.sendKeys("Kon3884");
//
//WebElement password = driver.findElement(By.id("defaultLoginFormPassword"));
//        password.click();
//        password.sendKeys("1mamDv0ikanatestA");
//
//WebElement rememberMeCheckbox = driver.findElement(By.cssSelector("input[formcontrolname='rememberMe']"));
//        rememberMeCheckbox.click();
//
//WebElement signInButton = driver.findElement(By.id("sign-in-button"));
//        signInButton.click();
//        Thread.sleep(3000);
//
//WebElement profileButton = driver.findElement(By.xpath("//a[@id='nav-link-profile']"));
//        Assert.assertTrue(profileButton.isDisplayed(), "Профилът не е видим. Вписването неуспешно");
//        profileButton.click();
//        Thread.sleep(5000);
//
//WebElement logoutIcon = driver.findElement(By.cssSelector("i.fas.fa-sign-out-alt"));
//        logoutIcon.click();
//        Thread.sleep(3000);
//
//WebElement logoutLink = driver.findElement(By.id("nav-link-logout"));
//        Thread.sleep(1000);
//        logoutLink.click();
//        Thread.sleep(1000);