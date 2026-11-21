package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends BaseTest {

    @Test
    public void verifyAddToCart() {

        login();

        Assert.assertTrue(
            driver.getCurrentUrl().contains("inventory.html"),
            "Login failed!"
        );

        driver.findElement(
            By.id("add-to-cart-sauce-labs-backpack")
        ).click();

        String cartCount = driver.findElement(
            By.className("shopping_cart_badge")
        ).getText();

        Assert.assertEquals(
            cartCount, "1",
            "Product was not added to cart!"
        );

        System.out.println("Product added successfully!");
        System.out.println("Cart count: " + cartCount);
    }
}