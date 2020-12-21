package BetterTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoveringOnElements extends BaseSeleniumTest{

    @Test
    public void hoveringTest() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        Actions hovering = new Actions(driver);
        WebElement woman = driver.findElement(By.className("sf-with-ul"));
        hovering.moveToElement(woman).build().perform();
        //?String color1 = "#666666";

       //? Assert.assertTrue(color1.equals(woman.get("#484848")));

    }
}
