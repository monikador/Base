package BetterTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;

public class HandlingFramesTest extends BaseSeleniumTest{


    @Test
    public void HandlingFramesTest() {
        driver.get("file:///C:\\Users\\Paweł\\Desktop\\Java\\Pliki do testów\\iFrameTest.html");
        driver.switchTo().frame(0);                                           //przełącza do frugiej strony
        WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
        clickOnMeButton.click();                                                //akceptuje alert
        driver.switchTo().alert().accept();
        List<WebElement> headers = driver.findElements(By.tagName("h1"));
        System.out.println(headers.size());
        headers.forEach(webElement ->
                System.out.println(webElement.getText()));
        driver.switchTo().defaultContent();                                     //przełącza do pierwszej strony
       /* List<WebElement> headers2 = driver.findElements(By.tagName("h1"));
        System.out.println(headers.size());
        headers2.forEach(webElement ->
                System.out.println(webElement.getText()));*/


    }
}

