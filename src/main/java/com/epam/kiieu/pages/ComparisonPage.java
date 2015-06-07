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

/**
 * Created by nghia on 07.06.2015.
 */
public class ComparisonPage extends AbstractPage {

    public ComparisonPage(WebDriver driver){

        super(driver, Constants.URL);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//tr[7]/td[2]")
    public WebElement firstItemType;

    @FindBy(xpath = "//tr[7]/td[3]")
    public WebElement secondItemType;

    @FindBy(xpath = "//tr[8]/td[2]")
    public WebElement firstItemVolume;

    @FindBy(xpath = "//tr[8]/td[3]")
    public WebElement secondItemVolume;

    @FindBy(xpath = "//tr[9]/td[2]")
    public WebElement firstItemCoating;

    @FindBy(xpath = "//tr[9]/td[3]")
    public WebElement secondItemCoating;

    @FindBy(xpath = "//tr[10]/td[2]")
    public WebElement firstItemPower;

    @FindBy(xpath = "//tr[10]/td[3]")
    public WebElement secondItemPower;



    public String getFirstItemType(){
        return firstItemType.getText();
    }
    public String getSecondItemType(){
        return secondItemType.getText();
    }

    public String getFirstItemVolume(){
        return firstItemVolume.getText();
    }
    public String getSecondItemVolume(){
        return secondItemVolume.getText();
    }

    public String getFirstItemCoating(){
        return firstItemCoating.getText();
    }

    public String getSecondItemCoating(){
        return secondItemCoating.getText();
    }

    public String getFirstItemPower(){
        return firstItemPower.getText();
    }

    public String getSecondItemPower(){
        return secondItemPower.getText();
    }




}
