package com.dekosas.StepDefinitions;

import com.dekosas.Step.*;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class CancelarCompraStepDefinition {
    @Steps
    PaginaInicioStep paginaInicioStep;
    @Steps
    CatalogoStep catalogoStep;
    @Steps
    InformacionCarritoStep informacionCarritoStep;
    @Steps
    CarritoCompraStep carritoCompraStep;
    @Steps
    PaginaFormularioStep paginaFormularioStep;

    @Dado("^el usuario seleecione el producto deseado$")
    public void el_usuario_seleecione_el_producto_deseado() throws IOException {
        paginaInicioStep.elegirCategoria();
        catalogoStep.seleccionarSegundoProducto();
        informacionCarritoStep.agregarCarritoCompras();

        paginaInicioStep.elegirCategoria();
        catalogoStep.seleccionarTercerProducto();
        informacionCarritoStep.agregarCarritoCompras();

        paginaInicioStep.elegirCategoria();
        catalogoStep.seleccionarCuartoProducto();
        informacionCarritoStep.agregarCarritoCompras();
    }
    @Cuando("^el usuario pase por la caja$")
    public void el_usuario_pase_por_la_caja() {
        carritoCompraStep.pasarCaja();
    }
    @Y("^llene llene el formulario de envio$")
    public void llene_llene_el_formulario_de_envio() throws IOException {
        paginaFormularioStep.LlenarFormulario();
        paginaFormularioStep.irCarritoCompras();
    }
    @Entonces("^el usuario eliminara la compra$")
    public void el_usuario_eliminara_la_compra() {
        carritoCompraStep.verificarCarritoVacio();
    }
}
