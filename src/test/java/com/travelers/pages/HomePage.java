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

    @FindBy(xpath = "//li[@class='select2-results-dept-1 select2-result select2-result-selectable select2-highlighted']//div[@class='select2-result-label']")
    private WebElement selectResults;

    private SeleniumHelper helper; //locator

    private WebDriver driver; //element


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.helper = new SeleniumHelper(driver); //locator
        this.driver = driver; //element
    }


    public HomePage SetCityHotel(String cityName) {
        searchSpan.click();
        searchCityInput.sendKeys(cityName);
        //Możemy czekać na lokator lub na element
        //By locationLabel = By.xpath("//div[@class='select2-result-label']bel']");  // lokator
        //helper.waitForElementToBeDisplayed(locationLabel);
        helper.waitForElementToBeDisplayed(selectResults);
        searchCityInput.sendKeys(Keys.ENTER);
        return this;
    }
    public HomePage setDateRange(String checkInDate, String checkOutDate) {
        checkInInput.sendKeys(checkInDate);
        checkOutInput.sendKeys(checkOutDate);
        checkOutInput.click();
        return this;
    }
    public HomePage openTravellersInput(){
        travellersInput.click();
        helper.waitForElementToBeDisplayed(adultPlusBtn);
        return this;
    }
    public HomePage setAdult () {
        adultPlusBtn.click();
        return this;
    }
    public HomePage setChild() {
        childPlusBtn.click();
        return this;
    }

    public void /*ResultPage*/ performSearchButton() {
        searchButton.click();
        //return new ResultPage(driver);
    }
}
