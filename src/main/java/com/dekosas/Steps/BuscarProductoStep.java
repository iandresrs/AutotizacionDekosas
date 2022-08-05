package com.dekosas.Steps;

import com.dekosas.Models.EsperaImplicita;
import com.dekosas.PageObjects.BuscarProductoPageObject;
import com.dekosas.Utils.Datos;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class BuscarProductoStep {
    BuscarProductoPageObject buscarProductoPageObject = new BuscarProductoPageObject();
    Datos datosExcel = new Datos();


    @Step
    public void buscarCategoria() throws IOException {
        buscarProductoPageObject.getDriver().findElement(buscarProductoPageObject.getTxtBuscar())
                .sendKeys(datosExcel.leerDatosExcel(
                        "Datos.xlsx", "Categoria", 1, 0
                ));
    }

    @Step
    public void seleccionarCategoria() {
        buscarProductoPageObject.getDriver().findElement(buscarProductoPageObject.getLblCategoria()).click();
    }

    @Step
    public void elegirCategoria() throws IOException {
        buscarCategoria();
        seleccionarCategoria();
    }
}
