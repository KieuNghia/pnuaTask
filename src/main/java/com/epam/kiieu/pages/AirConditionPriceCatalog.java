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
public class AirConditionPriceCatalog extends AbstractPage {

    public static double minPriceDouble;

    public AirConditionPriceCatalog(WebDriver driver) {

        super(driver, Constants.URL);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//table[@class = 'styled-result-table']/tbody[1]/tr[1]/td[2]")
    public WebElement minPrice;

    @FindBy(xpath = "//div[@class = 'group'][3]/a[text() = '" + Constants.CONDITION_MAKER + "']")
    public WebElement manufacture;

    public AirConditionPriceCatalog selectManufacture() {
        manufacture.click();
        return new AirConditionPriceCatalog(driver);
    }

    public AirConditionPriceCatalog setMinPriceFirstProduct() {

        String priceCurrent = minPrice.getText();
        minPriceDouble = Double.parseDouble(priceCurrent.replaceAll("\\s", ""));
        return new AirConditionPriceCatalog(driver);
    }

    public static double getMinPriceFirstElement() {

        return minPriceDouble;
    }


}
