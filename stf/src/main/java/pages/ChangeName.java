package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangeName {
    private WebDriver driver;
    private By button5 = By.xpath("//*[@id=\"auth-cnep-edit-name-button\"]");
    public ChangeName(WebDriver driver) {
        this.driver = driver;
    }


      public EditingPart editName() {
        driver.findElement(button5).click();
        return new EditingPart(driver);
    }
}
