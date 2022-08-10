package com.dekosas.Step;

import com.dekosas.PageObjects.PaginaInicioPageObject;
import com.dekosas.Utils.Datos;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

import java.io.IOException;

public class PaginaInicioStep {
    PaginaInicioPageObject paginaInicioPageObject = new PaginaInicioPageObject();
    Datos datosExcel = new Datos();
    @Step
    public void validacionLogin(){
        Assert.assertThat(paginaInicioPageObject.getDriver().findElement(
                paginaInicioPageObject.getMsjValidacionLogin()
        ).isDisplayed(), Matchers.is(true));
    }

    @Step
    public void buscarCategoria() throws IOException {
        paginaInicioPageObject.getDriver().findElement(
                paginaInicioPageObject.getTxtBuscarCategoria()
        ).sendKeys(datosExcel.leerDatosExcel("Datos.xlsx","Categoria",1,0));
    }

    @Step
    public void seleccionarCategoria(){
        paginaInicioPageObject.getDriver().findElement(
                paginaInicioPageObject.getLblseleccionCategoria()
        ).click();
    }

    @Step
    public void elegirCategoria() throws IOException {
        buscarCategoria();
        seleccionarCategoria();
    }
}
