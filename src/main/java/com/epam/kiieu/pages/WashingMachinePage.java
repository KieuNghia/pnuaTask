package com.epam.kiieu.pages;

import com.epam.kiieu.utils.pages.AbstractPage;
import com.epam.kiieu.utils.pages.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceArray;


public class WashingMachinePage extends AbstractPage {


    public WashingMachinePage(WebDriver driver) {

        super(driver, Constants.URL);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class = 'group'][1]//a[text() = '" + Constants.MIN_PRICE + "']")
    public WebElement minPrice;

    @FindBy(xpath = "//div[@class = 'group'][2]//a[text() = '" + Constants.MAX_PRICE + "']")
    public WebElement maxPrice;

    @FindBy(xpath = "//div[@class='price']/strong")
    public List<WebElement> priceListWebElements;

    public WashingMachinePage setMinPrice() {
        minPrice.click();
        return new WashingMachinePage(driver);
    }

    public WashingMachinePage setMaxPrice() {
        maxPrice.click();
        return new WashingMachinePage(driver);
    }


    public ArrayList<Integer> getPriceList() {

        ArrayList<Integer> prices = new ArrayList<Integer>();

        for (WebElement webElement : priceListWebElements) {
            String unparsedPrice = webElement.getText();
            String parsedPrice = unparsedPrice.replaceAll("\\D", "");
            prices.add(Integer.parseInt(parsedPrice));

        }

        return prices;
    }

    public boolean verifyPriceRange(List<Integer> list) {

        boolean flag = false;

        for (int price : list) {
            if (price > Integer.parseInt(Constants.MIN_PRICE) && price < Integer.parseInt(Constants.MAX_PRICE)) {
                flag = true;

            } else {
                flag = false;
                break;
            }

        }

        return flag;

    }


}
