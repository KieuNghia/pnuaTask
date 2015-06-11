package com.epam.kiieu.pages;

import com.epam.kiieu.utils.pages.AbstractPage;
import com.epam.kiieu.utils.pages.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Kuanh_Nhkhiia_Kiieu on 10.06.2015.
 */
public class AirConditionPage extends AbstractPage {


    public static double minPriceDouble;

    public AirConditionPage(WebDriver driver) {

        super(driver, Constants.URL);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class = 'group'][3]//a[text() = '" + Constants.CONDITION_MAKER + "']")
    public WebElement manufacturer;

    @FindBy(xpath = "//div[@class='price']/strong")
    public WebElement price;

    @FindBy(xpath = "//div[@class='price']//b[1]")
    public WebElement minPrice;

    @FindBy(xpath = "//div[@class = 'item'][1]/div[@class = 'name']/a")
    public WebElement firstProductName;

    @FindBy(xpath = "//div[@class ='link']/a[@class = 'green']")
    public WebElement priceCatalog;

    public AirConditionPriceCatalog goToPriceCatalog() {
        priceCatalog.click();
        return new AirConditionPriceCatalog(driver);
    }

    public AirConditionPage selectManufacture() {

        manufacturer.click();
        return new AirConditionPage(driver);
    }

    public AirConditionProductPage selectFirstProduct() {
        firstProductName.click();
        return new AirConditionProductPage(driver);
    }


    public AirConditionPage setMinPriceFirstProduct() {

        minPriceDouble = Double.parseDouble(minPrice.getText());
        return new AirConditionPage(driver);
    }

    public static double getMinPriceFirstElement() {

        return minPriceDouble;
    }


    public MainPage goBack() {
        driver.navigate().back();
        return new MainPage(driver);

    }
}
