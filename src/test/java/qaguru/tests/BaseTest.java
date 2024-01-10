package qaguru.tests;

import qaguru.config.LaunchConfig;
import com.codeborne.selenide.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {

    @BeforeAll
    static void beforeAll() {

        LaunchConfig config = ConfigFactory.create(LaunchConfig.class, System.getProperties());
        Configuration.baseUrl = "https://www.w3schools.com/sql/default.asp";
        Configuration.browser = config.browser();
        Configuration.browserVersion = config.version();
        Configuration.remote = config.remoteUrl();
        Configuration.pageLoadStrategy = "eager";
    }
}
