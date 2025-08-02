package org.ii.tests;

import org.ii.pages.RegistrationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.Assert;

public class testcase3registration extends BaseTest {

    @Test
    public void registration() throws InterruptedException {

        driver.get("http://training.skillo-bg.com:4300/users/login");
        Thread.sleep(1500);

        Assert.assertEquals(driver.getCurrentUrl(), "http://training.skillo-bg.com:4300/users/login");

        WebElement registerButton = driver.findElement(By.linkText("Register"));
        registerButton.click();

        String username = "Kon" + System.currentTimeMillis() % 100000;
        String email = username + "@m.co";
        String password = "1mamDv0ikanatestA";
        String birthDate = "03-03-2002";
        String info = "Bye";

        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.register(username, email, birthDate, password, info);
        Thread.sleep(5000);

        System.out.println(" ");
        System.out.println("Браво, бе, нашия, регистрира си се като пич!");
        System.out.println("Новото ти потребителско име е " + username);
        System.out.println("Новата ти парола е " + password);
        System.out.println("Имейлът ти за вход е " + email);
    }
}