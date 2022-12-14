package com.dekosas.PageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class InformacionProductoPageObject extends PageObject {

    By txtCantidadArticulo = By.id("qty");
    By btnAgregarCarrito = By.id("product-addtocart-button");

    public By getTxtCantidadArticulo() {
        return txtCantidadArticulo;
    }

    public By getBtnAgregarCarrito() {
        return btnAgregarCarrito;
    }
}
