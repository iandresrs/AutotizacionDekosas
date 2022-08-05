package com.dekosas.PageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaCarritoComprasPageObject extends PageObject {
    By msjValidacionCarritoCompras = By.xpath("//span[text()='Carrito de Compras']");
    By lnkInicio = By.className("logo");

    By btnPasarCaja = By.xpath("//button/span[text()='Pasar por caja']");

    By lblValidarCarritoVacio = By.xpath("//p[text()='No tienes ningún artículo en tu carrito de compras.']");
    public By getMsjValidacionCarritoCompras() {
        return msjValidacionCarritoCompras;
    }

    public By getLnkInicio() {
        return lnkInicio;
    }

    public By getBtnPasarCaja() {
        return btnPasarCaja;
    }

    public By getLblValidarCarritoVacio() {
        return lblValidarCarritoVacio;
    }
}
