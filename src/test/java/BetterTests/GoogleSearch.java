package BetterTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleSearch extends BaseSeleniumTest {

    @Test
    public void GoogleSearchTest(){
       driver.get("https://www.google.pl/");
       WebElement search = driver.findElement(By.name("q"));
       search.sendKeys("Selenium");
       search.sendKeys(Keys.ENTER);

        WebElement iframe = driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.xpath("//span[text()='Zgadzam się']")).click();
        driver.switchTo().defaultContent();


    }
}
