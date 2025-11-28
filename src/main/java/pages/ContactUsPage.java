package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {

    WebDriver driver;
    private By name = By.cssSelector("input[name='name']");
    private By email= By.cssSelector("input[name='email']");
    private By subject = By.cssSelector("input[name='subject']");
    private By textarea = By.cssSelector("textarea[name='message']");
    private By fileuploadInput = By.cssSelector("input[type='file']");
    private By submitButton = By.cssSelector(".form-group input[type='submit']");
    private By status = By.cssSelector(".status.alert.alert-success");

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }
    public String submitContact( String cName, String cEmail, String cSubject, String cTextarea, String absolutePath){
        driver.findElement(name).sendKeys(cName);
        driver.findElement(email).sendKeys(cEmail);
        driver.findElement(subject).sendKeys(cSubject);
        driver.findElement(textarea).sendKeys(cTextarea);
        driver.findElement(fileuploadInput).sendKeys(absolutePath);
        driver.findElement(submitButton).click();
        driver.switchTo().alert().accept();
        return driver.findElement(status).getText();
    }


}
