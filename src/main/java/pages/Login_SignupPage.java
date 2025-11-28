package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_SignupPage {
    WebDriver driver;
    private By username =By.cssSelector(".signup-form form input[type='text']");
    private By email = By.cssSelector(".signup-form form input[type='email']");
    private By signupButton = By.cssSelector(".signup-form button");
    public Login_SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    public EnterAccountInformationPage setCredentials(String Uname, String Uemail){
        driver.findElement(username).sendKeys(Uname);
        driver.findElement(email).sendKeys(Uemail);
        driver.findElement(signupButton).click();
        return new EnterAccountInformationPage(driver);
    }
    private By emailLogin =By.cssSelector(".login-form form input[type='email']");
    private By passwordLogin = By.cssSelector(".login-form form input[type='password']");
    private By loginButton = By.cssSelector(".login-form form button");
    public DashboardPage enterCredentialsToLogin(String loginEmail, String loginPassword){
        driver.findElement(emailLogin).sendKeys(loginEmail);
        driver.findElement(passwordLogin).sendKeys(loginPassword);
        driver.findElement(loginButton).click();
        return new DashboardPage(driver);

    }

}
