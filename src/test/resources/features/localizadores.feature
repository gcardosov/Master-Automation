@feature2
Feature: Clase de localizadores

  @testlocalizadores
  Scenario: Validar login en pagina de ejemplo
    Given estoy en SwagLabs "https://www.saucedemo.com/"
    When ingreso "standard_user" en el campo de username
    And ingreso "secret_sauce" en el campo de password
    And presiono el boton login
    Then valido que me haya logueado en el sitio
