package com.dekosas.PageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaCancelarCompra extends PageObject {
    By btnCajaCompra = By.xpath("//div[@class='minicart-wrapper cart-design-2']");
    By btnVerCarrito = By.xpath("//span[text()='View Cart']");

    By btnEliminarArticulo = By.xpath("//a[@class='action action-delete']");
    public By getBtnCajaCompra() {
        return btnCajaCompra;
    }

    public By getBtnVerCarrito() {
        return btnVerCarrito;
    }

    public By getBtnEliminarArticulo() {
        return btnEliminarArticulo;
    }
}
