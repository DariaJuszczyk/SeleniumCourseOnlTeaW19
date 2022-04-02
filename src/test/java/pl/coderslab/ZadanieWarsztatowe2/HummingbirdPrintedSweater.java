package pl.coderslab.ZadanieWarsztatowe2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HummingbirdPrintedSweater {
    @FindBy(className = "discount-percentage")
    private WebElement wielkoscRabatu;
    @FindBy(id = "group_1")
    private WebElement rozmiar;
//    @FindBy(xpath = "/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[1]/div/span[3]/button[1]")
//    private WebElement zwiekszIlosc;
    @FindBy(className = "add")
    private WebElement dodajDoKoszyka;
//    @FindBy(className = "btn-primary")
//    @FindBy(className = "btn btn-primary" )
    @FindBy (xpath = "//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div/div/a")
    private WebElement koszyk;


    public HummingbirdPrintedSweater(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public String dajWielkoscRabatu(){
        return wielkoscRabatu.getText();
    }

    public void wybierzRozmiar(String pRozmiar) {
        rozmiar.sendKeys(pRozmiar);
    }

    public void zwiekszIlosc(Integer pIlosc){
//        for (int i=1; i<=pIlosc; i++)
//            zwiekszIlosc.click();
    }

    public void dodajDoKoszyka(){
        dodajDoKoszyka.click();
    }

    public void przejdzDoKoszyka(){
        koszyk.click();
    }
}
