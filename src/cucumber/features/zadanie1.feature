Feature: Dodawanie adresu dla zalogowanego na stronie https://mystore-testlab.coderslab.pl użytkownika

  Scenario Outline: Zalogowanie na https://mystore-testlab.coderslab.pl i dodawanie nowego adresu użytkownika
    Given Otwarcie w przeglądarce strony do logowania https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=my-account
    When W polu Email zostanie wpisany adres użytkownika rudaspamowe@gmail.com i w polu Password zostanie wprowadzone powiązane z kontem użytkownika hasło 12345 i zostanie wciśnięty przycisk SIGN IN
    And Zostanie wciśnięty przycisk ADDRESSES
    And Zostanie wciśnięty przycisk Create new address
    And Zostanie wypełniony formularz z danymi adresowymi <Alias> <Address> <City> <Zip> <Phone> <Country> i zostanie wciśnięty przycisk SAVE
    Then Do zalogowanego konta zostanie dodany nowy adres i sprawdzona jego zgodność z wprowadzanymi danymi

    Examples:
      | Alias   | Address   | City      | Zip    | Phone     | Country |
      | Firmowy | Terefere2 | Terefere3 | 66-666 | 000000000 | 17      |

