package pl.coderslab.ZadanieWarsztatowe1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MojeKonto {
    @FindBy(id = "addresses-link")
    private WebElement adresy;

    public MojeKonto(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void przejdzDoAdresy() {
        adresy.click();
    }

}
