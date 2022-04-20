package org.melek.selenideallurebddsample;

import com.codeborne.selenide.junit5.ScreenShooterExtension;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import java.io.IOException;

@Suite
@SelectClasspathResource("features")
public class TestRunner {

    @AfterAll
    public static void sendTestResult() throws IOException {
    }

}
