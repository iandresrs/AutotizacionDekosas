package com.dekosas.Steps;

import com.dekosas.Models.EsperaImplicita;
import com.dekosas.PageObjects.PaginaCancelarCompra;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

public class PaginaCancelarCompraStep {
    PaginaCancelarCompra paginaCancelarCompra = new PaginaCancelarCompra();
    EsperaImplicita esperaImplicita = new EsperaImplicita();
    @Step
    public void clickVerAriticulos(){
        esperaImplicita.EsperaImplicita(10);
        paginaCancelarCompra.getDriver().findElement(paginaCancelarCompra.getBtnCajaCompra()).click();
    }

    @Step
    public void verCarrito(){
        paginaCancelarCompra.getDriver().findElement(paginaCancelarCompra.getBtnVerCarrito()).click();
    }

    @Step
    public void eliminarProductos(){

        while (paginaCancelarCompra.getDriver().findElement(paginaCancelarCompra.getBtnEliminarArticulo()).isDisplayed()){
           esperaImplicita.EsperaImplicita(10);
           paginaCancelarCompra.getDriver().findElement(paginaCancelarCompra.getBtnEliminarArticulo())
                   .click();
           
       }
    }

}
