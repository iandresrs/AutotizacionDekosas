package com.dekosas.Steps;

import com.dekosas.Models.EsperaImplicita;
import com.dekosas.PageObjects.PaginaCarritoComprasPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class PaginaCarritoComprasStep {
    PaginaCarritoComprasPageObject paginaCarritoComprasPageObject = new PaginaCarritoComprasPageObject();
    EsperaImplicita espera = new EsperaImplicita();
    @Step
    public void validarMensajeCarritoCompras(){
        Assert.assertThat(paginaCarritoComprasPageObject.getDriver().findElement(
                paginaCarritoComprasPageObject.getMsjValidacionCarritoCompras()
        ).isDisplayed(), Matchers.is(true));
    }

    @Step
    public void clickInicio(){
        paginaCarritoComprasPageObject.getDriver().findElement(paginaCarritoComprasPageObject.getLnkInicio()).click();
    }

    @Step
    public void volverPaginaInicio(){
        validarMensajeCarritoCompras();
        clickInicio();
    }

    @Step
    public void validarCarritoVacio(){
        espera.EsperaImplicita(5);
        Assert.assertThat(paginaCarritoComprasPageObject.getDriver().findElement(
                paginaCarritoComprasPageObject.getLblValidarCarritoVacio()
        ).isDisplayed(),Matchers.is(true));
    }

    @Step
    public void clickPasarCaja(){
        espera.EsperaImplicita(10);
        paginaCarritoComprasPageObject.getDriver().findElement(paginaCarritoComprasPageObject.getBtnPasarCaja()).click();
    }
}
