package tests;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void verifyLoginAndLogout() {

        WebDriverWait wait = new WebDriverWait(
            driver, Duration.ofSeconds(10)
        );

        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name"))
              .sendKeys("standard_user");

        driver.findElement(By.id("password"))
              .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        wait.until(
            ExpectedConditions.urlContains("inventory.html")
        );

        System.out.println("Login successful!");

        driver.findElement(By.id("react-burger-menu-btn")).click();

      WebElement logoutLink = wait.until(
            ExpectedConditions.elementToBeClickable(
                By.id("logout_sidebar_link")
            )
        );

        ((JavascriptExecutor) driver).executeScript(
            "arguments[0].click();", logoutLink
        );

        wait.until(
            ExpectedConditions.urlToBe("https://www.saucedemo.com/")
        );

        Assert.assertTrue(
            driver.findElement(By.id("login-button")).isDisplayed()
        );

        System.out.println("Logout successful!");
    }
}