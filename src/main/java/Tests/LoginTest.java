package Tests;

import Pages.LoginPage;
import Testbase.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends TestBase {

    @Test
    public void logindetails() throws IOException {
        pageFactory.getLoginPage().login();
    }
}
