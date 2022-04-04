package pl.coderslab.ZadanieWarsztatowe2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Odziez {
    @FindBy(xpath = "/html/body/main/section/div/div[2]/section/section/div[3]/div/div[1]/article[2]/div/div[1]/h2/a")
    private WebElement hummingbingPrintedSweater;

    public Odziez(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void przejdzDoHummingbingPrintedSweater() {
        hummingbingPrintedSweater.click();
    }
}
