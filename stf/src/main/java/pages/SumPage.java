package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SumPage {
    private WebDriver driver;
    private By sumvalue = By.xpath("//*[@id=\"sc-subtotal-amount-buybox\"]/span");
    private By changeQuant = By.name("quantity");
    private By value = By.xpath("//*[@id=\"a-popover-5\"]/div/div/ul/li[4]");
    private By quantity = By.className("a-dropdown-prompt");


    public SumPage(WebDriver driver) {
        this.driver = driver;
    }

    public double returnSum (){
        String aa= driver.findElement(sumvalue).getText();
        aa = aa.replaceAll("[$,]", "");
        double val11 = Double.parseDouble(aa);
        return val11;
    }

    public int changeQuantity (int option){
        Select aaaaa = new Select(driver.findElement(changeQuant));
        aaaaa.selectByIndex(option);
        String aaa= driver.findElement(quantity).getText();
        int blah = Integer.parseInt(aaa);
        return blah;
    }

    public String deleteItem (){
        Select aaaaaa = new Select(driver.findElement(changeQuant));
        aaaaaa.selectByIndex(0);
        String newaa =driver.findElement((By.xpath("//*[@id=\"sc-subtotal-label-buybox\"]"))).getText();
        return newaa;
    }
}
