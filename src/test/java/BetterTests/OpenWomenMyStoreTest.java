package BetterTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.*;

public class OpenWomenMyStoreTest extends BaseSeleniumTest {

    @Test
    public void automationPractice() throws InterruptedException {
        SeleniumHelperScreenshot helper = new SeleniumHelperScreenshot(driver);
        driver.get("http://automationpractice.com/index.php");
        helper.takeScreenshot();
        driver.findElement(By.className("sf-with-ul")).click();
        String expectedTitle = "Women - My Store";
        System.out.println((driver.getTitle()));
        helper.takeScreenshot();
        Assert.assertEquals(driver.getTitle(), expectedTitle);
        //Assert.assertTrue(expectedTitle.equals(driver.getTitle()));
        //Assert.assertTrue(driver.getTitle().equals("Zła nazwa"),"Tytuły nie są równe");
    }
}