package com.dekosas.PageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaCatalogoPageObject extends PageObject {
    By lblMensajeValidacionCatalogo = By.xpath("//div[text()='Toda la Tienda ']");

    By imgPrimerProducto = By.xpath("(//a[@href='https://dekosas.com/co/lampara-de-empotrar-en-piso-ref-7005a-gu10-iconica-home-gallery'])[1]");

    By imgSegundoProducto = By.xpath("(//a[@href='https://dekosas.com/co/lampara-colombia-cubi-x'])[1]");

    By imgTercerProducto = By.xpath("(//a[@href='https://dekosas.com/co/lampara-trompeta-dorado-5am'])[1]");

    By imgCuartoProducto = By.xpath("(//a[@href='https://dekosas.com/co/lampara-flozt-dks-lab'])[1]");
    public By getLblMensajeValidacionCatalogo() {
        return lblMensajeValidacionCatalogo;
    }

    public By getImgPrimerProducto() {
        return imgPrimerProducto;
    }

    public By getImgSegundoProducto() {
        return imgSegundoProducto;
    }

    public By getImgTercerProducto() {
        return imgTercerProducto;
    }

    public By getImgCuartoProducto() {
        return imgCuartoProducto;
    }
}
