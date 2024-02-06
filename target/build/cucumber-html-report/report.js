$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/web/Saucedemo.feature");
formatter.feature({
  "name": "Prueba de compra",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Saucedemo"
    },
    {
      "name": "@FlujoDeCompra"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Añadir un cliente en el sistema Fixed Parametrizado",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "abro la pagina de saucedemo con el navegador edge",
  "keyword": "Given "
});
formatter.step({
  "name": "ingreso \"\u003cusuario\u003e\" en el campo Username del login",
  "keyword": "And "
});
formatter.step({
  "name": "ingreso \"\u003cpassword\u003e\" en el campo Password del login",
  "keyword": "And "
});
formatter.step({
  "name": "obtengo un login exitoso",
  "keyword": "And "
});
formatter.step({
  "name": "Agrego el primer producto al carrito \"\u003cprimerIten\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Agrego el segundo producto al carrito \"\u003csegundoIten\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Visualizo que se agregaron correctamente",
  "keyword": "And "
});
formatter.step({
  "name": "Hago click en el botton checkout",
  "keyword": "And "
});
formatter.step({
  "name": "ingreso mi \"\u003cfirstname\u003e\" en el campo de nombre",
  "keyword": "And "
});
formatter.step({
  "name": "ingreso mi \"\u003clastname\u003e\" en el campo de apellido",
  "keyword": "And "
});
formatter.step({
  "name": "ingreso mi \"\u003czipcode\u003e\" en el campo de codigo postal",
  "keyword": "And "
});
formatter.step({
  "name": "hago click en el boton finalizar",
  "keyword": "And "
});
formatter.step({
  "name": "valido la confirmación de la compra con el mensaje \"\u003cmensajeFinal\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "usuario",
        "password",
        "primerIten",
        "segundoIten",
        "firstname",
        "lastname",
        "zipcode",
        "mensajeFinal"
      ]
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce",
        "Sauce Labs Backpack",
        "Sauce Labs Bolt T-Shirt",
        "alex",
        "alvarez",
        "04004",
        "Thank you for your order!"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Añadir un cliente en el sistema Fixed Parametrizado",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Saucedemo"
    },
    {
      "name": "@FlujoDeCompra"
    }
  ]
});
formatter.step({
  "name": "abro la pagina de saucedemo con el navegador edge",
  "keyword": "Given "
});
formatter.match({
  "location": "SaucedemoStepDefinition.abro_la_pagina_de_saucedemo_con_el_navegador_edge()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingreso \"standard_user\" en el campo Username del login",
  "keyword": "And "
});
formatter.match({
  "location": "SaucedemoStepDefinition.ingreso_en_el_campo_username_del_login(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingreso \"secret_sauce\" en el campo Password del login",
  "keyword": "And "
});
formatter.match({
  "location": "SaucedemoStepDefinition.ingreso_en_el_campo_password_del_login(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "obtengo un login exitoso",
  "keyword": "And "
});
formatter.match({
  "location": "SaucedemoStepDefinition.obtengo_un_login_exitoso()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Agrego el primer producto al carrito \"Sauce Labs Backpack\"",
  "keyword": "When "
});
formatter.match({
  "location": "SaucedemoStepDefinition.agregoElPrimerProductoAlCarrito(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Agrego el segundo producto al carrito \"Sauce Labs Bolt T-Shirt\"",
  "keyword": "And "
});
formatter.match({
  "location": "SaucedemoStepDefinition.agregoElSegundoProductoAlCarrito(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Visualizo que se agregaron correctamente",
  "keyword": "And "
});
formatter.match({
  "location": "SaucedemoStepDefinition.Visualizo_que_se_agregaron_correctamente()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Hago click en el botton checkout",
  "keyword": "And "
});
formatter.match({
  "location": "SaucedemoStepDefinition.Hago_click_en_el_botton_checkout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingreso mi \"alex\" en el campo de nombre",
  "keyword": "And "
});
formatter.match({
  "location": "SaucedemoStepDefinition.ingreso_mi_en_el_campo_de_nombre(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingreso mi \"alvarez\" en el campo de apellido",
  "keyword": "And "
});
formatter.match({
  "location": "SaucedemoStepDefinition.ingreso_mi_en_el_campo_de_apellido(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ingreso mi \"04004\" en el campo de codigo postal",
  "keyword": "And "
});
formatter.match({
  "location": "SaucedemoStepDefinition.ingreso_mi_en_el_campo_de_codigo_postal(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "hago click en el boton finalizar",
  "keyword": "And "
});
formatter.match({
  "location": "SaucedemoStepDefinition.hago_click_en_el_boton_finalizar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido la confirmación de la compra con el mensaje \"Thank you for your order!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SaucedemoStepDefinition.valido_la_confirmación_de_la_compra_con_el_mensaje(String)"
});
formatter.result({
  "status": "passed"
});
});