Feature: Вход в системата

  Scenario: Вход с валидни данни
    Given Потребителя отваря формата за вход в системата
    When Въвежда валидно потребителско име
    And Въвежда валидна парола
    And Натиска бутона Влез
    Then Вижда съобщение за успех

  Scenario: Вход с невалидни данни
    Given Потребителя отваря формата за вход в системата
    When Въвежда невалидно потребителско име
    And Въвежда невалидна парола
    And Натиска бутона Влез
    Then Вижда съобщение за невалидни потребителски данни
    
  Scenario: Вход без потребилско име
    Given Потребителя отваря формата за вход в системата
    When Въвежда валидна парола
    And Натиска бутона Влез
    Then Вижда съобщение да въведе валидно потребителско име

  Scenario: Вход без парола
    Given Потребителя отваря формата за вход в системата
    When Въвежда валидно потребителско име
    And Натиска бутона Влез
    Then Вижда съобщение да въведе валидна парола
