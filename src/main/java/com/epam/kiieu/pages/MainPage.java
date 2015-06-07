package com.epam.kiieu.pages;

import com.epam.kiieu.utils.pages.AbstractPage;
import com.epam.kiieu.utils.pages.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by nghia on 04.06.2015.
 */
public class MainPage  extends AbstractPage{

    public MainPage(WebDriver driver){

        super(driver, Constants.URL);
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[@href='http://pn.com.ua/ct/2163/']")
    public WebElement fridgeCategory;

    @FindBy(xpath = "//a[@href='http://pn.com.ua/ct/2137/']")
    public WebElement microwaveOven;

    @FindBy (xpath = "//a[@href='http://pn.com.ua/ct/2161/'] ")
    public WebElement washMachine;

    @FindBy (xpath = "//a[@href='http://pn.com.ua/ct/2138/']")
    public WebElement breadMaker;



    public FridgePage goToFridgePage(){

        fridgeCategory.click();

        return new FridgePage(driver);

    }

    public MicroovenPage goToMicrowaveOvenPage(){

        microwaveOven.click();

        return new MicroovenPage(driver);
    }

    public WashingMachinePage gotToWashMachinePage(){

        washMachine.click();
        return new WashingMachinePage(driver);
    }

    public BreadMakerPage goToBreadMakerPage (){

        breadMaker.click();
        return new BreadMakerPage(driver);

    }


}



