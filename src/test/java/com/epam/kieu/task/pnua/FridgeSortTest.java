package com.epam.kieu.task.pnua;

import com.epam.kiieu.pages.MainPage;
import com.epam.kiieu.utils.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FridgeSortTest extends BaseTest {


    @Test
    public void testFridgeSorterByPrice() {
        mainPage.goToFridgePage().sortByPrice();
        Assert.assertTrue(fridgePage.verifyItemsAreSortedBy(fridgePage.getListofPrices()),"Test failed, fridge list is not sorted by price" );

    }

    @Test(dependsOnMethods = "testFridgeSorterByPrice")
    public void testFridgeSortedByName(){
        fridgePage.sortByName();
        Assert.assertTrue(fridgePage.verifyItemsAreSortedBy(fridgePage.getListofNames()), "Test failed, fridge names are not sorted correctly");


    }



}
