#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

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
