package FirstTests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Instant;
import java.util.Set;

import static java.lang.Thread.*;

public class GoogleBrowserTest {

    @Test
    public void googleOpenTest2() throws InterruptedException {
        String driverPath = "C:\\Program Files\\chromedriver.exe";  //uruchomienie przeglądarki
        System.setProperty("webdriver.chrome.driver", driverPath);  //uruchomienie przeglądarki
        WebDriver driver = new ChromeDriver();;//uruchomienie przeglądarki
        driver.manage().window().maximize();                    //zmiana wielkości okna przegladarki

        driver.get("https://www.google.com");
        driver.switchTo().frame(1);
        WebElement access = driver.findElement(By.className("RveJvd snByac"));
        access.click();

       /* WebElement serchInput = driver.findElement(By.name("q"));
        serchInput.sendKeys("Selenium");
        WebElement serchButton = driver.findElement(By.name("btnK"));
        serchInput.sendKeys(Keys.ENTER);
        sleep(3000);



       // driver.switchTo().activeElement();
        //WebElement acceptation = driver.findElement(By.id("gb_70"));
        //acceptation.click();

        WebElement  seleniumPageLink = driver.findElement(By.linkText("Selenium WebDriver"));
        seleniumPageLink.click();*/


      //  driver.quit();
    }
}
