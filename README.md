# Actividad-5.5.-Diagrama-de-clases-y-generaci-n-de-c-digo-Pedidos

# Sistema de Gestión de Pedidos

Este es un sistema de gestión de pedidos que permite registrar productos, realizar pedidos, gestionar formas de pago y actualizar el stock de productos. El sistema está diseñado utilizando principios de la programación orientada a objetos en Kotlin.

## Clases y Relaciones

### Clases `PagoTarjeta`, `PagoEfectivo`, y `PagoCheque`

Estas clases son subclases de la clase abstracta `FormaPago`. Representan diferentes tipos de pago, pero comparten una interfaz común. Cada clase implementa el método `registrarPago` de manera específica para cada tipo de pago, permitiendo que el sistema maneje pagos con tarjeta, en efectivo y por cheque de manera uniforme.

- **`PagoTarjeta`**: Representa un pago realizado con tarjeta de crédito/débito, e incluye información como el número de tarjeta, fecha de caducidad y tipo de tarjeta.
- **`PagoEfectivo`**: Representa un pago realizado en efectivo, e incluye el tipo de moneda con la que se paga.
- **`PagoCheque`**: Representa un pago realizado mediante cheque, e incluye el nombre del titular del cheque y el banco.

### Relación de Agregación entre `Pedido` y `Producto`

Un `Pedido` contiene varios `Producto`s, lo que indica una relación de **agregación**. La agregación es una relación en la que un objeto (en este caso, un pedido) puede contener otros objetos (productos), pero estos objetos pueden existir independientemente del objeto que los contiene.

- **Pedido**: Una clase que representa un pedido realizado por un cliente. Un pedido puede tener múltiples productos.
- **Producto**: Representa un artículo que se vende en el sistema. Los productos contienen detalles como nombre, precio, impuestos y stock.

### Diagrama UML

A continuación, se muestra un ejemplo del diagrama UML que ilustra las relaciones entre las clases en el sistema.

![Diagrama UML](images\Dgrama.png)

## Herramienta Utilizada para Crear el Diagrama UML

### **Herramienta: draw.io**

- **Descripción**: Utilicé [DIA: Diagrama](http://dia-installer.de/index.html.es) para crear el diagrama UML. DIA es una herramienta gratuita y accesible para descargar en linea que permite crear diagramas de clases, diagramas de actividades, diagramas de flujo, entre otros. 
- **Ventajas**: 
  - Es fácil de usar y requiere instalación.
  - Permite compartir y exportar diagramas (.DIA y Creo que en imagenes.).
  - Ofrece una interfaz visual y sencilla, ideal para crear diagramas UML rápidamente.


Elegí **DIA: diagrama** debido a que ya estoy acostumbrado a usarlo ademas ofrece facilidad de uso y la posibilidad de trabajar de manera completamente gratuita.

## Instrucciones para Ejecutar el Proyecto

1. Clona este repositorio a tu máquina local.
2. Abre el proyecto en un entorno de desarrollo compatible con Kotlin (como IntelliJ IDEA).
3. Compila y ejecuta el proyecto.
4. Puedes modificar las clases o agregar nuevas funcionalidades según tus necesidades.

## Contribuciones

- NULL

## Licencia

Este proyecto está bajo la licencia MIT. Puedes ver más detalles en el archivo LICENSE.

