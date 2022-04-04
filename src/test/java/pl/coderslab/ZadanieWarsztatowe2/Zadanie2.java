package pl.coderslab.ZadanieWarsztatowe2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import jdk.jfr.Timespan;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Zadanie2 {
    private WebDriver driver;
    private Logowanie l;
    private HummingbirdPrintedSweater h;
    private Koszyk k;

    @Given("^Otwarcie w przeglądarce strony do logowania (.*)$")
    public void otworzStrone(String adresURL) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get(adresURL);
    }

    @When("^Wprowadzenie do pola Email adresu użytkownika: (.*)$")
    public void wprowadzLogin(String pLogin){
        l = new Logowanie(driver);
        l.wprowadzLogin(pLogin);
    }

    @And ("^Wprowadzenie do pola Password hasło powiązanego z kontem: (.*)$")
    public void wprowadzHaslo(String pHaslo){
        l.wprowadzHaslo(pHaslo);
    }

    @And ("^Wciśnięcie SIGN IN$")
    public void zaloguj(){
        l.zaloguj();
    }

    @And ("^Przejdz do CLOTHES$")
    public void przejdzDoClothes(){
        l.przejdzDoClothes();
    }

    @And("^Przejscie do produktu Hummingbing Printed Sweater$")
    public void przejdzDoHummingbirdPrintedSweater(){
        Odziez o = new Odziez(driver);
        o.przejdzDoHummingbingPrintedSweater();
    }

    @And("^Sprawdzenie czy rabat wynosi 20 procent$")
    public void sprawdzRabat(){
        h = new HummingbirdPrintedSweater(driver);
        String rabat = h.dajWielkoscRabatu();
        assertEquals("SAVE 20%", rabat);
    }

    @And("^Wybranie rozmiaru (.*)$")
    public void wybierzRozmiar(String pRozmiar){
        h.wybierzRozmiar(pRozmiar);
    }

    @And("^Wybranie (.*) sztuk$")
    public void wybieirzIlosc(Integer pIlosc){
        h.zwiekszIlosc(pIlosc);
    }

    @And("^Dodanie produktów do koszyka$")
    public void dodajDoKoszyka(){
        h.dodajDoKoszyka();
    }

    @And("^Przejście do koszyka$")
    public void przejdzDoKoszyka(){
        h.idzDoKoszyka();
    }

    @And ("^Przejdz do Proceed to checkout$")
    public void kliknijProceedToCheckout(){
        k = new Koszyk(driver);
        k.kliknijProceedToCheckout();
    }

    @And("^Potwierdzenie adresu dostawy$")
    public void wybierzAdresDostawy(){
        k.wybierzAdresDostawy();
    }

    @And("^Wybranie metody odbioru: PrestaShop$")
    public void wybierzMetodeOdbioru(){
        k.wybierzMetodeDostawy();
    }

    @And("^Wybranie płatności: Pay by Check$")
    public void wybierzMetodePlatnosci(){
        k.wybierzMetodePlatnosci();
    }

    @And("^Złożenie zamówienia$")
    public void zlozZamowienie(){
        k.zatwierdzWarunkiUmowy();
        k.zlozZamowienie();
    }

    @Then("^Zrobienie screenshota z potwierdzeniem zamówienia i kwotą$")
    public void screen() throws IOException {
        File tmpScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String currentDateTime = LocalDateTime.now().toString().replaceAll(":", "_");
        Files.copy(tmpScreenshot.toPath(), Paths.get("C:", "test-evidence", "zadanie2-"+currentDateTime+".png"));
    }
}
