package org.ii.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProfilePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @FindBy(id = "nav-link-profile")
    private WebElement profileButton;

    @FindBy(xpath = "//a[.//i[contains(@class, 'fa-sign-out-alt')]]")
    private WebElement logoutButton;

    public boolean isProfileVisible() {
        return profileButton.isDisplayed();
    }

    public void goToProfile() {
        clickElement(profileButton);
    }

    public void logout() {
        clickElement(logoutButton);
    }

    private void clickElement(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
}