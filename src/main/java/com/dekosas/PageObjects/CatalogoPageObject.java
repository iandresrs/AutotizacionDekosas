package com.dekosas.PageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class CatalogoPageObject extends PageObject {
    By mjsValidaCionCatalogo = By.className("amsearch-title");

    By imgProducto = By.xpath("(//a[@href='https://dekosas.com/co/lampara-de-empotrar-en-piso-ref-7005a-gu10-iconica-home-gallery'])[1]");

    By imgProductoDos = By.xpath("(//a[@href='https://dekosas.com/co/lampara-gato-revez'])[1]");

    By imgTercerProducto = By.xpath("(//a[@href='https://dekosas.com/co/lampara-trompeta-dorado-5am'])[1]");

    By imgCuartoProducto = By.xpath("(//a[@href='https://dekosas.com/co/lampara-flozt-dks-lab'])[1]");
    public By getMjsValidaCionCatalogo() {
        return mjsValidaCionCatalogo;
    }

    public By getImgProducto() {
        return imgProducto;
    }

    public By getImgProductoDos() {
        return imgProductoDos;
    }

    public By getImgTercerProducto() {
        return imgTercerProducto;
    }

    public By getImgCuartoProducto() {
        return imgCuartoProducto;
    }
}
