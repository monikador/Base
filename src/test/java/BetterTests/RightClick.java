package BetterTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RightClick extends BaseSeleniumTest {

    @Test
    public void rightclickTest() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        WebElement logo = driver.findElement(By.cssSelector("[class='logo img-responsive']"));
        Actions rightclik = new Actions(driver);
        //rightclik.contextClick().build().perform();
        rightclik.contextClick(logo).build().perform();
    }
}