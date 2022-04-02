Feature: Zalogowany użytkownik włoży produkt do koszyka i kupi go

  Scenario Outline: Zalogowanie na https://mystore-testlab.coderslab.pl, dodanie produktów do koszyka, złożenie zamówienia
    Given Otwarcie w przeglądarce strony do logowania https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=my-account
    When Wprowadzenie do pola Email adresu użytkownika: rudaspamowe@gmail.com i wprowadzenie do pola Password hasła powiązanego z kontem: 12345 oraz wciśnięcie SIGN IN i przejdz do CLOTHES
    And Przejscie do produktu Hummingbing Printed Sweater
    And Sprawdzenie czy rabat wynosi 20 procent, wybranie rozmiaru M , wybranie 5 sztuk, dodanie produktów do koszyka
    And Potwierdzenie adresu dostawy
    And Wybranie metody odbioru: PrestaShop
    And Wybranie płatności: Pay by Check i zaznaczenie zgody na warunki skorzystania z usługi
    And Złożenie zamówienia
    Then Zrobienie screenshota z potwierdzeniem zamówienia i kwotą