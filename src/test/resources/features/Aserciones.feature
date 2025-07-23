@feature_aserciones
Feature: Clase de Aserciones

  @testAserciones
  Scenario: Validar titulo en SauceDEmo
    Given estoy en SwagLabs "https://www.saucedemo.com/"
    Then Validar que el titulo sea "Swag Labs"
