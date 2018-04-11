package com.cdp.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class LoginPage extends BasePage{

    public LoginPage(){
        driver.get("https://www.instagram.com/accounts/login/?hl=uk");
    }

    @FindBy(xpath = "//input[@name='username']")
    private WebElement phoneOrEmailOrUsernameField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordField;

    @FindBy(xpath = "//form[@method='post']/span/button")
    private WebElement loginButton;

    public void setUsernameField(String username){
        phoneOrEmailOrUsernameField.sendKeys(username);
    }

    public void setPasswordField(String password){
        passwordField.sendKeys(password);
    }

    public void clickLoginButton(){
        loginButton.click();
        waitInMiliseconds(1500);
    }

}
