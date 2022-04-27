package org.melek.selenideallurebddsample.hooks;

import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import org.melek.selenideallurebddsample.config.SutConfiguration;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.codeborne.selenide.Selenide.screenshot;

public class Hooks {

    @Before
    public void beforeEachScenario() {
        Selenide.open(SutConfiguration.getProps().getProperty("sut.url"));
    }

    @After
    public void afterEachScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            takeSsAndAddToReport(scenario);
        }
    }

    private void takeSsAndAddToReport(Scenario scenario) {
        String pngFileName = screenshot(scenario.getId());
        String attachmentName = scenario.getName();
        assert pngFileName != null;
        Path content = Paths.get(pngFileName.replace("file:", ""));
        try (InputStream inputStream = Files.newInputStream(content)) {
            Allure.addAttachment(attachmentName, inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
