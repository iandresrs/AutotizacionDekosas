#language: es
  Característica: Cancelar compra
    Antecedentes:
      Dado el usuario se encuentre en la pagina web
      Cuando el ingrese sus credenciales

      Escenario: Cancelar compra
        Dado el usuario visualice el mensaje de bienvenida
        Cuando agregue los productos al carrito
        Y llene el fomulario de envio
        Entonces el usuario cancela la compra