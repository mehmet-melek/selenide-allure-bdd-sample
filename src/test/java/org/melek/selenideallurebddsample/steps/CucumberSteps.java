package org.melek.selenideallurebddsample.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.melek.selenideallurebddsample.pages.LoginPage;
import org.melek.selenideallurebddsample.pages.ProductsPage;

public class CucumberSteps {

    private LoginPage loginPage = new LoginPage();
    private ProductsPage productsPage = new ProductsPage();

    @Given("User is at the login page")
    public void userIsAtTheLoginPage() {
        loginPage.validateOnLoginPage();
    }

    @When("User enters username as {string} and password as {string}")
    public void userEntersUsernameAsAndPasswordAs(String userName, String password) {
        loginPage.login(userName,password);
    }

    @And("User clicks on login button")
    public void userClicksOnLoginButton() {
    }

    @Then("User is able to successfully login to application.")
    public void userIsAbleToSuccessfullyLoginToApplication() {
        productsPage.validateOnProductsPage();
    }

    @Then("User should see {string} error message")
    public void userShouldSeeErrorMessage(String errorMessage) {
        Assertions.assertEquals(errorMessage,loginPage.getLoginErrorMessage());
    }
}
