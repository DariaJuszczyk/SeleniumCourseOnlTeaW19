package pl.coderslab.ZadanieWarsztatowe1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DodawanieAdresu {
    @FindBy(name = "alias")
    private WebElement alias;
    @FindBy(name = "address1")
    private WebElement adres;
    @FindBy(name = "city")
    private WebElement miasto;
    @FindBy(name = "postcode")
    private WebElement kodPocztowy;
    @FindBy(name = "id_country")
    private WebElement kraj;
    @FindBy(name = "phone")
    private WebElement numerTelefonu;
    @FindBy(className = "btn")
    private WebElement btnZapisz;
    Select dropdown;

    public DodawanieAdresu(WebDriver driver) {
        PageFactory.initElements(driver, this);
        dropdown = new Select (driver.findElement(By.name("id_country")));
    }

    public void wypełnijDaneTeleadresowe(String alias, String adres, String miasto, String kodPocztowy, String kraj, String numerTelefonu) {
        this.alias.sendKeys(alias);
        this.adres.sendKeys(adres);
        this.miasto.sendKeys(miasto);
        this.kodPocztowy.sendKeys(kodPocztowy);
        dropdown.selectByValue(kraj);
        this.numerTelefonu.sendKeys(numerTelefonu);
    }

    public void zapisz() {
        this.btnZapisz.click();
    }
}
