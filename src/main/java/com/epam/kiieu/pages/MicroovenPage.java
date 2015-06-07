package com.epam.kiieu.pages;

import com.epam.kiieu.utils.pages.AbstractPage;
import com.epam.kiieu.utils.pages.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MicroovenPage extends AbstractPage {


    public MicroovenPage(WebDriver driver) {

        super(driver, Constants.URL);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class = 'item'][1]//div[@class = 'name']/a")
    public WebElement firstItemName;

    @FindBy(xpath = "//div[@class = 'item'][2]//div[@class = 'name']/a")
    public WebElement secondItemName;

    @FindBy(xpath = "//div[@class = 'item'][1]//span[@class = 'compare_add_link comparep cs']")
    public WebElement firstItemCompare;

    @FindBy(xpath = "//div[@class = 'item'][2]//span[@class = 'compare_add_link comparep cs']")
    public WebElement secondItemCompare;

    @FindBy(xpath = "//div[3]/div[4]/span[3]/a")
    public WebElement compareButton;

    public MicroOvenProductPage goToFirstItem() {

        firstItemName.click();
        return new MicroOvenProductPage(driver);
    }

    public MicroOvenProductPage goToSecondItem() {

        secondItemName.click();
        return new MicroOvenProductPage(driver);
    }


    public MicroovenPage selectFirstItem() {
        firstItemCompare.click();
        return new MicroovenPage(driver);

    }

    public MicroovenPage selectSecondItem() {
        secondItemCompare.click();
        return new MicroovenPage(driver);
    }

    public ComparisonPage compare() {

        compareButton.click();
        return new ComparisonPage(driver);
    }


}
