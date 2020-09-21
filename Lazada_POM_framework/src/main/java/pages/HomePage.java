package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    private By topMenuLogin = By.xpath("//div[@id='anonLogin']");
    private By accountName = By.xpath("//span[@id='myAccountTrigger']");

    public LoginPage clickTopMenuLogin(){
        driver.findElement(topMenuLogin).click();
        return new LoginPage(driver);
    }

    public String getAccountName(){
       return driver.findElement(accountName).getText();
    }


}
