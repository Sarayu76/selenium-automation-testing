package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {

    @Test
    public void verifyCheckoutProcess() {

        WebDriverWait wait = new WebDriverWait(
            driver, Duration.ofSeconds(10)
        );

        login();

        wait.until(
            ExpectedConditions.urlContains("inventory.html")
        );

        driver.findElement(
            By.id("add-to-cart-sauce-labs-backpack")
        ).click();

        driver.findElement(
            By.className("shopping_cart_link")
        ).click();

        driver.findElement(By.id("checkout")).click();

        driver.findElement(By.id("first-name")).sendKeys("Sarayu");
        driver.findElement(By.id("last-name")).sendKeys("E");
        driver.findElement(By.id("postal-code")).sendKeys("639001");

        driver.findElement(By.id("continue")).click();

        wait.until(
            ExpectedConditions.elementToBeClickable(By.id("finish"))
        ).click();

        String confirmation = wait.until(
            ExpectedConditions.visibilityOfElementLocated(
                By.className("complete-header")
            )
        ).getText();

        Assert.assertTrue(
            confirmation.contains("Thank you"),
            "Order confirmation was not displayed!"
        );

        System.out.println("Checkout completed successfully!");
        System.out.println(confirmation);
    }
}