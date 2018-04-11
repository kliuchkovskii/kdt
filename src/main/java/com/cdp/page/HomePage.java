package com.cdp.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class HomePage extends BasePage{

    public HomePage(String username){
        driver.get("https://www.instagram.com/" + username + "/?hl=uk");
    }

    @FindBy(xpath = "//button[text()='Параметри']")
    private WebElement settingsButton;

    @FindBy(xpath = "//ul[@role='menu']/li[4]/button")
    private WebElement logoutButton;

    public void clickSettingsButton()  {
        settingsButton.click();
    }

    public void clickLogoutButton(){
        logoutButton.click();
        waitInMiliseconds(1000);
    }
}
