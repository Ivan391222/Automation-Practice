package org.ii.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class testcase4loginAndLogout {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));


    @BeforeMethod
    public void browserSettings() {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

    }

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
