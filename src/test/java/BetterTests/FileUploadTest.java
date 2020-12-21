package BetterTests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;

public class FileUploadTest extends BaseSeleniumTest {

    @Test
    public void uploadFileTest(){
        driver.get("file:///C:/Users/Pawe%C5%82/Desktop/Java/Pliki%20do%20test%C3%B3w/FileUpload.html");
        String path = new File("src/main/resources/test478321200.png").getAbsolutePath();
        driver.findElement(By.id("myFile")).sendKeys(path);
    }
}
