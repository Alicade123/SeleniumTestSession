package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {
    WebDriver driver;
    private By statusMessagefield = By.partialLinkText("Logged in as");
    public DashboardPage(WebDriver driver){
        this.driver = driver;
    }
    public String getStatus(){
        return driver.findElement(statusMessagefield).getText();
    }

}

