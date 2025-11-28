package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountCreatedPage {
    WebDriver driver;
    private By signupStatus = By.cssSelector(".title.text-center b");

    public AccountCreatedPage(WebDriver driver) {
        this.driver = driver;
    }

    public  String getSignupStatus(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(signupStatus)));
        return driver.findElement(signupStatus).getText();
    }

}
