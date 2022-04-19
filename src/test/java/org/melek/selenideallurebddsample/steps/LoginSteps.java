package org.melek.selenideallurebddsample.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.melek.selenideallurebddsample.pages.LoginPage;
import org.melek.selenideallurebddsample.pages.ProductsPage;

public class LoginSteps {

    private LoginPage loginPage = new LoginPage();
    private ProductsPage productsPage = new ProductsPage();

    @Given("User is at the login page")
    public void user_is_at_the_login_page() {
        loginPage.validateOnLoginPage();
    }

    @When("User login with username as {string} and password as {string}")
    public void userLoginWithUsernameAsAndPasswordAs(String userName, String password) {
        loginPage.login(userName, password);
    }

    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
    }

    @Then("User is able to successfully login to application.")
    public void user_is_able_to_successfully_login_to_application() {
        productsPage.validateOnProductsPage();
    }

    @Then("User should see {string} error message")
    public void userShouldSeeErrorMessage(String errorMessage) throws InterruptedException {
        Assertions.assertEquals(errorMessage, loginPage.getLoginErrorMessage());
    }


}
