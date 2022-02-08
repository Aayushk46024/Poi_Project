package Pages;

import org.openqa.selenium.WebDriver;


public class PageDemo {
    WebDriver driver;

    private LoginPage loginPage;
    private HomePage homePage;
    private AboutPage aboutPage;
    private LogoutPage logoutPage;

    public PageDemo(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }
    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage(driver);
        }
        return homePage;
    }
    public AboutPage getAboutPage() {
        if (aboutPage == null) {
            aboutPage = new AboutPage(driver);
        }
        return aboutPage;
    }
    public LogoutPage getLogoutPage() {
        if (logoutPage == null) {
            logoutPage = new LogoutPage(driver);
        }
        return logoutPage;
    }
}
