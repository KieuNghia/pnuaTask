import com.epam.kiieu.pages.MicroOvenProductPage;
import com.epam.kiieu.utils.tests.BaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by nghia on 07.06.2015.
 */
public class MicroOvenComparisonTest extends BaseTest{

    @Test(description = "test check 2 item description")
    public void microOvenTest(){
        mainPage.goToMicrowaveOvenPage().goToFirstItem().createFirstItem();
        microOvenProductPage.goBack().goToSecondItem().createSecondItem();

        microOvenProductPage.goBack().selectFirstItem().selectSecondItem().compare();


//first item
        Assert.assertTrue(MicroOvenProductPage.getTypeFirstItem().equals(comparisonPage.getFirstItemType()), "items type not same");
        Assert.assertTrue(MicroOvenProductPage.getVolumeFirstItem().equals(comparisonPage.getFirstItemVolume()), "items type not same");
        Assert.assertTrue(MicroOvenProductPage.getInnerCoatingFirstItem().equals(comparisonPage.getFirstItemCoating()), "items coating not same");
        Assert.assertTrue(MicroOvenProductPage.getPowerFirstItem().equals(comparisonPage.getFirstItemPower()), "items power not same");
//second item
        Assert.assertTrue(MicroOvenProductPage.getTypeSecondItem().equals(comparisonPage.getSecondItemType()), "items type not same");
        Assert.assertTrue(MicroOvenProductPage.getVolumeSecondItem().equals(comparisonPage.getSecondItemVolume()), "items volume not same");
        Assert.assertTrue(MicroOvenProductPage.getInnerCoatingSecondItem().equals(comparisonPage.getSecondItemCoating()), "items coating not same");
        Assert.assertTrue(MicroOvenProductPage.getPowerSecondItem().equals(comparisonPage.getSecondItemPower()), "items power not same");
//difference color check

        Assert.assertTrue(comparisonPage.firstItemType.getCssValue("background-color").equals(comparisonPage.secondItemType.getCssValue("background-color")), "colors of item type element not same");
        Assert.assertTrue(comparisonPage.firstItemVolume.getCssValue("background-color").equals(comparisonPage.secondItemVolume.getCssValue("background-color")), "colors of item volume element not same");
        Assert.assertTrue(comparisonPage.firstItemCoating.getCssValue("background-color").equals(comparisonPage.secondItemCoating.getCssValue("background-color")), "colors of item coating element not same");
        Assert.assertTrue(comparisonPage.firstItemPower.getCssValue("background-color").equals(comparisonPage.secondItemPower.getCssValue("background-color")), "colors of item power element not same");











    }

}
