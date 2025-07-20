package org.ii.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testcase4loginAndLogout extends BaseTest {

    @Test
    public void loginLogutClose() throws InterruptedException {


        driver.get("http://training.skillo-bg.com:4300/users/login");

        WebElement username = driver.findElement(By.id("defaultLoginFormUsername"));
        username.click();
        username.sendKeys("Kon3884");

        WebElement password = driver.findElement(By.id("defaultLoginFormPassword"));
        password.click();
        password.sendKeys("1mamDv0ikanatestA");

        WebElement rememberMeCheckbox = driver.findElement(By.cssSelector("input[formcontrolname='rememberMe']"));
        rememberMeCheckbox.click();

        WebElement signInButton = driver.findElement(By.id("sign-in-button"));
        signInButton.click();
        Thread.sleep(3000);

        WebElement profileButton = driver.findElement(By.xpath("//a[@id='nav-link-profile']"));
        Assert.assertTrue(profileButton.isDisplayed(), "Профилът не е видим. Вписването неуспешно");
        profileButton.click();
        Thread.sleep(5000);

        WebElement logoutIcon = driver.findElement(By.cssSelector("i.fas.fa-sign-out-alt"));
        logoutIcon.click();
        Thread.sleep(3000);

        WebElement logoutLink = driver.findElement(By.id("nav-link-logout"));
        Thread.sleep(1000);
        logoutLink.click();
        Thread.sleep(1000);



    }
}