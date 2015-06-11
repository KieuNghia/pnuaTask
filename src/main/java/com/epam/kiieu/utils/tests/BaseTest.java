package com.epam.kiieu.utils.tests;

import com.epam.kiieu.pages.*;
import com.epam.kiieu.utils.factory.WebDriverFactory;
import com.epam.kiieu.utils.pages.Constants;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;

/**
 * Created by nghia on 07.06.2015.
 */
public class BaseTest {

    protected static MainPage mainPage;
    protected static BreadMakerPage breadMakerPage;
    protected static ComparisonPage comparisonPage;
    protected static FridgePage fridgePage;
    protected static MicroovenPage microovenPage;
    protected static MicroOvenProductPage microOvenProductPage;
    protected static WashingMachinePage washingMachinePage;
    protected static AirConditionPage airConditionPage;
    protected static AirConditionProductPage airConditionProductPage;
    protected static AirConditionPriceCatalog airConditionPriceCatalog;




    private WebDriver webDriver;

    @BeforeSuite
    protected void setUp() {
        try {
            WebDriverFactory driverFactory = new WebDriverFactory();
            webDriver = driverFactory.DriverBuilder("firefox");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        webDriver.get(Constants.URL);
        mainPage = new MainPage(webDriver);
        breadMakerPage = new BreadMakerPage(webDriver);
        comparisonPage = new ComparisonPage(webDriver);
        fridgePage = new FridgePage(webDriver);
        microovenPage = new MicroovenPage(webDriver);
        microOvenProductPage = new MicroOvenProductPage(webDriver);
        washingMachinePage = new WashingMachinePage(webDriver);


    }

    @AfterSuite
    public void tearDown() throws InterruptedException {

        Thread.sleep(5000);
        if (webDriver != null)
        webDriver.quit();
    }
}
