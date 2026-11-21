package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLoginTest extends BaseTest {

    @Test
    public void verifyInvalidLogin() {

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        driver.findElement(By.id("password"))
              .sendKeys("wrong_password");

        driver.findElement(By.id("login-button"))
              .click();

        String errorMessage = driver.findElement(
            By.cssSelector("[data-test='error']")
        ).getText();

        Assert.assertTrue(
            errorMessage.contains("Username and password do not match"),
            "Expected invalid login error was not displayed!"
        );

        System.out.println("Invalid login handled successfully!");
        System.out.println("Error message: " + errorMessage);
    }
}