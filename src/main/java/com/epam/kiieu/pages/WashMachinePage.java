package com.epam.kiieu.pages;

import com.epam.kiieu.utils.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by nghia on 04.06.2015.
 */
public class WashMachinePage extends AbstractPage {

    public WashMachinePage(WebDriver driver){

        super(driver,driver.getCurrentUrl());
        PageFactory.initElements(driver, this);
    }
}
