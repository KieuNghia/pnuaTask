package com.epam.kiieu.utils.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class IEDriverBuilder {


    private static WebDriver driver = null;

    public WebDriver createDriver() {
        System.setProperty("webdriver.ie.driver", "Libdrivers\\IEDriverServer64.exe");
        driver = new InternetExplorerDriver();
        return driver;

    }
}
