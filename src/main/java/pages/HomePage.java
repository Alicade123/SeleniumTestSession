package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.DriverAction;
import java.time.Duration;
import java.util.List;

public class HomePage {
    WebDriver driver;
    private By loginSignupLink = By.linkText("Signup / Login");
    private By contactUsLink = By.linkText("Contact us");
    private By productDiv= By.cssSelector(".productinfo.text-center");
    private By addToCart = By.cssSelector("btn btn-default add-to-cart");
    private By continueToShoopingButton = By.className("btn.btn-success.close-modal.btn-block");
    private By statusMessage = By.cssSelector(".modal-body p");
    public HomePage (WebDriver driver){
        this.driver = driver;
    }

    //1. Click signup/login
    public Login_SignupPage clickLoginSignupLink(){
        driver.findElement(loginSignupLink).click();
        return new Login_SignupPage(driver);
    }
    //2. click contact us

    public ContactUsPage clickContactUsLink(){
        driver.findElement(contactUsLink).click();
        return new ContactUsPage(driver);
    }

    public String Model(int index){
        WebElement product= driver.findElements(productDiv).get(index);
        WebElement addToCartOne = driver.findElements(addToCart).get(index);
        Actions actions = new Actions(driver);
            actions.moveToElement(product).perform();
        addToCartOne.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("btn btn-success close-modal btn-block"))));
        String status = driver.findElement(statusMessage).getText();
        driver.findElement(continueToShoopingButton).click();
        return status;
    }
    public void hover(int index){
        WebElement product= driver.findElements(productDiv).get(index);
        Actions actions = new Actions(driver);
        actions.moveToElement(product).perform();
    }

}
