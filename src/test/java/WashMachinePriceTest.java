import com.epam.kiieu.utils.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by nghia on 07.06.2015.
 */
public class WashMachinePriceTest extends BaseTest {

    @Test
    public void pricesTest(){

        mainPage.gotToWashMachinePage().setMinPrice().setMaxPrice();
        Assert.assertTrue(washingMachinePage.verifyPriceRange(washingMachinePage.getPriceList()), "some prices are wrong");
    }


}
