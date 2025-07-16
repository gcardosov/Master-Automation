@feature1
Feature: Primera automatizacion

  @testGoogle
  Scenario: Validar una busqueda en Google
    Given estoy en Google
    When ingreso "bebbia" en el campo de busqueda
    And presiono el boton buscar
    Then valido que en los resultados aparece "bebbia"

  @testGoogle2 @pruebasEnGoogle
  Scenario: Validar una busqueda en google parte 2
    Given estoy en google
    When ingreso "Lego" en el campo de busqueda
    And presiono el boton de buscar
    Then valido que en los resultados aparece "Lego"