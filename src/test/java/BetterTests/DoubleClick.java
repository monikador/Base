package BetterTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleClick extends BaseSeleniumTest {

    @Test
    public void doubleClickTest() throws InterruptedException {
        SeleniumHelperScreenshot helper = new SeleniumHelperScreenshot(driver);
        driver.get("C:\\Users\\Paweł\\Desktop\\Java\\Pliki do testów\\DoubleClick.html");
        WebElement clickMetwice = driver.findElement(By.id("bottom"));
        Actions clictwice = new Actions(driver);
        clictwice.moveToElement(clickMetwice).doubleClick().build().perform();
        helper.takeScreenshot();

        Assert.assertTrue(driver.getWindowHandles().size()>1);

    }
}
