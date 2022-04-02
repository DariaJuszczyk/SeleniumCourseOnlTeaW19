package pl.coderslab.ZadanieWarsztatowe2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.ZadanieWarsztatowe1.Logowanie;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Zadanie2 {
    private WebDriver driver;

    @Given("^Otwarcie w przeglądarce strony do logowania (.*)$")
    public void otworzStrone(String adresURL) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.get(adresURL);
    }
    @When("^Wprowadzenie do pola Email adresu użytkownika: (.*) i wprowadzenie do pola Password hasła powiązanego z kontem: (.*) oraz wciśnięcie SIGN IN i przejdz do CLOTHES$")
    public void zalogujUzytkownika(String adresEmail, String haslo) {
        pl.coderslab.ZadanieWarsztatowe2.Logowanie l = new pl.coderslab.ZadanieWarsztatowe2.Logowanie(driver);
        l.zaloguj(adresEmail, haslo);
        l.przejdzDoClothes();
    }

    @And("^Przejscie do produktu Hummingbing Printed Sweater$")
    public void przejdzDoHummingbirdPrintedSweater(){
        Odziez o = new Odziez(driver);
        o.przejdzDoHummingbingPrintedSweater();
    }

    @And("^Sprawdzenie czy rabat wynosi 20 procent, wybranie rozmiaru M , wybranie 5 sztuk, dodanie produktów do koszyka$")
    public void przeniesDoKoszyka(){
        HummingbirdPrintedSweater h = new HummingbirdPrintedSweater(driver);
        String rabat = h.dajWielkoscRabatu();
        assertEquals("SAVE 20%", rabat);
        h.wybierzRozmiar("M");
//        h.zwiekszIlosc(5);
        h.dodajDoKoszyka();
        h.przejdzDoKoszyka();
    }

    @And("^Potwierdzenie adresu dostawy$")
    public void potwierdzAdres(){

    }
    @And("^Wybranie metody odbioru: PrestaShop$")
    public void wybierzMetodeOdbioru(){

    }
    @And("^Wybranie płatności: Pay by Check i zaznaczenie zgody na warunki skorzystania z usługi$")
    public void wybierzMetodePlatnosci(){

    }
    @And("^Złożenie zamówienia$")
    public void zlozZamowienie(){

    }
    @Then("^Zrobienie screenshota z potwierdzeniem zamówienia i kwotą$")
    public void screen(){

    }
}
