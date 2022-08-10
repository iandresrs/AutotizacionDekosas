package com.dekosas.Step;

import com.dekosas.PageObjects.PaginaPrincipalPageObject;
import net.thucydides.core.annotations.Step;

public class PaginaPrincipalStep {

    PaginaPrincipalPageObject paginaPrincipalPageObject = new PaginaPrincipalPageObject();

    @Step
    public void abrirPagina(){
        paginaPrincipalPageObject.open();
    }

    @Step
    public void clickMicuenta(){
        paginaPrincipalPageObject.getDriver().findElement(
                paginaPrincipalPageObject.getBtnMiCuenta()
        ).click();
    }

}
