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


public class BreadMakerPage extends AbstractPage {

    public BreadMakerPage(WebDriver driver) {

        super(driver, Constants.URL);
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//div[@class = 'group'][3]//a[text() = '" + Constants.BREAD_MAKER_MANUFACTURER + "']")
    public WebElement manufacturer;

    @FindBy(xpath = "//div[@class = 'group'][8]//a[2]")
    public WebElement weightAdjuster;

    @FindBy(xpath = "//div[@class = 'catalog']//div[@class = 'name']")
    public List<WebElement> manufactureListWebElements;

    @FindBy(xpath = "//div[@class = 'description']" )
    public List<WebElement> descriptionWebElements;

    public BreadMakerPage selectManufacturer() {
        manufacturer.click();
        return new BreadMakerPage(driver);
    }

    public BreadMakerPage selectWeightAdjuster() {
        weightAdjuster.click();
        return new BreadMakerPage(driver);
    }


    public ArrayList getManufactureList() {

        ArrayList<String> manufactures = new ArrayList<String>();

        for (WebElement webElement : manufactureListWebElements) {
            String[] tokens = webElement.getText().split(" ");
            String manufacture = tokens[0];
            manufactures.add(manufacture);
        }

        return manufactures;
    }

    public boolean verifyManufacturerPresents(String manufactureName) {

        boolean flag = false;

        List<String> manufactureList = getManufactureList();
        for (String manufactureNameTemp : manufactureList) {

            if (manufactureName.equals(manufactureNameTemp)) {

                flag = true;

            } else {
                flag = false;
                break;
            }

        }

        return flag;
    }

    public ArrayList<String> getDescriptions() {

        ArrayList<String> descriptions = new ArrayList<String>();

        for (WebElement webElement : descriptionWebElements) {
            System.out.println(webElement.getText());
            descriptions.add(webElement.getText());
        }

        return descriptions;
    }

    public boolean verifyWeightAdjusterPresents(List<String> currentList) {

        boolean flag = false;
        String weightAdj = "Регулировка веса";
        for (String description : currentList) {
            if (description.contains(weightAdj)) {

                flag = true;
            } else {
                flag = false;
                break;
            }
        }

        return flag;
    }


}