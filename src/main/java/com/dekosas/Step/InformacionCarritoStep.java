package com.dekosas.Step;

import com.dekosas.Models.EsperaImplicita;
import com.dekosas.PageObjects.InformacionProductoPageObject;
import com.dekosas.Utils.Datos;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class InformacionCarritoStep {
    InformacionProductoPageObject informacionProductoPageObject = new InformacionProductoPageObject();
    EsperaImplicita espera = new EsperaImplicita();
    Datos datosExcel = new Datos();
    @Step
    public void agregarCarritoCompras(){
        espera.esperaImplicita(5);
        informacionProductoPageObject.getDriver().findElement(informacionProductoPageObject.getBtnAgregarCarrito()).click();
    }
    @Step
    private void  limpiarCantidadArticulo(){
        informacionProductoPageObject.getDriver().findElement(informacionProductoPageObject.getTxtCantidadArticulo()).clear();
    }
    @Step
    private void cambiarCantidadArticulo() throws IOException {
        informacionProductoPageObject.getDriver().findElement(informacionProductoPageObject.getTxtCantidadArticulo()
        ).sendKeys(datosExcel.leerDatosExcel("Datos.xlsx","Categoria",1,1));
    }
    @Step
    public void cantidadArticulo() throws IOException {
        limpiarCantidadArticulo();
        cambiarCantidadArticulo();
    }
}
