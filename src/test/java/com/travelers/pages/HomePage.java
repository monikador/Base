package com.travelers.pages;

import com.travelers.helpers.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HomePage {

    @FindBy(xpath = "//span[text()='Search by Hotel or City Name']")
    private WebElement searchSpan;

    @FindBy(xpath = "//div[@id='select2-drop']//input")
    private WebElement searchCityInput;

    @FindBy(name = "checkin")
    private WebElement checkInInput;

    @FindBy(name = "checkout")
    private WebElement checkOutInput;

    @FindBy(id = "travellersInput")
    private WebElement travellersInput;

    @FindBy(id = "adultPlusBtn")
    private WebElement adultPlusBtn;

    @FindBy(id = "childPlusBtn")
    private WebElement childPlusBtn;

    @FindBy(xpath = "//button[text()=' Search']")
    private WebElement searchButton;

    @FindBy(xpath = "//table[@class= 'bgwhite table table-striped']")
    private WebElement resultsTable;

    @FindBy(xpath = "//div[@class='select2-result-label']")
    private WebElement selectResult;

    private SeleniumHelper helper; //locator

    private WebDriver driver; //element


    public HomePage(WebDriver driver) {

        PageFactory.initElements(driver, this);
        this.helper = new SeleniumHelper(driver); //locator
        this.driver = driver; //element
    }


    public void SetCityHotel(String cityName) {
        searchSpan.click();
        searchCityInput.sendKeys(cityName);
        //Możemy czekać na lokator lub na element
        //By locationLabel = By.xpath("//div[@class='select2-result-label']");  // lokator
        //helper.waitForElementToBeDisplayed(locationLabel);
        helper.waitForElementToBeDisplayed(selectResult);
        searchCityInput.sendKeys(Keys.ENTER);
    }
    public void setDateRange(String checkInDate, String checkOutDate) {
        checkInInput.sendKeys(checkInDate);
        checkOutInput.sendKeys(checkOutDate);
        checkOutInput.click();
    }
    public void openTravellersInput(){
        travellersInput.click();
        helper.waitForElementToBeDisplayed(adultPlusBtn);
    }
    public void setAdult () {
        adultPlusBtn.click();
    }
    public void setChild() {
        childPlusBtn.click();
    }
    public void performSearchButton() {
        searchButton.click();
    }
    // take a list with hotel name
    public List<String> getHotelNames() {
        List<String> hotelNames = new ArrayList<>();
        helper.waitForListOfWebElements(resultsTable.findElements(By.xpath(".//h4//b")));
        List<WebElement> hotelNameWebElements = resultsTable.findElements(By.xpath(".//h4//b"));
        for (WebElement hotelNameElement : hotelNameWebElements) {
            System.out.println(hotelNameElement.getText());
            hotelNames.add(hotelNameElement.getText());
        }
        return hotelNames;
    }
    // take a list with price. You can do it like list wit hotel names or like that
    public List<String> getHotelPrices() throws InterruptedException {
        Thread.sleep(3000);
        List<WebElement> hotelPrices = resultsTable.findElements(By.xpath("//div[contains(@class, 'price_tab')]//b"));
        List<String> prices = hotelPrices.stream().map(element -> element.getText()).collect(Collectors.toList());
        System.out.println(prices);
        return prices;
    }
}
