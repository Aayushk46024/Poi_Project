package Pages;

import Testbase.TestBase;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class LoginPage extends TestBase {
    WebDriver driver;
    @FindBy(id = "user-name")
    WebElement uname;
    @FindBy(id = "password")
    WebElement pass;
    @FindBy(id = "login-button")
    WebElement loginbutton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login() throws IOException {

        String path = System.getProperty("user.dir");
        FileInputStream fs = new FileInputStream(path+"//TestData//Login_Data.xls");

        HSSFWorkbook workbook = new HSSFWorkbook(fs);
        HSSFSheet sheet = workbook.getSheetAt(0);
        String username = sheet.getRow(1).getCell(0).getStringCellValue();
        String password = sheet.getRow(1).getCell(1).getStringCellValue();
        uname.sendKeys(username);
        pass.sendKeys(password);
        loginbutton.click();
    }
}
