package BetterTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WaitsTest extends BaseSeleniumTest {

    @Test
    public void waitTest() throws InterruptedException {
        driver.get("file:///C:/Users/Pawe%C5%82/Desktop/Java/Pliki%20do%20test%C3%B3w/Waits.html");
        driver.findElement(By.id("clickOnMe")).click();
        String expectedText = "Dopiero się pojawiłem!";
        WebElement paragraph = driver.findElement(By.tagName("p"));
        //Thread.sleep(5000);

        Assert.assertEquals(paragraph.getText(), expectedText);
    }

    @Test
    public void waitTest2() {
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS); //podpina się do wszystkich elementów i czeka ąż się pojawią
        driver.get("file:///C:/Users/Pawe%C5%82/Desktop/Java/Pliki%20do%20test%C3%B3w/Waits2.html");
        driver.findElement(By.id("clickOnMe")).click();
        String expectedText = "Dopiero się pojawiłem!";
        WebElement paragraph = driver.findElement(By.tagName("p"));

        Assert.assertEquals(paragraph.getText(), expectedText);
    }

    @Test
    public void waitTest3() {
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS); //podpina się do wszystkich elementów i czeka ąż się pojawią
        driver.get("file:///C:/Users/Pawe%C5%82/Desktop/Java/Pliki%20do%20test%C3%B3w/Waits2.html");
        driver.findElement(By.id("clickOnMe")).click();
        waitForWebElement(By.tagName("p"));
        String expectedText = "Dopiero się pojawiłem!";
        WebElement paragraph = driver.findElement(By.tagName("p"));

        Assert.assertEquals(paragraph.getText(), expectedText);
    }
    private void waitForWebElement(By locator) {
        Wait<WebDriver> wait = new WebDriverWait(driver,10L);
        ((WebDriverWait)wait).pollingEvery(Duration.ofMillis(500)); // sprawda (tutaj co pół sekundy) czy element się pojawił- nie trzeba tego używać
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    /*private void waitForWebElement2(By locator) {
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.pollingEvery(Duration.ofMillis(500)); // sprawda (tutaj co pół sekundy) czy element się pojawił- nie trzeba tego używać
        wait.withTimeout(Duration.ofSeconds(10L)); //nie trzeba ustawiać
        wait.ignoring(NoSuchFieldException.class); //trzeba ignorować wyjątki
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }*/
    @Test
    public void waitTest4() {
        driver.get("file:///C:/Users/Pawe%C5%82/Desktop/Java/Pliki%20do%20test%C3%B3w/Waits2.html");
        driver.findElement(By.id("clickOnMe")).click();
        waitForWebElement(By.tagName("p"));
        String expectedText = "Dopiero się pojawiłem!";
        WebElement paragraph = driver.findElement(By.tagName("p"));

        Assert.assertEquals(paragraph.getText(), expectedText);
    }
    private void waitForWebElementMyWay(By locator) {
        Wait<WebDriver> wait = new WebDriverWait(driver,10L);
        ((WebDriverWait)wait).pollingEvery(Duration.ofMillis(500)); // sprawda (tutaj co pół sekundy) czy element się pojawił- nie trzeba tego używać
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}

