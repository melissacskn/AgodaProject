package testingPlace;

import base.BaseTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RoomsPage;

public class TestPlacePicking extends BaseTest {
    HomePage homePage;
    RoomsPage roomsPage;
    @BeforeTest
    public void set(){
        homePage= new HomePage(driver);
        roomsPage=new RoomsPage(driver);
    }
    @Test
    public void testingPlacePicking() throws InterruptedException {
        homePage.selectPlace();
        homePage.selectGoingDate();
        homePage.personPicking();
        roomsPage.rooms();
    }
}
