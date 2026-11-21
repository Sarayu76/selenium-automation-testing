package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InventoryTest extends BaseTest {

    @Test
    public void verifyInventoryProducts() {

        login();

        Assert.assertTrue(
            driver.getCurrentUrl().contains("inventory.html"),
            "Inventory page did not open!"
        );

        List<WebElement> products = driver.findElements(
            By.className("inventory_item_name")
        );

        Assert.assertTrue(
            products.size() > 0,
            "No products displayed!"
        );

        System.out.println("Inventory page opened successfully!");
        System.out.println("Total products: " + products.size());

        for (WebElement product : products) {
            System.out.println("Product: " + product.getText());
        }
    }
}