package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home {
    private WebDriver driver;

    public Home(WebDriver driver) {
        this.driver = driver;
    }

    public SignInPage clickSignIn() {
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
        return new SignInPage(driver);
    }

    public SearchPage search(String text) {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement searchInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("twotabsearchtextbox")));
        searchInput.sendKeys(text);
        driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
        return new SearchPage(driver);
    }

}
