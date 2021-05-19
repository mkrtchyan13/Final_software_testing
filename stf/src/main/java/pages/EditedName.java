package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditedName {
    private WebDriver driver;
    private By namevalue = By.xpath("//*[@id=\"cnep_1a_name_form\"]/div/div/div[1]/div[2]");
    public EditedName(WebDriver driver) {
        this.driver = driver;
    }
    public String getName(){
        String txt = driver.findElement(namevalue).getText();
        return txt;
    }
}
