package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveFromCartTest extends BaseTest {

    @Test
    public void verifyRemoveFromCart() {

        WebDriverWait wait = new WebDriverWait(
            driver, Duration.ofSeconds(20)
        );

        login();

        wait.until(ExpectedConditions.urlContains("inventory.html"));

        wait.until(ExpectedConditions.elementToBeClickable(
            By.id("add-to-cart-sauce-labs-backpack")
        )).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.className("shopping_cart_badge")
        ));

        wait.until(ExpectedConditions.elementToBeClickable(
            By.className("shopping_cart_link")
        )).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.className("cart_item")
        ));

        wait.until(ExpectedConditions.elementToBeClickable(
            By.id("remove-sauce-labs-backpack")
        )).click();

        wait.until(ExpectedConditions.invisibilityOfElementLocated(
            By.className("cart_item")
        ));

        Assert.assertEquals(
            driver.findElements(By.className("cart_item")).size(),
            0,
            "Product was not removed!"
        );

        System.out.println("Product removed successfully!");
        System.out.println("Cart is empty!");
    }
}