package signup;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

import static org.testng.Assert.assertTrue;

public class SignupTests extends BaseTest {
    @Test
    public void testSignup(){
        String name ="Alicade";
        String email = "abiturije4@gmail.com";
        var loginSignupPage = homePage.clickLoginSignupLink();
        var enterSignupInfoPage = loginSignupPage.setCredentials(name, email);
        enterSignupInfoPage.setData("Mrs.", "1234567890");
//        enterSignupInfoPage.setbirthDate("3", "December", "2002");
        enterSignupInfoPage.selectOffers();
        var accountCreatedPage =enterSignupInfoPage.setAddressInformation(
                "Alicade", "Abiturije", "TheGym", "kigali-Rwanda", "Kicukiro",
                "Kigali", "Kigali City" ,"00000", "0789052944"
        );
        String expectedResults = "Account Created!";
        String actualResult = accountCreatedPage.getSignupStatus();
        assertTrue(actualResult.contains(expectedResults.toUpperCase()), "something went wrong");
    }
}
