package FirstTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Trello1 {
    public Trello1(){
}

    @Test
    public void trello1() throws InterruptedException {
        String driverPath = "C:\\Program Files\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        Dimension dimension = new Dimension(1530, 800);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().setSize(dimension);
        driver.get("https://trello.com/pl");

        WebElement login = driver.findElement(By.cssSelector("body>header>nav>div.float-right.buttons>a.btn.btn-sm.btn-link.text-white"));
        login.click();
        Thread.sleep(3000);
        WebElement putemail = driver.findElement(By.id("user"));
        putemail.sendKeys("mtokarczyk77@gmail.com");

        Thread.sleep(3000);
        WebElement loginWithAtlassian = driver.findElement(By.id("login"));
        loginWithAtlassian.click();

        Thread.sleep(3000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Motylek*8");

        Thread.sleep(3000);
        WebElement login2 = driver.findElement(By.cssSelector("#login-submit > span > span"));
        login2.click();

        Thread.sleep(10000);
        WebElement ikon = driver.findElement(By.className("_24AWINHReYjNBf"));
        ikon.click();

        WebElement logout = driver.findElement(By.cssSelector("body > div.atlaskit-portal-container > div > section > div > nav > ul > li:nth-child(9) > button"));
        logout.click();

//Thread.sleep(3000);
  //     driver.close();
    }
}