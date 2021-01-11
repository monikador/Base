import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LokalizowanieElementowPoID {
    @Test
    public void googleOpenTest1() {
        String driverPath = "C:\\Program Files\\chromedriver.exe";  //uruchomienie przeglądarki
        System.setProperty("webdriver.chrome.driver", driverPath);  //uruchomienie przeglądarki
        WebDriver driver = new ChromeDriver();       //uruchomienie przeglądarki
        /*
        driver.manage().window().maximize();                    //zmiana wielkości okna przegladarki
        driver.get("C:\\Users\\Paweł\\Desktop\\Java\\Pliki do testów\\Test.html");     //uruchomienie strony z kokretnego miejsca na kompie (z pliku)
        //WebElement firstNameInputID = driver.findElement(By.id("fname"));    //lokalizowanie elementów na stronie po id (consola Developerska > szukam elementu >kopiuje id)
        WebElement firstNameInputName = driver.findElement(By.name("fname"));  //po nazwie -||-
        WebElement w3SchoolLink = driver.findElement(By.linkText("Visit W3Schools.com!"));      //lokalizowanie elementów po całym linku
        WebElement niepelnyLink = driver.findElement(By.partialLinkText("Weir"));               //lokalizowanie elementów po fragmencie linku
        WebElement findByClass = driver.findElement(By.className("topSecret"));
        WebElement findByTagHTML = driver.findElement(By.tagName("input"));
        WebElement find2ByTagHTML = driver.findElement(By.tagName("a"));

        //wyszukaj przez CSS selector
        WebElement cickOnMeCssButton = driver.findElement(By.cssSelector("#clickOnMe"));
        WebElement ClickMeCssButton = driver.findElement(By.cssSelector("#newPage"));
        WebElement linkCssSelector = driver.findElement(By.cssSelector("a"));
        WebElement topSecretCssSelector = driver.findElement(By.cssSelector(".topSecret"));
        WebElement tdfirstChild = driver.findElement(By.cssSelector("td:first-child"));

        //WebElement clickOnMeXPathButton = driver.findElement(By.xpath("/html/body/button"));

         */
    }

}

