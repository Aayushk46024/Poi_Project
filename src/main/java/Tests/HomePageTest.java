package Tests;

import Pages.AboutPage;
import Pages.HomePage;
import Testbase.TestBase;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePageTest extends TestBase {
    @Test
    public void homePageTest() throws IOException {
        pageFactory.getLoginPage().login();
        pageFactory.getHomePage().homePage();
    }
}
