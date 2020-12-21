import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LokalizowanieNaStronie2 {
    @Test
    public void googleOpenTest2() {
        String driverPath = "C:\\Program Files\\chromedriver.exe";  //uruchomienie przeglądarki
        System.setProperty("webdriver.chrome.driver", driverPath);  //uruchomienie przeglądarki
        WebDriver driver = new ChromeDriver();                      //uruchomienie przeglądarki
        driver.manage().window().maximize();                    //zmiana wielkości okna przegladarki
        driver.get("C:\\Users\\Paweł\\Desktop\\Java\\Pliki do testów\\Test.html");

        //klikanie na elementy
        WebElement clickOnMeButton = driver.findElement(By.id("clickOnMe"));
        clickOnMeButton.click();
        //zamykanie dodatkowych alertów/okien
        Alert alert = driver.switchTo().alert();
        //alert.accept();
        alert.dismiss();

        /*
        alert.sendKeys("Enter"); // w tym przypadku nie działa kliknięcie w alert enterem
        //wprowadź wartość do pola
        WebElement firstName = driver.findElement(By.id("fname"));
        firstName.sendKeys("Monika");
        firstName.clear();

*/

/*
        //wybór opcji z dropdowna 'marka auta'
        Select carselect = new Select(driver.findElement(By.tagName("select")));
        carselect.selectByIndex(0);
        carselect.selectByValue("mercedes");
        carselect.selectByVisibleText("Audi");

*/
/*
        //pobierz tekst z pola input
        WebElement firstNameInput = driver.findElement(By.id("fname"));
        firstNameInput.sendKeys("Marek");
        System.out.println("Name is " + firstNameInput.getText());
        System.out.println("Name is " + firstNameInput.getAttribute("value"));
        WebElement potwierdzamRegulamin = driver.findElement(By.xpath("/html/body/label[2]"));
        System.out.println("Tresc to: " + potwierdzamRegulamin.getText());

 */
        /*
        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        //Thread.sleep(5000);
        checkbox.click();

        WebElement radiobutton = driver.findElement(By.xpath("//input[@value='male']"));
        radiobutton.click();

         */
        WebElement paragraph = driver.findElement(By.className("topSecret"));
        System.out.println("Ukryty tekst to " + paragraph.getAttribute("textContent"));

        // driver.quit();

    }
}