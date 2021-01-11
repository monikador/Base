package BetterTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class FindByList extends BaseSeleniumTest{

    @FindBy(id = "search_query_top") //dostępnaw każdym nowym teście
    private List<WebElement> searchInput;

    @Test
    public void FindByTest() {
        driver.get("http://automationpractice.com/index.php");
        PageFactory.initElements(driver,this);
        searchInput.get(0).sendKeys("dress");
        searchInput.get(0).sendKeys(Keys.ENTER);
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
