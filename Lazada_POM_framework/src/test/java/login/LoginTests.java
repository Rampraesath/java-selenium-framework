package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import static org.testng.Assert.assertEquals;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessLogin(){
        LoginPage loginPage = homePage.clickTopMenuLogin();
        loginPage.setUserName("rampraesath.kumaran@gmail.com");
        loginPage.setPassword("Nescafe21");
        HomePage homePage = loginPage.clickSubmit();
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException ie){
        }
        assertEquals(loginPage.getErrorMessage(),
                "Something went wrong, please Refresh and try again.",
                "Failed");

    }
}
