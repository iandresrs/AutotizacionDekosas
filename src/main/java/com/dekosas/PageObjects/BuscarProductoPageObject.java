package com.dekosas.PageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class BuscarProductoPageObject extends PageObject {
    By txtBuscar = By.id("search");

    By lblCategoria = By.xpath("//li/span[text()=' Lamparas']");



    public By getTxtBuscar() {
        return txtBuscar;
    }

    public By getLblCategoria() {
        return lblCategoria;
    }
}
