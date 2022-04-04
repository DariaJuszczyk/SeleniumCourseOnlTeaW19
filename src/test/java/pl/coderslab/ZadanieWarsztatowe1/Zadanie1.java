package pl.coderslab.ZadanieWarsztatowe1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.Zip;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Zadanie1 {
    private WebDriver driver;
    Logowanie l;

    @Given("^Otwarcie w przeglądarce strony do logowania (.*)$")
    public void otworzStrone(String adresURL) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.get(adresURL);
    }

    @When("^W polu Email zostanie wpisany adres użytkownika (.*)$")
    public void wpiszLogin(String pLogin) {
        l = new Logowanie(driver);
        l.uzupełnijLogin(pLogin);
    }

    @And("^W polu Password zostanie wprowadzone powiązane z kontem użytkownika hasło (.*)$")
    public void wpiszHaslo(String pHaslo) {
        l.uzupełnijHaslo(pHaslo);
    }

    @And("^Zostanie wciśnięty przycisk SIGN IN$")
    public void zaloguj() {
        l.zaloguj();
    }

    @And ("^Zostanie wciśnięty przycisk ADDRESSES$")
    public void przejdzDoAdresy() {
        MojeKonto p = new MojeKonto(driver);
        p.przejdzDoAdresy();
    }

    @And("^Zostanie wciśnięty przycisk Create new address$")
    public void dodajNowyAdres(){
        Adresy a = new Adresy(driver);
        a.dodajNowyAdres();
    }

    @And("^Zostanie wypełniony formularz z danymi adresowymi (.*) (.*) (.*) (.*) (.*) (.*) i zostanie wciśnięty przycisk SAVE$")
    public void wypelnijFormularzTeleadresowy(String alias, String ulica, String miasto, String kodPocztowy, String numerTelefonu, String kraj) {
        DodawanieAdresu d = new DodawanieAdresu(driver);
        d.wypełnijDaneTeleadresowe(alias, ulica, miasto, kodPocztowy, kraj, numerTelefonu);
        d.zapisz();
    }

    @Then("Do zalogowanego konta zostanie dodany nowy adres i sprawdzona jego zgodność z wprowadzanymi danymi")
    public void weryfikujCzyAdresPoprawny() {
        Adresy a = new Adresy(driver);
        String daneAdresowe = a.zwrocDaneAdresowe();

        assertEquals("Daria Juszczyk\n" +
                            "Terefere2\n" +
                            "Terefere3\n" +
                            "66-666\n" +
                            "United Kingdom\n" +
                            "000000000", daneAdresowe);
    }
}
