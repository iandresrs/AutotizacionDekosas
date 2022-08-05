package com.dekosas.Steps;

import com.dekosas.Models.EsperaImplicita;
import com.dekosas.PageObjects.InformacionProductoPageObject;
import com.dekosas.Utils.Datos;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.io.IOException;

public class InformacionProductoStep {
    InformacionProductoPageObject informacionProductoPageObject = new InformacionProductoPageObject();
    Datos datosExcel = new Datos();

    EsperaImplicita espera = new EsperaImplicita();
    @Step
    public void validarMensajeInformacionProducto(){
        Assert.assertThat(informacionProductoPageObject.getDriver().findElement(
                informacionProductoPageObject.getLblValidarMensajeInformacionProducto()
        ).isDisplayed(), Matchers.is(true));
    }

    @Step
    public void cambiarCantidadArticulo() throws IOException {
        informacionProductoPageObject.getDriver().findElement(informacionProductoPageObject.getTxtCantidadArticulo()).clear();
        informacionProductoPageObject.getDriver().findElement(informacionProductoPageObject.getTxtCantidadArticulo()
        ).sendKeys(datosExcel.leerDatosExcel("Datos.xlsx","Categoria",1,1));
    }

    @Step
    public void clickBtnCarrito(){
        informacionProductoPageObject.getDriver().findElement(informacionProductoPageObject.getBtnAgregarCarrito()).click();
    }

    @Step
    public void agregarCarritoCompras() throws IOException {
        cambiarCantidadArticulo();
        espera.EsperaImplicita(5);
    }

    @Step
    public void esperarCarga(){
        espera.EsperaImplicita(5);
        clickBtnCarrito();
    }


}
