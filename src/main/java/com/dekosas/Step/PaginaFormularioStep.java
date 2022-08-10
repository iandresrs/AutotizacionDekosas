package com.dekosas.Step;

import com.dekosas.Models.EsperaImplicita;
import com.dekosas.PageObjects.PaginaFormularioPageObject;
import com.dekosas.Utils.Datos;
import com.dekosas.Utils.ListasDesplegable;
import cucumber.api.java.es.E;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class PaginaFormularioStep {

    PaginaFormularioPageObject paginaFormularioPageObject = new PaginaFormularioPageObject();
    Datos datosExcel = new Datos();
    EsperaImplicita espera = new EsperaImplicita();

    ListasDesplegable listasDesplegable = new ListasDesplegable();

    @Step
    public void ingresarDireccion() throws IOException {
        paginaFormularioPageObject.getDriver().findElement(paginaFormularioPageObject.getTxtDireccion())
                .sendKeys(datosExcel.leerDatosExcel("Datos.xlsx","Formulario",1,0));
    }
    @Step
    public void seleccionarEstado() throws IOException {
        String valor = datosExcel.leerDatosExcel("Datos.xlsx","Formulario",1,1);
        listasDesplegable.seleccionarTextoVisible(paginaFormularioPageObject.getLstEstado(),valor,paginaFormularioPageObject.getDriver());
    }
    @Step
    public void ingresarCiudad() throws IOException {
        paginaFormularioPageObject.getDriver().findElement(paginaFormularioPageObject.getLtsCidudad())
                .sendKeys(datosExcel.leerDatosExcel("Datos.xlsx","Formulario",1,2));
    }
    @Step
    public void ingresarTelefono() throws IOException {
        paginaFormularioPageObject.getDriver().findElement(paginaFormularioPageObject.getTxtTelefono())
                .sendKeys(datosExcel.leerDatosExcel("Datos.xlsx","Formulario",1,3));
    }
    @Step
    public void seleccionarTipoIdentidad() throws IOException {
        String valor = datosExcel.leerDatosExcel("Datos.xlsx","Formulario",1,4);
        listasDesplegable.seleccionarTextoVisible(paginaFormularioPageObject.getLstTipoIdentidad(),valor,paginaFormularioPageObject.getDriver());
    }
    @Step
    public void ingresarNumeroIndetidad() throws IOException {
        espera.esperaImplicita(5);
        paginaFormularioPageObject.getDriver().findElement(paginaFormularioPageObject.getTxtNumeroIdentidad())
                .sendKeys(datosExcel.leerDatosExcel("Datos.xlsx","Formulario",1,5));
    }
    @Step
    public void clickBtnCarritoFormulario(){
        espera.esperaImplicita(10);
        paginaFormularioPageObject.getDriver().findElement(paginaFormularioPageObject.getBtnClickCarrito()).click();
    }
    @Step
    public void abrirCarritoCompra(){
        paginaFormularioPageObject.getDriver().findElement(paginaFormularioPageObject.getBtnIrCarritoCompra()).click();
    }
    @Step
    public void LlenarFormulario() throws IOException {
        ingresarDireccion();
        seleccionarEstado();
        ingresarTelefono();
        seleccionarTipoIdentidad();
        ingresarNumeroIndetidad();
    }
    @Step
    public void irCarritoCompras(){
        clickBtnCarritoFormulario();
        abrirCarritoCompra();
    }
}
