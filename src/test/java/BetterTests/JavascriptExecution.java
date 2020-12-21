package BetterTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavascriptExecution extends BaseSeleniumTest {

    // Użycie JavaScript Jeśli nie dziala Java
    //"arguments[0].click();", element - klikanie
    //"arguments[0].setAttribute('value', 'nasz tekst')", element - wpisanie wartości w pole

    @Test
    public void firstJavascriptTest () throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        WebElement search = driver.findElement(By.id("search_query_top"));
        JavascriptExecutor executor1 = (JavascriptExecutor) driver;
        executor1.executeScript("arguments[0].setAttribute('value', 'dress')", search);
        //search.sendKeys("dress");
        search.sendKeys(Keys.ENTER);
        WebElement dress = driver.findElement(By.cssSelector("[class='product-name'][title='Printed Summer Dress']"));
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", dress);
        //dress.click();
        String expectedTitle = "Printed Summer Dress - My Store";
        System.out.println((driver.getTitle()));
        Assert.assertEquals(driver.getTitle(), expectedTitle);

    }
}
