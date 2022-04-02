package pl.coderslab.ZadanieWarsztatowe1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logowanie {
    @FindBy(name="email")
    private WebElement email;
    @FindBy(name="password")
    private WebElement haslo;
    @FindBy(id="submit-login")
    private WebElement btnZaloguj;

    public Logowanie(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void zaloguj(String pEmail, String pHaslo){
        this.email.clear();
        this.haslo.clear();
        this.email.sendKeys(pEmail);
        this.haslo.sendKeys(pHaslo);
        this.btnZaloguj.click();
    }
}