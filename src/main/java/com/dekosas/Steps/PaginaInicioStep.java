package com.dekosas.Steps;

import com.dekosas.PageObjects.PaginaInicioPageObject;
import net.thucydides.core.annotations.Step;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class PaginaInicioStep {
    PaginaInicioPageObject paginaInicioPageObject = new PaginaInicioPageObject();
    @Step
    public void validarMensajeLogin(){
        Assert.assertThat(paginaInicioPageObject.getDriver().findElement(
                paginaInicioPageObject.getMsjValidacion()).isDisplayed(), Matchers.is(true));
    }

}
