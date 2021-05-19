package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {

    private WebDriver driver;
    private By emailField = By.xpath("//*[@id=\"ap_email\"]");
    private By button = By.xpath("//*[@id=\"continue\"]");

    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmailField(String email) {
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(emailField)));
        driver.findElement(emailField).sendKeys(email);
    }




    public SecureAreaPage clickLoginButton(){
        driver.findElement(button).click();
        return new SecureAreaPage(driver);
    }
}