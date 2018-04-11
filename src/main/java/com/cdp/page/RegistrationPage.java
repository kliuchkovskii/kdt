package com.cdp.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

    public RegistrationPage(){
        driver.get("https://www.instagram.com/?hl=uk");
    }

    @FindBy(xpath = "//*[@name=\"emailOrPhone\"]")
    private WebElement phoneOrEmailField;

    @FindBy(xpath = "//*[@name=\"fullName\"]")
    private WebElement fullNameField;

    @FindBy(xpath = "//*[@name=\"username\"]")
    private WebElement userNameField;

    @FindBy(xpath = "//*[@name=\"password\"]")
    private WebElement passwordField;

    @FindBy(xpath = "//form[@method=\"post\"]/div/span/button")
    private WebElement registrationButton;

    public void setPhoneOrEmail(String phoneOrEmail){
        phoneOrEmailField.sendKeys(phoneOrEmail);
    }

    public void setFullName(String fullName){
        fullNameField.sendKeys(fullName);
    }

    public void setNickName(String userName){
        userNameField.sendKeys(userName);
    }

    public void setPassword(String password){
        passwordField.sendKeys(password);
    }

    public void clickRegistrationButton(){
        registrationButton.click();
        waitInMiliseconds(2000);
    }
}
