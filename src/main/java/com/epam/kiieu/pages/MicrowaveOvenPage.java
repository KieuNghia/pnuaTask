package com.epam.kiieu.pages;

import com.epam.kiieu.utils.AbstractPage;
import com.epam.kiieu.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by nghia on 04.06.2015.
 */
public class MicrowaveOvenPage extends AbstractPage{

    public MicrowaveOvenPage(WebDriver driver){

        super(driver,driver.getCurrentUrl());
        PageFactory.initElements(driver, this);
    }
}
