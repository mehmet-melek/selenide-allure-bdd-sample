package org.melek.selenideallurebddsample.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ProductDetailPage {

    private SelenideElement backToProductsButton = $x("//*[@data-test='back-to-products']");

    public void validateOnProductDetailPage() {
        backToProductsButton.shouldBe(Condition.visible);
    }
}
