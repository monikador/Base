package com.travelers.tests;

import com.travelers.pages.HomePage;
import com.travelers.pages.ResultPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SearchHotelTest extends BaseSeleniumTest {

    @Test
    public void searchHotelTest() {
       // driver.manage().timeouts().implicitlyWait(15L, TimeUnit.SECONDS);
        driver.get("http://www.kurs-selenium.pl/demo/");
        //HomePage homePage = new HomePage((driver));
       // ResultPage resultPage = homePage
        HomePage homePage = new HomePage((driver));
        homePage.SetCityHotel("Dubai")
                .setDateRange("09/11/2018", "09/13/2018")
                .openTravellersInput()
                .setAdult()
                .setChild()
                .setChild()
                .performSearchButton();

        ResultPage resultPage = new ResultPage(driver);

        List<String> homeName = resultPage.getHotelNames();
        Assert.assertEquals(homeName.get(0),"Jumeirah Beach Hotel");
        Assert.assertEquals(homeName.get(1),"Oasis Beach Tower");
        Assert.assertEquals(homeName.get(2),"Rose Rayhaan Rotana");

        List<String> prices = resultPage.getHotelPrices();
        Assert.assertEquals(prices.get(0),"$22");
        Assert.assertEquals(prices.get(1),"$50");
        Assert.assertEquals(prices.get(2),"$80");



    }
}
