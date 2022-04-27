package org.melek.selenideallurebddsample.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$x;

public class ProductsPage {
    private SelenideElement titleSpan = $x("//*[@class='title' and text()='Products']");
    private ElementsCollection productImageList = $$(By.xpath("//*[@class='inventory_item_img']/a"));
    private ElementsCollection productTitleList = $$(By.xpath("//*[@class='inventory_item_label']/a"));
    private ElementsCollection addToCartButtonList = $$(By.xpath("//*[@class='btn btn_primary btn_small btn_inventory']"));
    private ElementsCollection removeButtonList = $$(By.xpath("//button[text()='Remove']"));

    public ProductsPage validateOnProductsPage() {
        titleSpan.shouldBe(visible);
        return this;
    }

    public void openProductOverImage() {
        productImageList.get(0).click();
    }

    public void openProductFromTitle() {
        productTitleList.get(0).click();
    }

    public void addToCart() {
        addToCartButtonList.get(0).click();
    }

    public void removeElementFromCart() {
        removeButtonList.get(0).click();
    }

   public int returnRemoveButtonCount() {
        return removeButtonList.size();
   }
    public int addToCartButtonSize() {
        return addToCartButtonList.size();
    }
}
