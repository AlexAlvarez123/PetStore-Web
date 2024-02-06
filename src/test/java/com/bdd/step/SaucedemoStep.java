package com.bdd.step;

import com.bdd.page.SaucedemoPage;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

@DefaultUrl("https://www.saucedemo.com/")
public class SaucedemoStep extends ScenarioSteps {

    SaucedemoPage saucedemoPage;
    @Step
    public void abro_la_pagina_de_saucedemo_con_el_navegador_edge(){
        saucedemoPage.abro_la_pagina_de_saucedemo_con_el_navegador_edge();
    }
    @Step
    public void ingreso_el_usuario (String firstName){
        saucedemoPage.ingreso_el_usuario(firstName);
    }

    public void ingreso_el_password (String lastName){
        saucedemoPage.ingreso_el_password(lastName);
    }
    @Step
    public void ingreso_en_el_campo_password_del_login(){
        saucedemoPage.hacemosClickEnElBoton();
    }
    @Step
    public void primerProducto(String primerProducto){

        saucedemoPage.primerproducto(primerProducto);
    }

    public void segundoIten(String segundoIten) {
        saucedemoPage.segundoproducto(segundoIten);
    }
    public void clickenelcarrito(){
        saucedemoPage.Clickenelcarrito();
    }
    public void Clickenelbotoncontinuar(){
        saucedemoPage.Clickenelbotoncontinuar();
    }
    public void ingreso_el_nombre(String nombre) {
        saucedemoPage.ingresoelnombre(nombre);
    }
    public void ingreso_el_apellido(String apellido) {
        saucedemoPage.ingresoelapellido(apellido);
    }
    public void ingreso_el_zipcode(String zipcode) {
        saucedemoPage.ingresoelzipcode(zipcode);
    }
    public void hagoclickenelbotoncheck(){
        saucedemoPage.hagoclickenelbotoncheck();
    }
    public void hagoclickenelbotonfinish(){
        saucedemoPage.hagoclickenelbotonfinish();
    }
    public void verificarmensajefinal(String mensaje){
        saucedemoPage.verificarmensajefinal(mensaje);
    }
}
