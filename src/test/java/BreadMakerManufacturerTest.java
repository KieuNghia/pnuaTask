import com.epam.kiieu.utils.pages.Constants;
import com.epam.kiieu.utils.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;


public class BreadMakerManufacturerTest extends BaseTest {


    @Test(description = "Page contain only goods only from selected manufacture")
    public void BreadMakerManufactureTest(){

        mainPage.goToBreadMakerPage().selectManufacturer();
        Assert.assertTrue(breadMakerPage.verifyManufacturerPresents(Constants.BREAD_MAKER_MANUFACTURER), "Some manufacturer are not "+ Constants.BREAD_MAKER_MANUFACTURER+"");
        Assert.assertFalse(breadMakerPage.verifyManufacturerPresents(Constants.NOT_PRESENTED_MANUFACTURER),"Some manufacturer are "+Constants.NOT_PRESENTED_MANUFACTURER+" ");

    }


}
