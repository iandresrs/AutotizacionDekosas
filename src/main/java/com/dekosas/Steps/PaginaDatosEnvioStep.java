package com.dekosas.Steps;

import com.dekosas.Models.EsperaImplicita;
import com.dekosas.PageObjects.PaginaDatosEnvioPageObject;
import com.dekosas.Utils.Datos;
import com.dekosas.Utils.ListasDesplegable;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class PaginaDatosEnvioStep {
    PaginaDatosEnvioPageObject paginaDatosEnvioPageObject = new PaginaDatosEnvioPageObject();
    Datos datosExcel = new Datos();
    EsperaImplicita espera = new EsperaImplicita();

    ListasDesplegable listasDesplegable = new ListasDesplegable();

    @Step
    public void ingresarDireccion() throws IOException {
        paginaDatosEnvioPageObject.getDriver().findElement(paginaDatosEnvioPageObject.getTxtDireccion())
                .sendKeys(datosExcel.leerDatosExcel("Datos.xlsx","Formulario",1,0));
    }

    @Step
    public void seleccionarEstado() throws IOException {
        String valor = datosExcel.leerDatosExcel("Datos.xlsx","Formulario",1,1);
        listasDesplegable.seleccionarTextoVisible(paginaDatosEnvioPageObject.getLstEstado(),valor,paginaDatosEnvioPageObject.getDriver());
    }

    @Step
    public void ingresarCiudad() throws IOException {
        paginaDatosEnvioPageObject.getDriver().findElement(paginaDatosEnvioPageObject.getLtsCidudad())
                .sendKeys(datosExcel.leerDatosExcel("Datos.xlsx","Formulario",1,2));
    }

    @Step
    public void ingresarTelefono() throws IOException {
        paginaDatosEnvioPageObject.getDriver().findElement(paginaDatosEnvioPageObject.getTxtTelefono())
                .sendKeys(datosExcel.leerDatosExcel("Datos.xlsx","Formulario",1,3));
    }

    @Step
    public void seleccionarTipoIdentidad() throws IOException {
        String valor = datosExcel.leerDatosExcel("Datos.xlsx","Formulario",1,4);
        listasDesplegable.seleccionarTextoVisible(paginaDatosEnvioPageObject.getLstTipoIdentidad(),valor,paginaDatosEnvioPageObject.getDriver());
    }

    @Step
    public void ingresarNumeroIndetidad() throws IOException {
        espera.EsperaImplicita(5);
        paginaDatosEnvioPageObject.getDriver().findElement(paginaDatosEnvioPageObject.getTxtNumeroIdentidad())
                .sendKeys(datosExcel.leerDatosExcel("Datos.xlsx","Formulario",1,5));
    }


}
