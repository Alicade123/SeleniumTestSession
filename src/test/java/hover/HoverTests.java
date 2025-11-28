package hover;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HoverTests extends BaseTest {
    @Test
    public void hoverTest(){
         homePage.hover(0);

    }
}
