package pl.coderslab.ZadanieWarsztatowe2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class HummingbirdPrintedSweater {
    @FindBy(className = "discount-percentage")
    private WebElement wielkoscRabatu;
    @FindBy(id = "group_1")
    private WebElement rozmiar;
    @FindBy(xpath = "/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[1]/div/span[3]/button[1]")
    private WebElement zwiekszIlosc;
    @FindBy(className = "add-to-cart")
    private WebElement dodajDoKoszyka;
    @FindBy(className = "btn-primary")
    private WebElement koszyk;

    WebDriver d;
    @FindBy(className = "cart-products-count")
    private WebElement cart;


    public HummingbirdPrintedSweater(WebDriver driver) {
        PageFactory.initElements(driver, this);
        d = driver;
    }

    public String dajWielkoscRabatu(){
        return wielkoscRabatu.getText();
    }

    public void wybierzRozmiar(String pRozmiar) {
        rozmiar.sendKeys(pRozmiar);
    }

    public void zwiekszIlosc(Integer pIlosc){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i=1; i < pIlosc; i++)
            zwiekszIlosc.click();
    }

    public void dodajDoKoszyka(){
        dodajDoKoszyka.click();
    }

    public void przejdzDoKoszyka(){
        koszyk.click();
    }

    public void idzDoKoszyka(){
        d.get("https://mystore-testlab.coderslab.pl/index.php?controller=cart&action=show");
        cart.click();
    }
}
