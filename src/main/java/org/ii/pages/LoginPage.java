package org.ii.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
        private WebDriver driver;

        @FindBy(id = "defaultLoginFormUsername")
        private WebElement usernameInput;

        @FindBy(id = "defaultLoginFormPassword")
        private WebElement passwordInput;

        @FindBy(id = "sign-in-button")
        private WebElement loginButton;

        @FindBy(css = "input[formcontrolname='rememberMe']")
        private WebElement rememberMeCheckbox;

        public void loginWithRememberMe(String username, String password) {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        rememberMeCheckbox.click();
        loginButton.click();
    }

        public LoginPage(WebDriver driver) {
            this.driver = driver;
            PageFactory.initElements(driver, this);
        }
        public void navigateToLogin() {
            driver.get("http://training.skillo-bg.com:4300/users/login");
        }

        public void login(String username, String password) {
            usernameInput.sendKeys(username);
            passwordInput.sendKeys(password);
            loginButton.click();
        }
    }
