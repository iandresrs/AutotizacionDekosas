package com.dekosas.Steps;

import com.dekosas.Models.EsperaImplicita;
import com.dekosas.PageObjects.PaginaCatalogoPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;



public class PaginaCatalogoStep {
    PaginaCatalogoPageObject paginaCatalogoPageObject = new PaginaCatalogoPageObject();
    EsperaImplicita esperaImplicita = new EsperaImplicita();
    @Step
    public void validarMensajeCatalogo(){
      Assert.assertThat(paginaCatalogoPageObject.getDriver().findElement(paginaCatalogoPageObject.getLblMensajeValidacionCatalogo()).isDisplayed(),Matchers.is(true));
    }

    @Step
    public void elegirPrimerProducto(){
        paginaCatalogoPageObject.getDriver().findElement(paginaCatalogoPageObject.getImgPrimerProducto()).click();
    }

    @Step
    public void elegirSegundoProducto(){
        esperaImplicita.EsperaImplicita(5);
        paginaCatalogoPageObject.getDriver().findElement(paginaCatalogoPageObject.getImgSegundoProducto()).click();
    }

    @Step
    public void elegirTercerProducto(){
        esperaImplicita.EsperaImplicita(5);
        paginaCatalogoPageObject.getDriver().findElement(paginaCatalogoPageObject.getImgTercerProducto()).click();
    }

    @Step
    public void elegirCuartoProducto(){
        esperaImplicita.EsperaImplicita(5);
        paginaCatalogoPageObject.getDriver().findElement(paginaCatalogoPageObject.getImgCuartoProducto()).click();
    }


}
