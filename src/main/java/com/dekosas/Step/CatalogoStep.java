package com.dekosas.Step;

import com.dekosas.PageObjects.CatalogoPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class CatalogoStep {
    CatalogoPageObject catalogoPageObject = new CatalogoPageObject();
    @Step
    public void validacionCatalogo(){
        Assert.assertThat(catalogoPageObject.getDriver().findElement(
                catalogoPageObject.getMjsValidaCionCatalogo()
        ).isDisplayed(), Matchers.is(true));
    }
    @Step
    public void seleccionarProducto(){
        catalogoPageObject.getDriver().findElement(catalogoPageObject.getImgProducto()).click();
    }
    @Step
    public void seleccionarSegundoProducto(){
        catalogoPageObject.getDriver().findElement(catalogoPageObject.getImgProductoDos()).click();
    }
    @Step
    public void seleccionarTercerProducto(){
        catalogoPageObject.getDriver().findElement(catalogoPageObject.getImgTercerProducto()).click();
    }
    @Step
    public void seleccionarCuartoProducto(){
        catalogoPageObject.getDriver().findElement(catalogoPageObject.getImgCuartoProducto()).click();
    }
    @Step
    public void ElegirProducto(){
        validacionCatalogo();
        seleccionarProducto();
    }
}
