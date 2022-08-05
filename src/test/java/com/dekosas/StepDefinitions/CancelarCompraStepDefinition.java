package com.dekosas.StepDefinitions;


import com.dekosas.Steps.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class CancelarCompraStepDefinition {
    @Steps
    PaginaPrincipalStep paginaPrincipalStep;
    @Steps
    PaginaLoginStep paginaLoginStep;
    @Steps
    PaginaInicioStep paginaInicioStep;
    @Steps
    BuscarProductoStep buscarProductoStep;

    @Steps
    PaginaCatalogoStep paginaCatalogoStep;
    @Steps
    InformacionProductoStep informacionProductoStep;
    @Steps
    PaginaCarritoComprasStep paginaCarritoComprasStep;
    @Steps
    PaginaDatosEnvioStep paginaDatosEnvioStep;
    @Steps
    PaginaCancelarCompraStep paginaCancelarCompraStep;

    @Dado("^el usuario se encuentre en la pagina web$")
    public void el_usuario_se_encuentre_en_la_pagina_web() {
        paginaPrincipalStep.abrirPagina();
    }

    @Cuando("^el ingrese sus credenciales$")
    public void el_ingrese_sus_credenciales() throws IOException {
        paginaPrincipalStep.clickMiCuenta();
        paginaLoginStep.ingresarEmail();
        paginaLoginStep.ingresarClave();
        paginaLoginStep.clickIngresar();
    }

    @Dado("^el usuario visualice el mensaje de bienvenida$")
    public void el_usuario_visualice_el_mensaje_de_bienvenida() {
        paginaInicioStep.validarMensajeLogin();
    }

    @Cuando("^agregue los productos al carrito$")
    public void agregue_los_productos_al_carrito() throws IOException {
        buscarProductoStep.elegirCategoria();
        paginaCatalogoStep.validarMensajeCatalogo();
        paginaCatalogoStep.elegirPrimerProducto();
        informacionProductoStep.validarMensajeInformacionProducto();
        informacionProductoStep.agregarCarritoCompras();
        informacionProductoStep.clickBtnCarrito();
        paginaCarritoComprasStep.volverPaginaInicio();

        buscarProductoStep.elegirCategoria();
        paginaCatalogoStep.validarMensajeCatalogo();
        paginaCatalogoStep.elegirSegundoProducto();
        informacionProductoStep.validarMensajeInformacionProducto();
        informacionProductoStep.esperarCarga();
        paginaCarritoComprasStep.validarMensajeCarritoCompras();
        paginaCarritoComprasStep.volverPaginaInicio();

        buscarProductoStep.elegirCategoria();
        paginaCatalogoStep.validarMensajeCatalogo();
        paginaCatalogoStep.elegirTercerProducto();
        informacionProductoStep.validarMensajeInformacionProducto();
        informacionProductoStep.esperarCarga();
        paginaCarritoComprasStep.validarMensajeCarritoCompras();
        paginaCarritoComprasStep.volverPaginaInicio();

        buscarProductoStep.elegirCategoria();
        paginaCatalogoStep.validarMensajeCatalogo();
        paginaCatalogoStep.elegirCuartoProducto();
        informacionProductoStep.validarMensajeInformacionProducto();
        informacionProductoStep.esperarCarga();
        paginaCarritoComprasStep.validarMensajeCarritoCompras();
        paginaCarritoComprasStep.clickPasarCaja();
    }

    @Y("^llene el fomulario de envio$")
    public void llene_el_fomulario_de_envio() throws IOException {
        paginaDatosEnvioStep.ingresarDireccion();
        paginaDatosEnvioStep.seleccionarEstado();

        paginaDatosEnvioStep.ingresarTelefono();
        paginaDatosEnvioStep.seleccionarTipoIdentidad();
        paginaDatosEnvioStep.ingresarNumeroIndetidad();

    }

    @Entonces("^el usuario cancela la compra$")
    public void el_usuario_cancela_la_compra() {
        paginaCancelarCompraStep.clickVerAriticulos();
        paginaCancelarCompraStep.verCarrito();
        paginaCancelarCompraStep.eliminarProductos();
        paginaCarritoComprasStep.validarCarritoVacio();
    }
}
