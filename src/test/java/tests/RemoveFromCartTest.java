package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveFromCartTest extends BaseTest {

    @Test
    public void verifyRemoveFromCart() {

        login();

        driver.findElement(
            By.id("add-to-cart-sauce-labs-backpack")
        ).click();

        driver.findElement(
            By.className("shopping_cart_link")
        ).click();

        Assert.assertTrue(
            driver.findElement(By.className("cart_item")).isDisplayed(),
            "Product was not found in cart!"
        );

        driver.findElement(
            By.id("remove-sauce-labs-backpack")
        ).click();

        Assert.assertEquals(
            driver.findElements(By.className("cart_item")).size(),
            0,
            "Product was not removed!"
        );

        System.out.println("Product removed successfully!");
        System.out.println("Cart is empty!");
    }
}