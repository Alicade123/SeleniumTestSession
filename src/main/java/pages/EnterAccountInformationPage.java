package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class EnterAccountInformationPage {
    WebDriver driver;

    private By radio_inline = By.className("radio-inline");


private By password = By.id("password");

    public EnterAccountInformationPage(WebDriver driver) {
        this.driver = driver;
    }
    public void setData(String title, String Upassword){
        List<WebElement> titles  = driver.findElements(radio_inline);
        for (WebElement title_ : titles){
            if(title_.getText().equals(title))  title_.click();
        }
        driver.findElement(password).sendKeys(Upassword);
    }

    private  By dateofBirth_Day = By.cssSelector(".form-group .row #uniform-days");
    private By dateofBirth_Month = By.cssSelector(".form-group .row #uniform-months");
    private By dateofBirth_Year = By.cssSelector(".form-group .row #uniform-years");
    public void setbirthDate(String day, String month, String year){
        Select selectDay = new Select(driver.findElement(dateofBirth_Day));
        selectDay.selectByVisibleText(day);
        Select selectMonth = new Select(driver.findElement(dateofBirth_Month));
        selectMonth.selectByVisibleText(month);
        Select selectYear = new Select(driver.findElement(dateofBirth_Year));
        selectYear.selectByVisibleText(year);
    }
    private By offerFields = By.className(".checkbox");
    public void selectOffers(){
        List <WebElement> lists = driver.findElements(offerFields);
        for(WebElement list : lists){
            list.click();
        }

    }

    private By first_name = By.id("first_name");
    private By last_name = By.id("last_name");
    private By company = By.id("company");
    private By  address1 = By.id("address1");
    private By address2 = By.id("address2");
    private By state = By.id("state");
    private By city = By.id("city");
    private By zipcode = By.id("zipcode");
    private  By mobile_number = By.id("mobile_number");
    private By createButton = By.cssSelector("#form button");
    public AccountCreatedPage setAddressInformation(String fname, String lname, String companyName, String addressOne, String addressTwo, String stateName, String cityName, String zipcodeNumber, String phoneNumber){
        driver.findElement(first_name).sendKeys(fname);
        driver.findElement(last_name).sendKeys(lname);
        driver.findElement(company).sendKeys(companyName);
        driver.findElement(address1).sendKeys(addressOne);
        driver.findElement(address2).sendKeys(addressTwo);
        driver.findElement(state).sendKeys(stateName);
        driver.findElement(city).sendKeys(cityName);
        driver.findElement(zipcode).sendKeys(zipcodeNumber);
        driver.findElement(mobile_number).sendKeys(phoneNumber);
        driver.findElement(createButton).click();
        return new AccountCreatedPage(driver);
    }


}
