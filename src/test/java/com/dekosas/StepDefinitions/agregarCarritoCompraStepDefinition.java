package com.dekosas.StepDefinitions;

import com.dekosas.Step.CarritoCompraStep;
import com.dekosas.Step.CatalogoStep;
import com.dekosas.Step.InformacionCarritoStep;
import com.dekosas.Step.PaginaInicioStep;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;

public class agregarCarritoCompraStepDefinition {
    @Steps
    PaginaInicioStep paginaInicioStep;
    @Steps
    CatalogoStep catalogoStep;
    @Steps
    InformacionCarritoStep informacionCarritoStep;
    @Steps
    CarritoCompraStep carritoCompraStep;

    @Dado("^el usuario visualice el mensaje$")
    public void elUsuarioVisualiceElMensaje() {
       paginaInicioStep.validacionLogin();
    }
    @Cuando("^el usuario seleecione el producto$")
    public void el_usuario_seleecione_el_producto() throws IOException {
        paginaInicioStep.elegirCategoria();
        catalogoStep.ElegirProducto();
        informacionCarritoStep.cantidadArticulo();
    }

    @Entonces("^el usuario agregara el prodcuto al carrito de compra$")
    public void el_usuario_agregara_el_prodcuto_al_carrito_de_compra() {
        informacionCarritoStep.agregarCarritoCompras();
        carritoCompraStep.verificarCarritoCompra();
    }

}
