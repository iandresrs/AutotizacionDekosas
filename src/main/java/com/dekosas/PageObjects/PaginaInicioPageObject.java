package com.dekosas.PageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicioPageObject extends PageObject {
    By msjValidacionLogin = By.xpath("//div/h3[text()='Bienvenido']");
    By txtBuscarCategoria = By.id("search");
    By lblseleccionCategoria = By.xpath("//li/span[text()=' Lamparas']");

    public By getMsjValidacionLogin() {
        return msjValidacionLogin;
    }

    public By getTxtBuscarCategoria() {
        return txtBuscarCategoria;
    }

    public By getLblseleccionCategoria() {
        return lblseleccionCategoria;
    }
}
