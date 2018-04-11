package com.cdp.bo;

import com.cdp.model.User;
import com.cdp.page.HomePage;
import com.cdp.page.LoginPage;
import com.cdp.page.RegistrationPage;

public class CommonBO {
    private RegistrationPage registrationPage;
    private LoginPage loginPage;
    private HomePage homePage;

    public void registerUser(User user){
        registrationPage = new RegistrationPage();
        registrationPage.setFullName(user.getFullName());
        registrationPage.setNickName(user.getUsername());
        registrationPage.setPhoneOrEmail(user.getPhoneOrEmail());
        registrationPage.setPassword(user.getPassword());
        registrationPage.clickRegistrationButton();
    }

    public void login(User user){
        loginPage = new LoginPage();
        loginPage.setUsernameField(user.getUsername());
        loginPage.setPasswordField(user.getPassword());
        loginPage.clickLoginButton();
    }

    public void logout(String username){
        homePage = new HomePage(username);
        homePage.clickSettingsButton();
        homePage.clickLogoutButton();
    }
}
