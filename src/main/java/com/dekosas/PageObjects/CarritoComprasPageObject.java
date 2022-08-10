package com.dekosas.PageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CarritoComprasPageObject extends PageObject {
    By lblVerificarCarritoCompra = By.xpath("//span[text()='Carrito de Compras']");

    By btnEliminarProducto = By.xpath("//a[@class='action action-delete']");
    By msjValidacionCarritoVacio = By.xpath("//p[text()='No tienes ningún artículo en tu carrito de compras.']");

    By btnPasarCaja = By.xpath("//button/span[text()='Pasar por caja']");
    public By getLblVerificarCarritoCompra() {
        return lblVerificarCarritoCompra;
    }

    public By getBtnEliminarProducto() {
        return btnEliminarProducto;
    }

    public By getMsjValidacionCarritoVacio() {
        return msjValidacionCarritoVacio;
    }

    public By getBtnPasarCaja() {
        return btnPasarCaja;
    }
}
