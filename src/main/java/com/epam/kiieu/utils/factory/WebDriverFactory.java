package com.epam.kiieu.utils.factory;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.net.MalformedURLException;

public class WebDriverFactory {

    public WebDriver driver;


    private enum TypeDriver {
        FIREFOX, OPERA, CHROME, IE,
    }
    public WebDriver DriverBuilder(String typeDriver) throws MalformedURLException {
        TypeDriver type = TypeDriver.valueOf(typeDriver.toUpperCase());
        switch (type) {
            case FIREFOX:
                return new FirefoxDriverBuilder().createDriver();
            case OPERA:
                return new OperaDriverBuilder().createDriver();
            case CHROME:
                return new ChromeDriverBuilder().createDriver();
            case IE:
                return new IEDriverBuilder().createDriver();
            default:
                throw new EnumConstantNotPresentException(
                        type.getDeclaringClass(), type.name());
        }
    }

}