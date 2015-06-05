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
public class ProductPage extends AbstractPage{

    public ProductPage(WebDriver driver){

        super(driver, Constants.URL);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text() = 'цена']")
    public WebElement priceSort;

    @FindBy(xpath = "//a[text() = 'попул€рность']")
    public WebElement popularitySort;

    @FindBy(xpath = "//div[@class = 'catalog']//div[@class = 'item'][1]/div[@class = 'price']")
    public WebElement priceOfFfirstElement;

    public ProductPage sortByPrice(){

        priceSort.click();
        return new ProductPage(driver);

    }

    public ProductPage sortByPopularity(){
        popularitySort.click();

        return new ProductPage(driver);

    }

    public boolean verifyPriceSorter(){



    }




}
