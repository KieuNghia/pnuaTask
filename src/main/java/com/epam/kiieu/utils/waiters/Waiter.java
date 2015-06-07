package com.epam.kiieu.utils.waiters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by nghia on 07.06.2015.
 */
public class Waiter {

    public static void waitForElementPresent(WebDriver driver, String element){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement elementWait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
    }


}
