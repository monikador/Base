package BetterTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DragAndDrop extends BaseSeleniumTest {

    @Test
    public void dragDropTest() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement elementToDrag = driver.findElement(By.id("draggable"));
        WebElement dropZone = driver.findElement(By.id("droptarget"));
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
        Thread.sleep(2000);
        Actions dragdrop = new Actions(driver);
        dragdrop.dragAndDrop(elementToDrag,dropZone).build().perform();
        String nameOfButton = "You did great!";

        Assert.assertTrue(nameOfButton.equals(dropZone.getText()));

    }
}
