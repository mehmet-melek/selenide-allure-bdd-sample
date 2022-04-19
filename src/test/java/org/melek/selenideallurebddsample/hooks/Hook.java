package org.melek.selenideallurebddsample.hooks;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook {

    @Before
    public void beforeExample() {
        Selenide.open("https://www.saucedemo.com/");
    }

    @After
    public void afterExample() {
        Selenide.closeWindow();
    }
}
