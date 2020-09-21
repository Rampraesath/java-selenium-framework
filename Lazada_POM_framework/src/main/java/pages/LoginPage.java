package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver){

        this.driver = driver;
    }


    private By usernameField = By.xpath("//input[@placeholder='Please enter your Phone Number or Email']");
    private By passwordField = By.xpath("//input[@placeholder='Please enter your password']");
    private By submitButton = By.xpath("//button[@type='submit']");

//    private By slideButton = By.xpath("//span[@id='nc_6_n1z']");

    public void setUserName(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public HomePage clickSubmit(){

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement slideButton = driver.findElement(By.xpath("//span[@id='nc_2_n1z']"));
        Actions actions = new Actions(driver);


        try {
            driver.findElement(submitButton).click();
        } catch (Exception e) {

            actions.moveToElement(slideButton).clickAndHold(slideButton).moveByOffset(300, 0).release().perform();
        }
        
        return new HomePage(driver);
    }

}
