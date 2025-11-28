package login;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class LoginTests extends BaseTest {
    @Test
    public void testLogin(){
        String email = "abiturije1alicade@gmail.com";
        String password = "1234567890";
        String username = "Alicade";
        var loginPage = homePage.clickLoginSignupLink();
        var dashboardPage =loginPage.enterCredentialsToLogin(email, password);
        String actualResults= dashboardPage.getStatus();
        assertTrue(actualResults.contains("Logged in a"), "Something went wrong");

    }
}
