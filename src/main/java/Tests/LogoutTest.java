package Tests;

import Pages.AboutPage;
import Pages.LogoutPage;
import Testbase.TestBase;
import org.testng.annotations.Test;

import java.io.IOException;

public class LogoutTest extends TestBase {

    @Test
    public void logout() throws IOException {
        pageFactory.getLoginPage().login();
        pageFactory.getLogoutPage().logout();
    }
}
