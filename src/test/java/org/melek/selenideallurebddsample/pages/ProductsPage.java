package org.melek.selenideallurebddsample.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

// page_url = https://www.saucedemo.com/inventory.html
public class ProductsPage {
    private SelenideElement titleSpan = $x("//*[@class='title' and text()='Products']");


    public ProductsPage validateOnProductsPage() {
        titleSpan.shouldBe(visible);
        return this;
    }
}