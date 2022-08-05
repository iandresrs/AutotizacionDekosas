package com.dekosas.PageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaDatosEnvioPageObject extends PageObject {
        By txtDireccion = By.xpath("//input[@name='street[0]']");
        By lstEstado = By.xpath("//select[@name='region_id']");
        By ltsCidudad = By.id("//input[@name='city']");
        By txtTelefono = By.xpath("//input[@name='telephone']");
        By lstTipoIdentidad = By.xpath("//select[@name='bss_custom_field[tipo_identidad]']");
        By txtNumeroIdentidad = By.xpath("//input[@name='bss_custom_field[cedula_o_nit]']");

    public By getTxtDireccion() {
        return txtDireccion;
    }

    public By getLstEstado() {
        return lstEstado;
    }

    public By getLtsCidudad() {
        return ltsCidudad;
    }

    public By getTxtTelefono() {
        return txtTelefono;
    }

    public By getLstTipoIdentidad() {
        return lstTipoIdentidad;
    }

    public By getTxtNumeroIdentidad() {
        return txtNumeroIdentidad;
    }
}
