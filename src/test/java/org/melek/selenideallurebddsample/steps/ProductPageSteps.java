package org.melek.selenideallurebddsample.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.melek.selenideallurebddsample.pages.ProductDetailPage;
import org.melek.selenideallurebddsample.pages.ProductsPage;

public class ProductPageSteps {
    ProductsPage productsPage = new ProductsPage();
    ProductDetailPage productDetailPage = new ProductDetailPage();
    @Then("User is at the product page")
    public void user_is_at_the_product_page() {
        productsPage.validateOnProductsPage();
    }

    @When("User click to product image")
    public void user_click_to_product_image() {
        productsPage.openProductOverImage();
    }

    @Then("User should see the product detail page open")
    public void user_should_see_the_product_detail_page_open() {
        productDetailPage.validateOnProductDetailPage();
    }

    @When("User click to product title")
    public void user_click_to_product_title() {
        productsPage.openProductFromTitle();
    }

    @When("User clicks on Add To Cart button")
    public void user_clicks_on_add_to_cart_button() {
        productsPage.addToCart();
    }

    @Then("User should see Remove button instead of Add To Cart button")
    public void user_should_see_remove_button_instead_of_add_to_cart_button() {
        Assertions.assertTrue(productsPage.returnRemoveButtonCount()==1);
    }

    @Then("the number on cart icon should be {int}")
    public void the_number_on_cart_icon_should_be(Integer count) {
    }

    @When("User clicks on Remove button")
    public void user_clicks_on_remove_button() {
        productsPage.removeElementFromCart();
    }
}
