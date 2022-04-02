//package pl.coderslab;
//
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class Hotelzad2Test {
//    @Test
//    public void shouldSearchWitchDuckDuckGo(){
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://hotel-testlab.coderslab.pl/en/");
//        WebElement hotelLocationInput = driver.findElement(By.name("hotel_location"));
//        hotelLocationInput.clear();
//        hotelLocationInput.sendKeys("Warsaw");
//        WebElement newsletterEmailInput = driver.findElement(By.name("email"));
//        newsletterEmailInput.clear();
//        newsletterEmailInput.sendKeys("test@test.com");
//        WebElement SubscribeInput= driver.findElement(By.name("action"));
//        WebElement SearchNowInput= driver.findElement(By.name("search_room_submit"));
//        elem.click();
////      driver.quit();
//
//    }
//}
