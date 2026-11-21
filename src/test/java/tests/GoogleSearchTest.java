package tests;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseTest {

    @Test
    public void openSeleniumWebsite() {

        driver.get("https://www.selenium.dev/");

        WebDriverWait wait = new WebDriverWait(
            driver, Duration.ofSeconds(10)
        );

        wait.until(
            ExpectedConditions.titleContains("Selenium")
        );

        Assert.assertTrue(
            driver.getTitle().contains("Selenium")
        );

        System.out.println("Selenium website opened successfully!");
    }
}