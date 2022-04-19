package org.melek.selenideallurebddsample.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://www.saucedemo.com/
public class LoginPage {

    private SelenideElement usernameInput = $("#user-name");
    private SelenideElement passwordInput = $(byAttribute("data-test", "password"));
    private SelenideElement loginButtonInput = $x("//*[@id='login-button']");
    private SelenideElement loginLogo = $(".login_logo");
    private SelenideElement errorMessageContainer = $(byAttribute("data-test", "error"));

    public LoginPage validateOnLoginPage() {
        loginLogo.shouldBe(visible);
        return this;
    }

    public LoginPage login(String userName, String password) {
        usernameInput.sendKeys(userName);
        passwordInput.sendKeys(password);
        loginButtonInput.click();
        return this;
    }

    public String getLoginErrorMessage() {
        return errorMessageContainer.getText();
    }


}