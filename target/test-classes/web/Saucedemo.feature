@Saucedemo

  @FlujoDeCompra
  Feature: Prueba de compra
  Scenario Outline: Añadir un cliente en el sistema Fixed Parametrizado
    Given abro la pagina de saucedemo con el navegador edge
    And ingreso "<usuario>" en el campo Username del login
    And ingreso "<password>" en el campo Password del login
    And obtengo un login exitoso
    When Agrego el primer producto al carrito "<primerIten>"
    And Agrego el segundo producto al carrito "<segundoIten>"
    And Visualizo que se agregaron correctamente
    And Hago click en el botton checkout
    And ingreso mi "<firstname>" en el campo de nombre
    And ingreso mi "<lastname>" en el campo de apellido
    And ingreso mi "<zipcode>" en el campo de codigo postal
    And hago click en el boton finalizar
    Then valido la confirmación de la compra con el mensaje "<mensajeFinal>"
    Examples:
      | usuario       | password     | primerIten          | segundoIten             | firstname | lastname | zipcode | mensajeFinal              |
      | standard_user | secret_sauce | Sauce Labs Backpack | Sauce Labs Bolt T-Shirt | alex      | alvarez  | 04004   | Thank you for your order! |
