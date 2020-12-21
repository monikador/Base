import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumTest1 {
    @Test
    public void googleOpenTest1() {
        String driverPath = "C:\\Program Files\\chromedriver.exe";  //uruchomienie przeglądarki
        System.setProperty("webdriver.chrome.driver", driverPath);  //uruchomienie przeglądarki
        Dimension dimension = new Dimension(1530,800);      //zmiana wielkości okna przegladarki
        WebDriver driver = new ChromeDriver();                      //uruchomienie przeglądarki
        driver.manage().window().setSize(dimension);                    //zmiana wielkości okna przegladarki
        //driver.manage().window().maximize();                          //zmiana wielkości okna przegladarki
        //driver.get("http://www.google.pl");                         //uruchomienie przeglądarki
        driver.get("C:\\Users\\Paweł\\Desktop\\Java\\Pliki do testów\\Test.html");     //uruchomienie strony z kokretnego miejsca na kompie (z pliku)
        //driver.findElement(By.id("newPage")).click();       //w notatniku otwieram stronę i szukam id przycisku, w kóry chcę kliknąć
        //driver.quit();                                          //automatyczne zamykanie wszystkich okien przegladarki
        driver.close();                                           //automatyczne zamykanie pierwotnego okna przegladarki (ostatnio otwarte zostaje)
    }
}
