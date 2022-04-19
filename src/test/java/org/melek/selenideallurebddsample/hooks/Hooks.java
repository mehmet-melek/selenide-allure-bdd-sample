package org.melek.selenideallurebddsample.hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void beforeEachScenario () throws InterruptedException {
        Selenide.open(Configuration.baseUrl);
    }
}
