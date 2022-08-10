package com.dekosas.StepDefinitions;

import com.dekosas.Step.LoginStep;
import com.dekosas.Step.PaginaInicioStep;
import com.dekosas.Step.PaginaPrincipalStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class LoginStepDefinition {
    @Steps
    PaginaPrincipalStep paginaPrincipalStep;
    @Steps
    LoginStep loginStep;
    @Steps
    PaginaInicioStep paginaInicioStep;

    @Dado("^el usuario se encuentre en la pagina web$")
    public void el_usuario_se_encuentre_en_la_pagina_web() {
        paginaPrincipalStep.abrirPagina();
    }


    @Cuando("^el usuario ingreses sus credenciales$")
    public void el_usuario_ingreses_sus_credenciales() throws IOException {
        paginaPrincipalStep.clickMicuenta();
        loginStep.inicioSesion();
    }

    @Entonces("^el usuario visualice el mensaje de bienvenida$")
    public void el_usuario_visualice_el_mensaje_de_bienvenida() {
        paginaInicioStep.validacionLogin();
    }


}
