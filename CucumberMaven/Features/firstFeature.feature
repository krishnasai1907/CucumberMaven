@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Title of your scenario
    Given Browser is launched
    When User enter the url as "https://www.redbus.in"
    #Then User landed on Login Page
    #When User enters the credentials "<username>" and "<password>"
    Examples:
    |username|password|
    |Admin|admin123|
