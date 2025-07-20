package org.ii.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase2loginFailed {

    @Test
    public void loginSkillo() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        String Username = "Ivan.";
        String Password = "pHunkYJ03.";
        //String Login_Page_URL = "http://training.skillo-bg.com:4300/users/login";

        String Username_INPUT_FIELD_CSS = "#defaultLoginFormUsername";
        String Password_INPUT_FIELD_CSS = "#defaultLoginFormPassword";
        String Sign_IN_Button_CSS = "#sign-in-button";

        driver.get("http://training.skillo-bg.com:4300/users/login");
        Thread.sleep(1000);

        WebElement userName = driver.findElement(By.cssSelector(Username_INPUT_FIELD_CSS));
        WebElement password = driver.findElement(By.cssSelector(Password_INPUT_FIELD_CSS));
        WebElement signInButton = driver.findElement(By.cssSelector(Sign_IN_Button_CSS));

        userName.click();
        Thread.sleep(1000);

        userName.sendKeys(Username);
        Thread.sleep(1000);

        password.click();
        Thread.sleep(1000);

        password.sendKeys(Password);
        Thread.sleep(1000);

        signInButton.click();
        Thread.sleep(1000);

    }
}