package com.epam.kieu.task.pnua;

import com.epam.kiieu.utils.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class WashMachinePriceTest extends BaseTest {

    @Test
    public void pricesTest(){

        mainPage.gotToWashMachinePage().setMinPrice().setMaxPrice();
        Assert.assertTrue(washingMachinePage.verifyPriceRange(washingMachinePage.getPriceList()), "some prices are wrong");
    }


}
