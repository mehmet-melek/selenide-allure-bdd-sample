package org.melek.selenideallurebddsample.hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;
import io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static com.codeborne.selenide.Selenide.screenshot;

public class Hooks {

    @Before
    public void beforeEachScenario() throws InterruptedException {
        Selenide.open(Configuration.baseUrl);
    }

    @After
    public void afterEachScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            String pngFileName = screenshot(scenario.getId());
            if (pngFileName != null) {
                addScreenshotToReport(pngFileName.replace("file:", ""), scenario.getName());
            }
        }
    }

    @AfterAll
    public static void after_all() throws IOException, InterruptedException {
   //     Runtime.getRuntime().exec(System.getProperty("user.dir") + "/send-test-result.sh");
    }

    public void addScreenshotToReport(String pngFileName, String name) {
        Path content = Paths.get(pngFileName);
        try (InputStream is = Files.newInputStream(content)) {
            Allure.addAttachment(name, is);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
