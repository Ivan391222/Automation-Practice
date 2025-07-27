package org.ii.testcase1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class testcase5followUser extends BaseTest {

    @FindBy(id = "defaultLoginFormUsername")
    WebElement username;

    @FindBy(id = "defaultLoginFormPassword")
    WebElement password;

    @FindBy(css = "input[formcontrolname='rememberMe']")
    WebElement rememberMeCheckbox;

    @FindBy(id = "sign-in-button")
    WebElement signInButton;

    @FindBy(linkText = "Lora")
    WebElement userLora;

    @FindBy(css = "button.btn.btn-primary")
    WebElement followButton;

    @FindBy(className = "gallery-item")
    WebElement postItem;

    @FindBy(css = "i.like.fa-heart")
    WebElement heartIcon;

    @BeforeMethod
    public void browserSetup() {
        driver.manage().window().maximize();
        driver.get("http://training.skillo-bg.com:4300/users/login");
        PageFactory.initElements(driver, this);
    }

    @Test
    public void fullTest() throws InterruptedException {

        username.sendKeys("Kon3884");
        password.sendKeys("1mamDv0ikanatestA");
        rememberMeCheckbox.click();
        signInButton.click();
        Thread.sleep(3000);

        userLora.click();
        Thread.sleep(2000);
        followButton.click();
        Thread.sleep(2000);

        postItem.click();
        Thread.sleep(2000);
        heartIcon.click();
        Thread.sleep(2000);

        String heartClass = heartIcon.getAttribute("class");
        Assert.assertTrue(heartClass.contains("fas"), "Post was not liked successfully.");
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        if (result.getStatus() == ITestResult.FAILURE) {
            takeScreenshot(result); // ⬅️ Първо това
        }
        if (driver != null) {
            driver.quit(); // ⬅️ После quit
        }
    }
}
