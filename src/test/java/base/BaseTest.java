package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;


public class BaseTest {
    public WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
        homePage = new HomePage(driver);
        driver.manage().window().maximize();
            }


    @AfterMethod
    public void tearDown(){
//        driver.quit()
            }
}
