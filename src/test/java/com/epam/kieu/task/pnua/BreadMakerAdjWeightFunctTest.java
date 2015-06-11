package com.epam.kieu.task.pnua;

import com.epam.kiieu.utils.pages.Constants;
import com.epam.kiieu.utils.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class BreadMakerAdjWeightFunctTest extends BaseTest {


    @Test
    public void WeightAdjTest(){

        mainPage.goToBreadMakerPage().selectWeightAdjuster();

        //cant figure out whats wrong
        Assert.assertTrue(breadMakerPage.verifyWeightAdjusterPresents(breadMakerPage.getDescriptions()), "Some bread makers dont have weight adj function");
    }

}
