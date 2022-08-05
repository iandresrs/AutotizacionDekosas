package com.dekosas.PageObjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://dekosas.com/co/")
public class PaginaPrincipalPageObject extends PageObject {
    By btnMiCuenta = By.xpath("//div[@class='porto-sicon-box mb-0 text-left style_1 default-icon']");

    public By getBtnMiCuenta() {
        return btnMiCuenta;
    }
}
