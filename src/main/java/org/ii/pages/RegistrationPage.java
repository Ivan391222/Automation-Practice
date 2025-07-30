package org.ii.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
    private WebDriver driver;

    @FindBy(css = "input[placeholder='Username']")
    private WebElement usernameField;

    @FindBy(css = "input[placeholder='email']")
    private WebElement emailField;

    @FindBy(css = "input[placeholder='Birth date']")
    private WebElement birthdayField;

    @FindBy(css = "input[placeholder='Password']")
    private WebElement passwordField;

    @FindBy(css = "input[placeholder='Confirm Password']")
    private WebElement confirmPasswordField;

    @FindBy(css = "textarea[placeholder='Public info']")
    private WebElement publicInfoField;

    @FindBy(id = "sign-in-button")
    private WebElement signUpButton;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void register(String username, String email, String birthDate, String password, String info) {
        usernameField.sendKeys(username);
        emailField.sendKeys(email);
        birthdayField.sendKeys(birthDate);
        passwordField.sendKeys(password);
        confirmPasswordField.sendKeys(password);
        publicInfoField.sendKeys(info);
        signUpButton.click();
    }
}