Feature: Zalogowany użytkownik włoży produkt do koszyka i kupi go

  Scenario Outline: Zalogowanie na https://mystore-testlab.coderslab.pl, dodanie produktów do koszyka, złożenie zamówienia
    Given Otwarcie w przeglądarce strony do logowania https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=my-account
    When Wprowadzenie do pola Email adresu użytkownika: rudaspamowe@gmail.com
    And Wprowadzenie do pola Password hasło powiązanego z kontem: 12345
    And Wciśnięcie SIGN IN
    And Przejdz do CLOTHES
    And Przejscie do produktu Hummingbing Printed Sweater
    And Sprawdzenie czy rabat wynosi 20 procent
    And Wybranie rozmiaru L
    And Wybranie 5 sztuk
    And Dodanie produktów do koszyka
    And Przejście do koszyka
    And Przejdz do Proceed to checkout
    And Potwierdzenie adresu dostawy
    And Wybranie metody odbioru: PrestaShop
    And Wybranie płatności: Pay by Check
    And Złożenie zamówienia
    Then Zrobienie screenshota z potwierdzeniem zamówienia i kwotą