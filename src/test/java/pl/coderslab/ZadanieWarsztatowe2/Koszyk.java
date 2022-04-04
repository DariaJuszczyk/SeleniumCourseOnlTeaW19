package pl.coderslab.ZadanieWarsztatowe2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Koszyk {
    @FindBy(className = "btn-primary")
    private WebElement kontynuuj;
    @FindBy(name = "id_address_delivery")
    private WebElement wybierzAdresDostawy;
    @FindBy(name = "confirm-addresses")
    private WebElement zatwierdzAdresDostawy;
    @FindBy(name = "confirmDeliveryOption")
    private WebElement zawierdzMetodeDostawy;
    @FindBy(id = "payment-option-1")
    private WebElement platnoscCzekiem;
    @FindBy(id = "conditions_to_approve[terms-and-conditions]")
    private WebElement zgodaNaWarunkiUmowy;
    @FindBy(xpath = "//div[@id=\"payment-confirmation\"]/div[1]/button")
    private WebElement zlozZamowienie;

    public Koszyk(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void kliknijProceedToCheckout(){
        kontynuuj.click();
    }

    public void wybierzAdresDostawy(){
        zatwierdzAdresDostawy.click();
    }
    public void wybierzMetodeDostawy(){
        zawierdzMetodeDostawy.click();
    }

    public void wybierzMetodePlatnosci(){
        platnoscCzekiem.click();
    }

    public void zatwierdzWarunkiUmowy(){
        zgodaNaWarunkiUmowy.click();
    }

    public void zlozZamowienie(){
        zlozZamowienie.click();
    }
}
