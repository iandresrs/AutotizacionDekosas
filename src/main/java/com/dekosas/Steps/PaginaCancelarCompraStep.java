package com.dekosas.Steps;

import com.dekosas.Models.EsperaImplicita;
import com.dekosas.PageObjects.PaginaCancelarCompra;
import net.thucydides.core.annotations.Step;

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
        esperaImplicita.EsperaImplicita(10);
        paginaCancelarCompra.getDriver().findElement(paginaCancelarCompra.getBtnEliminarArticulo())
                .click();
    }

}
