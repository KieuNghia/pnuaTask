package com.epam.kiieu.pages;

import com.epam.kiieu.utils.pages.AbstractPage;
import com.epam.kiieu.utils.pages.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FridgePage extends AbstractPage {


    public FridgePage(WebDriver driver) {

        super(driver, Constants.URL);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text() = 'цена']")
    public WebElement priceSort;

    @FindBy(xpath = "//a[text() = 'название']")
    public WebElement popularitySort;

    @FindBy(xpath = "//div[@class='name']/a")
    public List<WebElement> namesList;

    @FindBy(xpath = "//div[@class='price']/strong")
    public List<WebElement> pricesList;


    public FridgePage sortByPrice() {

        priceSort.click();
        return new FridgePage(driver);

    }

    public FridgePage sortByName() {
        popularitySort.click();

        return new FridgePage(driver);

    }

    public List getListofNames() {
        ArrayList<String> names = new ArrayList<String>();

        for (WebElement webElement : namesList) {
            names.add(webElement.getText());
        }
        return names;
    }

    public ArrayList getListofPrices() {
        ArrayList<String> prices = new ArrayList<String>();

        for (WebElement webElement : pricesList) {
            prices.add(webElement.getText());
        }
        return prices;
    }

    public boolean verifyItemsAreSortedBy(List currentList) {

        List<String> sortedList = new ArrayList<String>(currentList);
        Collections.sort(sortedList);
        if (sortedList.equals(currentList)) {
            return true;
        } else return false;

    }


}
