package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditingPart {
    private WebDriver driver;
    private By nameField = By.xpath("//*[@id=\"ap_customer_name\"]");
    private By button6 = By.xpath("//*[@id=\"cnep_1C_submit_button\"]");


    public EditingPart(WebDriver driver) {
        this.driver = driver;
    }
    public void changeNameField(String name) {
        WebDriverWait wait = new WebDriverWait(driver, 1000);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(nameField)));
        driver.findElement(nameField).clear();
        driver.findElement(nameField).sendKeys(name);
    }

    public EditedName editedName(){
        driver.findElement(button6).click();
        return new EditedName(driver);
    }
}
