package FirstTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class TestWyszukiwarkiGoogle {
    @Test
    public void googleOpenTest2() {
        String driverPath = "C:\\Program Files\\chromedriver.exe";  //uruchomienie przeglądarki
        System.setProperty("webdriver.chrome.driver", driverPath);  //uruchomienie przeglądarki
        WebDriver driver = new ChromeDriver();                      //uruchomienie przeglądarki
        driver.manage().window().maximize();                    //zmiana wielkości okna przegladarki
        driver.get("C:\\Users\\Paweł\\Desktop\\Java\\Pliki do testów\\Test.html");

        WebElement newPageButton = driver.findElement(By.id("newPage"));
        String currentWindowName = driver.getWindowHandle();
        newPageButton.click();
        switchToNewWindow(driver,currentWindowName);
        System.out.println("Tytuł to " + driver.getTitle());
        System.out.println("Obecny URL to " + driver.getCurrentUrl());
        driver.switchTo().window(currentWindowName);
        driver.findElement(By.name("username")).sendKeys("Mouse");

    }
    private void switchToNewWindow(WebDriver driver, String currentWindowName){
        System.out.println("Wartość dla obecnego okna to" + currentWindowName);
        Set<String> wwindows = driver.getWindowHandles();
        System.out.println("Ilość okien przeglądarki " + wwindows.size());
        for (String window : wwindows){
            if(!window.equals(currentWindowName)){
                driver.switchTo().window(window);
            }
        }
    }
}
