package com.epam.kieu.task.pnua;

import com.epam.kiieu.pages.AirConditionPage;
import com.epam.kiieu.pages.AirConditionPriceCatalog;
import com.epam.kiieu.pages.AirConditionProductPage;
import com.epam.kiieu.utils.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Kuanh_Nhkhiia_Kiieu on 10.06.2015.
 */
public class MinPriceComparisonTest extends BaseTest {

    @Test(description = "test that min price are the same in 3 places")
    public void minPriceCheck() {
        mainPage.goToAirConditionPage().selectManufacture().setMinPriceFirstProduct().selectFirstProduct().setMinPriceFirstProduct().
                goBack().goToPriceCatalog().selectManufacture().setMinPriceFirstProduct();

      /*  System.out.printf(String.valueOf(AirConditionPage.getMinPriceFirstElement()));
        System.out.printf(String.valueOf(AirConditionProductPage.getMinPriceFirstElement()));
        System.out.printf(String.valueOf(AirConditionPriceCatalog.getMinPriceFirstElement()));*/
        Assert.assertTrue(AirConditionPage.getMinPriceFirstElement() == AirConditionProductPage.getMinPriceFirstElement(), "Price are not same in product page and catalog page");
        Assert.assertTrue(AirConditionProductPage.getMinPriceFirstElement() == AirConditionPriceCatalog.getMinPriceFirstElement(), "Price are not same in catalog page and price catalog page");


    }


}
