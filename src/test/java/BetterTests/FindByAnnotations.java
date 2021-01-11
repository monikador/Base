package BetterTests;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.List;

public class FindByAnnotations extends BaseSeleniumTest {

    @FindBys({
            @FindBy(tagName = "table"),
            @FindBy(className = "tableHeader")
    })
    private List<WebElement> elements;

    @FindBy(xpath = "//input")
    private List<WebElement> inputs;

    @FindBy(xpath = "//button")
    private List<WebElement> buttons;

    @FindAll({
            @FindBy(xpath = "//button"),
            @FindBy(xpath = "//input")
    })
    private List<WebElement> inputsAndButtons;

    @Test
    public void FindByTest() {
        PageFactory.initElements(driver,this);
        driver.get("file:///C:/Users/Pawe%C5%82/Desktop/Java/Pliki%20do%20test%C3%B3w/Test.html");
        System.out.println("Element size is " + elements.size());
        System.out.println("Input size is " + inputs.size());
        System.out.println("Buttons size is " + buttons.size());
        System.out.println("Inputs and buttoms size is " + inputsAndButtons.size());


    }
}
