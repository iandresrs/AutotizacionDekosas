package com.dekosas.Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ListasDesplegable {

    public void seleccionarTextoVisible(By elemento, String texto, WebDriver driver) {
        Select seleccionar = new Select(driver.findElement(elemento));
        seleccionar.selectByVisibleText(texto);
    }
}
