# Proyecto-tienda-remo

## Guía

1. Clona el proyecto en local
    ```bash
    git clone https://github.com/alvaroLorente1/Proyecto-tienda-remo.git
    ```

## Motivación
Se desea implementar una aplicación que gestione los productos de una tienda, así como la gestion de los usuarios del sistema.

## Funcionamiento
- Un usuario accede a la aplicación y puede consultar la lista de productos de la tienda.

- Para ver los productos, no es necesario ser cliente, sin embargo, para poder realizar un pedido hay que acceder como cliente o como administrador.

- Desde la sesion de administrador puedes acceder a la gestion de los clientes, productos y categorías.
En la lista de productos se pueden añadir a una cesta y calcular el precio total de los productos añadidos, mostrándose en una tabla.



## Diagrama analisis
![diagrama del proyecto](diagrama/diagramaAnalisis.png)

## Diagrama diseño
![diagrama del proyecto](diagrama/diagramaDiseño.png)


## Arquitectura
Para implementar la aplicación, se ha decidido dividir las funcionalidades en los siguientes servicios:

 **Servicio de gestión de usuario**  
Es el encargado de gestionar toda la lógica relacionada con los usuarios del sistema, que podrán ser los siguientes:

- Visitante: usuarios que acceden a la página web para obtener información sobre los servicios ofrecidos. No están autenticados.
Puede registrarse en el sistema como cliente.
Puede ver la lista de productos.
- Cliente: representa al usuario que se autentica en el sistema.
Habrá que indicar su direccion, número de tarjeta y telefono
Puede modificar su perfil de usuario pero no puede eliminarlo.
Puede ver la lista de productos de la tienda.

- Administrador: es un tipo de usuario que representa al administrador del sistema o gestor de la empresa que utiliza la aplicación.Puede hacer lo mismo que un cliente y además:
Crear o modificar clientes.
Eliminar clientes.
Crear, editar o eliminar productos de la tienda.
Crear, editar o eliminar categorías


 **Gestión de productos**  
- Cada producto incluye la informacion detallada de cada uno así como su nombre, descripcion, precio, imagen y su identificador.
- Los productos estarán separados por categoría.

**Gestión de categorias** 
- El administrador puede añadir, eliminar o modificar una categoría.
- Las categorías que podemos encontrar son : Barcos, componentes, o ropa deportiva.


