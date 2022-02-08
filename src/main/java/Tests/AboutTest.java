package Tests;

import Pages.AboutPage;
import Testbase.TestBase;
import org.testng.annotations.Test;

import java.io.IOException;

public class AboutTest extends TestBase {

    @Test
    public void about() throws IOException {
        pageFactory.getLoginPage().login();
        pageFactory.getAboutPage().about();
    }
}
