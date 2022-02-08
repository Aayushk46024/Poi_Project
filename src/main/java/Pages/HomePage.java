package Pages;

import Testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    WebDriver driver;
    @FindBy(partialLinkText = "Sauce Labs Backpack")
    WebElement Product;
    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement AddToCart;
    @FindBy(className = "shopping_cart_link")
    WebElement ShoppingCart;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void homePage()
    {
        Product.click();
        AddToCart.click();
        ShoppingCart.click();
    }

}
