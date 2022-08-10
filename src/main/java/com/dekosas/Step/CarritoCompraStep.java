package com.dekosas.Step;

import com.dekosas.Models.EsperaImplicita;
import com.dekosas.PageObjects.CarritoComprasPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class CarritoCompraStep {
    CarritoComprasPageObject carritoComprasPageObject = new CarritoComprasPageObject();
    EsperaImplicita espera = new EsperaImplicita();

    @Step
    public void verificarCarritoCompra() {

        Assert.assertThat(carritoComprasPageObject.getDriver().findElement(
                carritoComprasPageObject.getLblVerificarCarritoCompra()
        ).isDisplayed(), Matchers.is(true));
    }
    @Step
    public void pasarCaja() {
        espera.esperaImplicita(5);
        carritoComprasPageObject.getDriver().findElement(carritoComprasPageObject.getBtnPasarCaja()).click();
    }
    @Step
    private boolean elementoVisible() {
        try {
            if (carritoComprasPageObject.getDriver().findElement(carritoComprasPageObject.getBtnEliminarProducto()).isDisplayed()) {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
        return false;
    }
    @Step
    public void eliminarProductos() {
        espera.esperaImplicita(5);
        while (elementoVisible()) {
            carritoComprasPageObject.getDriver().findElement(carritoComprasPageObject.getBtnEliminarProducto()).click();
        }

    }
    @Step
    public void carritoVacio() {
        Assert.assertThat(carritoComprasPageObject.getDriver().findElement(carritoComprasPageObject.getMsjValidacionCarritoVacio())
                .isDisplayed(), Matchers.is(true));
    }
    @Step
    public void verificarCarritoVacio(){
        eliminarProductos();
        carritoVacio();
    }
}
