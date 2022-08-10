package com.dekosas.PageObjects;

import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPageObject extends PageObject {
    By txtEmail = By.id("social_login_email");
    By txtClave = By.id("social_login_pass");
    By btnEntrar = By.id("bnt-social-login-authentication");

    public By getTxtEmail() {
        return txtEmail;
    }

    public By getTxtClave() {
        return txtClave;
    }

    public By getBtnEntrar() {
        return btnEntrar;
    }
}
