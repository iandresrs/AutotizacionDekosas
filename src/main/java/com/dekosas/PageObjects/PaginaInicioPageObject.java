package com.dekosas.PageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicioPageObject extends PageObject {
    By msjValidacion = By.xpath("//p[text()='Mi Cuenta']");
    By btnVolverInicio = By.xpath("(//a[@href='https://dekosas.com/co/'])[1]");

    public By getMsjValidacion() {
        return msjValidacion;
    }

    public By getBtnVolverInicio() {
        return btnVolverInicio;
    }
}
