package BetterTests;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class SearchDress extends BaseSeleniumTest {

    @Test
    public void searchDressTest() {
        driver.get("http://automationpractice.com/index.php");
        WebElement search = driver.findElement(By.id("search_query_top"));
        search.sendKeys("dress");
        search.sendKeys(Keys.ENTER);
        waitForWebElement(By.cssSelector("[class='product-name'][title='Printed Summer Dress']"));
        WebElement dress = driver.findElement(By.cssSelector("[class='product-name'][title='Printed Summer Dress']"));
        dress.click();
        String expectedTitle = "Printed Summer Dress - My Store";
        System.out.println((driver.getTitle()));
        Assert.assertEquals(driver.getTitle(), expectedTitle);

    }

    private void waitForWebElement(By locator) {
        Wait<WebDriver> wait = new WebDriverWait(driver, 10L);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
