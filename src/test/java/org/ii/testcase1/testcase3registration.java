package org.ii.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testcase3registration {

    @Test
    public void registration() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("http://training.skillo-bg.com:4300/users/login");
        Thread.sleep(1000);

        WebElement registerButton = driver.findElement(By.linkText("Register"));
        registerButton.click();

        //Username
        String username = "Kon" + String.valueOf(System.currentTimeMillis()).substring(9); //GTP Хак
        System.out.println(username); //Да не го забравя
        WebElement userName = driver.findElement(By.cssSelector("input[placeholder='Username']"));
        userName.click();
        userName.sendKeys(username);

        //e-Mail
        String email = username + "@m.co";
        System.out.println(email);
        WebElement eMail = driver.findElement(By.cssSelector("input[placeholder='email']"));
        eMail.click();
        eMail.sendKeys(email);

        //Date of Birth
        WebElement bDay = driver.findElement(By.cssSelector("input[placeholder='Birth date']"));
        bDay.click();
        bDay.sendKeys("03-03-2002");

        //Password
        String password = "1mamDv0ikanatestA";
        WebElement passWord = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        passWord.click();
        passWord.sendKeys(password);

        //Password Confirmation
        WebElement confirmPassword = driver.findElement(By.cssSelector("input[placeholder='Confirm Password']"));
        confirmPassword.click();
        confirmPassword.sendKeys(password);

        //Public Info
        String info = "Bye";
        WebElement publicInfo = driver.findElement(By.cssSelector("textarea[placeholder='Public info']"));
        publicInfo.click();
        publicInfo.sendKeys(info);

        //Sign UP
        WebElement SIGN_UP_BUTTON = driver.findElement(By.id("sign-in-button"));
        SIGN_UP_BUTTON.click();
        //Thread.sleep(3000);

        //driver.quit();

        System.out.println("Браво, бе, нашия, регистрира си се като пич!");
        System.out.println("Новото Ви потребителско име е " + username);
        System.out.println("Новата Ви парола е " + password);
        System.out.println("Имейлът Ви за вход е " + email);
    }
}
