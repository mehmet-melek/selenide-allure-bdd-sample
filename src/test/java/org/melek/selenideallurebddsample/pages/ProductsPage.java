package org.melek.selenideallurebddsample.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ProductsPage {
    private SelenideElement titleSpan = $x("//*[@class='title' and text()='Products']");


    public ProductsPage validateOnProductsPage() {
        titleSpan.shouldBe(visible);
        return this;
    }
}
