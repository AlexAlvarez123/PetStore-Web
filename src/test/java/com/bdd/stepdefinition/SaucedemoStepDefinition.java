package com.bdd.stepdefinition;

import com.bdd.step.SaucedemoStep;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SaucedemoStepDefinition {

    @Steps
    SaucedemoStep saucedemoStep;

    @Given("^abro la pagina de saucedemo con el navegador edge$")
    public void abro_la_pagina_de_saucedemo_con_el_navegador_edge() {
        saucedemoStep.abro_la_pagina_de_saucedemo_con_el_navegador_edge();
    }

    @And("^ingreso \"([^\"]*)\" en el campo Username del login$")
    public void ingreso_en_el_campo_username_del_login(String firstname) {
        saucedemoStep.ingreso_el_usuario(firstname);
    }

    @And("^ingreso \"([^\"]*)\" en el campo Password del login$")
    public void ingreso_en_el_campo_password_del_login(String lastName) {

        saucedemoStep.ingreso_el_password(lastName);
    }

    @And("^obtengo un login exitoso$")
    public void obtengo_un_login_exitoso() {
        saucedemoStep.ingreso_en_el_campo_password_del_login();
    }

    @And("^Visualizo que se agregaron correctamente$")
    public void Visualizo_que_se_agregaron_correctamente() {
        saucedemoStep.clickenelcarrito();
    }

    @And("^Hago click en el botton checkout$")
    public void Hago_click_en_el_botton_checkout() {
        saucedemoStep.Clickenelbotoncontinuar();
    }

    @And("^ingreso mi \"([^\"]*)\" en el campo de nombre$")
    public void ingreso_mi_en_el_campo_de_nombre(String nombre) {
        saucedemoStep.ingreso_el_nombre(nombre);
    }

    @And("^ingreso mi \"([^\"]*)\" en el campo de apellido$")
    public void ingreso_mi_en_el_campo_de_apellido(String apellido) {
        saucedemoStep.ingreso_el_apellido(apellido);
    }

    @And("^ingreso mi \"([^\"]*)\" en el campo de codigo postal$")
    public void ingreso_mi_en_el_campo_de_codigo_postal(String zipcode) {
        saucedemoStep.ingreso_el_zipcode(zipcode);
    }

    @And("^hago click en el boton finalizar$")
    public void hago_click_en_el_boton_finalizar() {
        saucedemoStep.hagoclickenelbotoncheck();
        saucedemoStep.hagoclickenelbotonfinish();
    }

    @Then("^valido la confirmación de la compra con el mensaje \"([^\"]*)\"$")
    public void valido_la_confirmación_de_la_compra_con_el_mensaje(String mensaje) {
        saucedemoStep.verificarmensajefinal(mensaje);
    }

    @When("^Agrego dos productos al carrito \"([^\"]*)\"$")
    public void agregoDosProductosAlCarrito(String primerIten) {
        saucedemoStep.primerProducto(primerIten);
    }

    @When("^Agrego el primer producto al carrito \"([^\"]*)\"$")
    public void agregoElPrimerProductoAlCarrito(String primerIten) {

        saucedemoStep.primerProducto(primerIten);
    }

    @And("^Agrego el segundo producto al carrito \"([^\"]*)\"$")
    public void agregoElSegundoProductoAlCarrito(String segundoIten) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        saucedemoStep.segundoIten(segundoIten);
    }
}
