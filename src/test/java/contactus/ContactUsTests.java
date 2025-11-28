package contactus;

import base.BaseTest;
import org.testng.annotations.Test;



import static org.testng.Assert.assertEquals;

public class ContactUsTests extends BaseTest {
    @Test
    public  void contactUsTests(){
        //In This test
        var contactPage = homePage.clickContactUsLink();
        String name = "Alicade";
        String email = "abiturije@gmail.com";
        String subject = "Claim";
        String textArea = "Product receive was not good";
        String path = "D:\\document.pdf";
        String actualResult =contactPage.submitContact(name, email, subject, textArea,path);
        assertEquals(actualResult,"Success! Your details have been submitted successfully.", "failed");
    }
}
