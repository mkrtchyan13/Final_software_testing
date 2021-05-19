package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private WebDriver driver;
    //private By collusion = By.xpath("//*[@id=\"chrome-app-container\"]/section[9]/article/div[3]/ul/li[3]/a");
    private By passwordField = By.xpath("//*[@id=\"ap_password\"]");
    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }
    private By button2 = By.xpath("//*[@id=\"signInSubmit\"]");


//    public Product chooseProduct(){
//        driver.findElement(collusion).click();
//        return new Product(driver);
//    }

     public void setPasswordField(String password) {
         driver.findElement(passwordField).sendKeys(password);
     }


    public Product chooseProduct(){
        driver.findElement(button2).click();
        return new Product(driver);
    }


}
