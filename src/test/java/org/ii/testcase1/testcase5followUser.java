package org.ii.testcase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class testcase5followUser {

    WebDriver driver; //извеждане на driver като нелокална променлива

    @Test
    public void followAnotherUser() throws InterruptedException {
        driver = new ChromeDriver();

        driver.get("http://training.skillo-bg.com:4300/users/login");
        Thread.sleep(1000);

        driver.manage().window().maximize();
        Thread.sleep(1000);

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
        Thread.sleep(5000);

        WebElement userLora = driver.findElement(By.linkText("Lora"));
        userLora.click();
        Thread.sleep(5000);

        WebElement followProfile = driver.findElement(By.cssSelector("button.btn.btn-primary"));
        followProfile.click();
        Thread.sleep(3000);

        WebElement kittyPost = driver.findElement(By.className("gallery-item"));
        kittyPost.click();
        Thread.sleep(3000);

        WebElement sendHeart = driver.findElement(By.cssSelector("i.like.fa-heart"));
        sendHeart.click();
        Thread.sleep(3000);

        String heartClass = sendHeart.getAttribute("class");
        Assert.assertTrue(heartClass.contains("liked"), "Сърцето не е оцветено. Постът не е харесан успешно.");

    }

    @AfterMethod
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
