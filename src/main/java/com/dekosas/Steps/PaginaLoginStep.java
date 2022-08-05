package com.dekosas.Steps;

import com.dekosas.PageObjects.PaginaLoginPageObject;
import com.dekosas.Utils.Datos;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class PaginaLoginStep {
    PaginaLoginPageObject paginaLoginPageObject = new PaginaLoginPageObject();
    Datos datos = new Datos();

    @Step
    public void ingresarEmail() throws IOException {
        paginaLoginPageObject.getDriver().findElement(paginaLoginPageObject.getTxtEmail())
                .sendKeys(datos.leerDatosExcel("Datos.xlsx", "Login", 1, 0));
    }

    @Step
    public void ingresarClave() throws IOException {
        paginaLoginPageObject.getDriver().findElement(paginaLoginPageObject.getTxtClave())
                .sendKeys(datos.leerDatosExcel("Datos.xlsx", "Login", 1, 1));
    }

    @Step
    public void clickIngresar() {
        paginaLoginPageObject.getDriver().findElement(paginaLoginPageObject.getBtnEntrar()).click();
    }

}
