package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Settings {
    private WebDriver driver;
    private By button4 = By.xpath("//*[@id=\"a-page\"]/div[2]/div/div[2]/div[2]/a");
    public Settings(WebDriver driver) {
        this.driver = driver;
    }
    public ChangeName changeName() {
        driver.findElement(button4).click();
        return new ChangeName(driver);
    }
}
