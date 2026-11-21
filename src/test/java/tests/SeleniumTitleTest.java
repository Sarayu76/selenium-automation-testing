package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumTitleTest extends BaseTest {

    @Test
    public void verifyPageTitle() {

        driver.get("https://www.selenium.dev/");

        String actualTitle = driver.getTitle();

        System.out.println("Page Title: " + actualTitle);

        Assert.assertTrue(
            actualTitle.contains("Selenium"),
            "Page title does not contain Selenium"
        );
    }
}