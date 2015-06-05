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
public class MainPage  extends AbstractPage{

    public MainPage(WebDriver driver){

        super(driver, Constants.URL);
        PageFactory.initElements(driver, this);
    }


    @FindBy(linkText = "Холодильники")
    public WebElement fridgeCategory;

    @FindBy(linkText = "Микроволновки")
    public WebElement microwaveOven;

    @FindBy (linkText = "Стиральные машины")
    public WebElement washMachine;


    @FindBy (linkText = "Хлебопечи")
    public WebElement breadMaker;



    public FridgePage moveToFridgePage(){

        fridgeCategory.click();

        return new FridgePage(driver);

    }

    public MicrowaveOvenPage moveToMicrowaveOvenPage(){

        microwaveOven.click();

        return new MicrowaveOvenPage(driver);
    }

    public WashMachinePage movetToWashMachinePage(){

        washMachine.click();
        return new WashMachinePage(driver);
    }
}



