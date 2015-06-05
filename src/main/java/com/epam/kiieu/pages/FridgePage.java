package com.epam.kiieu.pages;

import com.epam.kiieu.utils.AbstractPage;
import com.epam.kiieu.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by nghia on 04.06.2015.
 */
public class FridgePage  extends AbstractPage{

    public FridgePage(WebDriver driver){

        super(driver, Constants.URL);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text() = 'цена']")
    public WebElement priceSort;

    @FindBy(xpath = "//a[text() = 'попул€рность']")
    public WebElement popularitySort;

    @FindBy(xpath = "//div[@class = 'catalog']//div[@class = 'price'][1]")
    public w

    public FridgePage sortByPrice(){

        priceSort.click();
        return new FridgePage(driver);

    }

    public FridgePage sortByPopularity(){
        popularitySort.click();

        return new FridgePage(driver);

    }

    public boolean verifyPriceSorter(){



    }




}
