package com.dekosas.Step;

import com.dekosas.Models.EsperaImplicita;
import com.dekosas.PageObjects.LoginPageObject;
import com.dekosas.Utils.Datos;
import net.thucydides.core.annotations.Step;

import java.io.IOException;

public class LoginStep {
    LoginPageObject loginPageObject = new LoginPageObject();
    Datos datosExcel = new Datos();
    @Step
    public void ingresarEmail() throws IOException {
        loginPageObject.getDriver().findElement(loginPageObject.getTxtEmail())
                .sendKeys(datosExcel.leerDatosExcel("Datos.xlsx", "Login", 1, 0));
    }
    @Step
    public void ingresarClave() throws IOException {
        loginPageObject.getDriver().findElement(loginPageObject.getTxtClave())
                .sendKeys(datosExcel.leerDatosExcel("Datos.xlsx", "Login", 1, 1));
    }
    @Step
    public void clickEntrar() {
        loginPageObject.getDriver().findElement(loginPageObject.getBtnEntrar()).click();
    }
    @Step
    public void inicioSesion() throws IOException {
        ingresarEmail();
        ingresarClave();
        clickEntrar();
    }
}
