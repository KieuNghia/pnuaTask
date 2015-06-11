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
public class AirConditionProductPage extends AbstractPage {

    public static double minPriceDouble;

    public AirConditionProductPage(WebDriver driver) {

        super(driver, Constants.URL);
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[@class = 'other-prices']/b[1]")
    public WebElement minPrice;

    public AirConditionProductPage setMinPriceFirstProduct() {

        String priceCurrent = minPrice.getText();
        minPriceDouble = Double.parseDouble(priceCurrent.replaceAll("\\s", ""));
        return new AirConditionProductPage(driver);
    }

    public static double getMinPriceFirstElement() {

        return minPriceDouble;
    }


    public AirConditionPage goBack() {
        driver.navigate().back();
        return new AirConditionPage(driver);

    }


}
