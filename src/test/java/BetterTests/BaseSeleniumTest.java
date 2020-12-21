package BetterTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public abstract class BaseSeleniumTest {
    protected WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.out.println("before test");
        String driverPath = "C:\\Program Files\\chromedriver.exe";  //uruchomienie przeglądarki
        System.setProperty("webdriver.chrome.driver", driverPath);  //uruchomienie przeglądarki
        driver = new ChromeDriver();
        ;//uruchomienie przeglądarki
        driver.manage().window().maximize();                    //zmiana wielkości okna przegladarki


    }

   /* @AfterTest
    public void tearDown() {
        System.out.println("After test");
        driver.quit();
    }*/
}
