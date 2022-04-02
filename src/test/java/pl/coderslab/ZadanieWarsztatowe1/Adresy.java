package pl.coderslab.ZadanieWarsztatowe1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adresy {

    @FindBy(xpath="/html/body/main/section/div/div/section/section/div[3]/a")
    private WebElement dodajNowyAdres;
    @FindBy(xpath = "/html/body/main/section/div/div/section/section/div[2]/article/div[1]/address")
    private WebElement noweDaneAdresowe;

    public Adresy(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void dodajNowyAdres(){
        dodajNowyAdres.click();
    }

    public String zwrocDaneAdresowe() {
        return noweDaneAdresowe.getText();
    }
}
