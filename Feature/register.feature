
Feature: Регистраци на потребител

  Scenario Outline: Регистрация на потребител
  
    Given Потребиля отваря формата за регистрация.
    When Въвежда име "<username>" 
    And Въвежда парола "<pass1>"
    And Въвежда втора парола "<pass2>"
    And Въвежда email "<email>"
    And Натиска върху бутона регистрирай
    Then Вижда съобщение "<message>" 

    Examples: 
      | username  | pass1   | pass2     | email  			|message  								|
      | validname |validpass| validpass |test@test.com|Успешно се регистрирахте!|
      | validname |v				| v 				|test@test.com|Въведете валидна парола|
      | validname |validpass| valреpass |test@test.com|Въведете еднакви пароли|
      | v 				|validpass| validpass |test@test.com|Въведете име с минимум три букви!|
      | vv 				|validpass| validpass |test@test.com|Въведете име с минимум три букви!|
      | validname|12345678901234567| 12345678901234567 |test@test.com|Паролата трябва да е максимум 16 синвола|
