package com.travelers.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.List;

public class SeleniumHelper {

    private WebDriver driver;

    public SeleniumHelper(WebDriver driver){ this.driver = driver; }

    public SeleniumHelper() {

    }

    public void waitForElementToBeDisplayed(By locator){
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(10000))
                .ignoring(NoSuchFieldException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }
    public void waitForElementToBeDisplayed(WebElement element){
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(10000))
                .ignoring(NoSuchFieldException.class);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitForListOfWebElements(List<WebElement> elementList){
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofMillis(10000))
                .ignoring(NoSuchFieldException.class);
        wait.until(driver1 ->
                elementList.size()>0);
    }
}
