package com.bdd.page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
@DefaultUrl("https://www.saucedemo.com/ ")
public class SaucedemoPage extends PageObject {

    @FindBy(xpath ="//input[@id='user-name']")
    WebElement usuario;
    @FindBy(xpath ="//input[@id='password']")
    WebElement password;
    @FindBy(xpath ="//input[@id='login-button']")
    WebElement Btn_Forms;
    @FindBy(xpath ="//button[@class='btn btn_primary btn_small btn_inventory']")
    WebElement addbutton;
    @FindBy(xpath ="//button[text()='Back to products']")
    WebElement backbutton;
    @FindBy(xpath ="//a[@class='shopping_cart_link']")
    WebElement IconoCarrito;
    @FindBy(xpath ="//button[@class='btn btn_action btn_medium checkout_button ']")
    WebElement checkbutton;
    @FindBy(xpath ="//input[@id='first-name']")
    WebElement inputnombre;
    @FindBy(xpath ="//input[@id='last-name']")
    WebElement inputapellido;
    //input[@id='postal-code']
    @FindBy(xpath ="//input[@id='postal-code']")
    WebElement inputazipcode;
    @FindBy(xpath ="//input[@id='continue']")
    WebElement continuebutton;
    @FindBy(xpath ="//button[@id='finish']")
    WebElement finishbutton;
    @FindBy(xpath ="//h2[@class='complete-header']")
    WebElement mensajefinal;
    public void abro_la_pagina_de_saucedemo_con_el_navegador_edge(){
        Browser.Start(this,"edge");
    }
    public void ingreso_el_usuario(String firstName){
        usuario.sendKeys(firstName);
    }
    public void ingreso_el_password(String lastName){
        password.sendKeys(lastName);
    }
    public void hacemosClickEnElBoton() {
        Btn_Forms.click();
    }
    public void primerproducto(String primerProducto){
        WebElement primerproducto = find(By.xpath("//div[@class=\"inventory_item_name \" and contains(text(),'"+ primerProducto +"')]"));
        primerproducto.click();
        addbutton.click();
        backbutton.click();

    }
    public void segundoproducto(String segundoIten) {
        WebElement segundoproducto = find(By.xpath("//div[@class=\"inventory_item_name \" and contains(text(),'"+ segundoIten +"')]"));
        segundoproducto.click();
        addbutton.click();
        backbutton.click();
    }
    public void Clickenelcarrito(){
        IconoCarrito.click();
    }
    public void Clickenelbotoncontinuar(){
        checkbutton.click();
    }
    public void ingresoelnombre(String nombre) {
        inputnombre.sendKeys(nombre);
    }
    public void ingresoelapellido(String apellido) {
        inputapellido.sendKeys(apellido);
    }
    public void ingresoelzipcode(String zipcode) {
        inputazipcode.sendKeys(zipcode);
    }
    public void hagoclickenelbotoncheck(){
        continuebutton.click();
    }
    public void hagoclickenelbotonfinish(){
        finishbutton.click();
    }
    public void verificarmensajefinal(String mensaje){
        String texto = mensajefinal.getText();
        Assert.assertEquals(mensaje,texto);
    }
}
