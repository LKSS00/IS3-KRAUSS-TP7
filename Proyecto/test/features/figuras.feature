Feature: Cálculo de áreas geométricas
  Como usuario del sistema de figuras
  Quiero poder calcular el área exacta de distintas formas geométricas
  Para conocer el espacio total que ocupan

  Scenario: Calcular el área de un círculo correctamente
    Given un círculo instanciado con el nombre "Rueda" y un radio de 10.20
    When el sistema invoca la función de cálculo de área
    Then el resultado devuelto debe ser aproximadamente 326.85