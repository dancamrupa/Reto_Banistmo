#Autor: Danny Ruiz

Feature: Ingreso al portal de Bancolombia
  Como usuario de Bancolombia
  Quiero visualizar la tasa nominal efectiva

  Scenario: Visualizar la tasa nominal efectiva
    Given ingreso a la pagina de Bancolombia
    When ingreso a la seccion de tasa nominal a tasa efectiva
    Then puedo visualizar el porcentaje de la tasa nominal efectiva