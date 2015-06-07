package com.epam.kiieu.pages;

import com.epam.kiieu.objects.MicroOven;
import com.epam.kiieu.utils.pages.AbstractPage;
import com.epam.kiieu.utils.pages.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MicroOvenProductPage extends AbstractPage {

    public static MicroOven microOven1;
    public static MicroOven microOven2;

    public MicroOvenProductPage(WebDriver driver) {

        super(driver, Constants.URL);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class = 'row'][1]/span[@class = 'val']")
    public WebElement itemType;

    @FindBy(xpath = "//div[@class = 'row'][2]/span[@class = 'val']")
    public WebElement itemVolume;

    @FindBy(xpath = "//div[@class = 'row'][3]/span[@class = 'val']")
    public WebElement itemInnerCoating;

    @FindBy(xpath = "//div[@class = 'row'][4]/span[@class = 'val']")
    public WebElement itemPower;

    public  String getItemType() {

        String itemTypeString = itemType.getText();
        return itemTypeString;
    }

    public String getItemVolume() {

        String itemVolumeString = itemVolume.getText();
        return itemVolumeString;
    }

    public String getItemInnerCoating() {

        String itemCoatingString = itemInnerCoating.getText();
        return itemCoatingString;
    }

    public String getItemPower() {

        String itemPowerString = itemPower.getText();
        return itemPowerString;
    }

    public  void createFirstItem(){
        microOven1 = new MicroOven(getItemType(),getItemVolume(),getItemInnerCoating(),getItemPower());

    }
    public  void createSecondItem(){
        microOven2 = new MicroOven(getItemType(),getItemVolume(),getItemInnerCoating(),getItemPower());

    }

    public static String getTypeFirstItem(){
        return microOven1.getType();
    }

    public static String getVolumeFirstItem(){
        return microOven1.getVolume();
    }

    public static String getInnerCoatingFirstItem(){
        return microOven1.getInnerCoating();
    }

    public static String getPowerFirstItem(){
        return microOven1.getPower();
    }


    public static String getTypeSecondItem(){
        return microOven2.getType();
    }

    public static String getVolumeSecondItem(){
        return microOven2.getVolume();
    }

    public static String getInnerCoatingSecondItem(){
        return microOven2.getInnerCoating();
    }

    public static String getPowerSecondItem(){
        return microOven2.getPower();
    }

    public  MicroovenPage goBack(){
        driver.navigate().back();
        return new MicroovenPage(driver);

    }

}