package org.ii.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(id = "defaultLoginFormUsername")
    private WebElement usernameInput;

    @FindBy(id = "defaultLoginFormPassword")
    private WebElement passwordInput;

    @FindBy(css = "input[formcontrolname='rememberMe']")
    private WebElement rememberMeCheckbox;

    @FindBy(id = "sign-in-button")
    private WebElement signInButton;

    @FindBy(linkText = "Lora")
    private WebElement userLoraLink;

    @FindBy(css = "button.btn.btn-primary")
    private WebElement followButton;

    @FindBy(className = "gallery-item")
    private WebElement postItem;

    @FindBy(css = "i.like.fa-heart")
    private WebElement heartIcon;

    public UserPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void openLoginPage() {
        driver.get("http://training.skillo-bg.com:4300/users/login");
        driver.manage().window().maximize();
    }

    public void login(String username, String password) {
        wait.until(ExpectedConditions.visibilityOf(usernameInput)).sendKeys(username);
        passwordInput.sendKeys(password);
        rememberMeCheckbox.click();
        signInButton.click();
    }

    public void clickUserLora() {
        wait.until(ExpectedConditions.elementToBeClickable(userLoraLink)).click();
    }

    public void followUser() {
        wait.until(ExpectedConditions.elementToBeClickable(followButton)).click();
    }

    public void likePost() {
        wait.until(ExpectedConditions.elementToBeClickable(postItem)).click();
        wait.until(ExpectedConditions.elementToBeClickable(heartIcon)).click();
    }

    public boolean isPostLiked() {
        String heartClass = heartIcon.getAttribute("class");
        return heartClass.contains("fas");
    }
}
