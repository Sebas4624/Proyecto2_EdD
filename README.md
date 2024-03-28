# Sistema de manejo de reservas e histórico de hotel

Este programa es un sistema que permite visualizar las reservas de clientes, los clientes que se encuentran hospedados en el hotel y el historial de clientes que posea una habitación.

# Descripición detallada

Este programa, desarrollado en Java, funciona mediante implementaciones de tablas de dispersión, árboles binarios de búsqueda y listas enlazadas. Estas tres implementaciones de estructuras de datos funcionan para almacenar y manejar los datos de los clientes; tanto las reservas como los estados de las habitaciones y los históricos de éstas funcionan mediante estas estructuras.

## Datos utilizados por el programa

Los datos que utiliza el programa tanto al iniciar el proceso de ejecución como al terminar su uso (cerrar el programa) son cargados y guardados en archivos "csv" (Comma Separated Values). Hay 4 archivos csv en total: Uno para las habitaciones del hotel, que contiene la información de cada una; otro para las reservas; otro para los estados de las habitaciones, es decir, los clientes actualmente hospedados actualmente en el hotel; y otro para el histórico de cada habitación, que registra los distintos clientes que se hayan alojado en una habitación en específico.

Al iniciar el programa, se cargan los datos automáticamente en las estructuras de datos respectivas, para luego ser modificados por el programa, dependiendo de las funciones que se utilicen. Al terminar de usar el programa, los datos son almacenados de nuevo en sus respectivos archivos, guardando todo cambio realizado hasta el momento.

## Funciones del programa

El programa ofrece 5 funciones para visualizar y manejar los datos de los clientes y las habitaciones.

### Estados de clientes

Permite visualizar los datos de los clientes que se hospedan actualmente en el hotel. Se debe introducir correctamente el nombre y el apellido del cliente hospedado actualmente. Al hacerlo y presionar 'Buscar', se muestra en un bloque de texto los datos generales del cliente, y en una línea de texto aparte la habitación en la que se encuentra actualmente.

### Búsqueda de reservación

Permite visualizar la información general de una reserva de un cliente. Se debe de introducir correctamente la cédula del cliente que hizo la reserva, generalmente en el formato 'XX.XXX.XXX'. Al presionar 'Buscar', se muestra en un bloque de texto la información completa de la reserva del cliente.

### Historial de habitación

Permite visualizar los distintos clientes que alguna vez se han hospedado en alguna habitación en concreto. Se deberá introducir correctamente el número de la habitación, las cuales van desde la número 1 hasta la número 300. Al presionar 'Buscar', se mostrará en una tabla (si hay registro de ello) los distintos clientes que alguna vez han estado en esa habitación.

### Check-In

Permite buscar la reserva de un cliente para poder asignarle una habitación disponible y, posteriormente, pasar su reserva a los estados de clientes.

Para hacer esto, primero se deberá introducir correctamente la cédula del cliente con su reserva activa, generalmente en el formato 'XX.XXX.XXX'. Al presionar 'Buscar', se mostrará en un bloque de texto los datos de la reserva, y aparte en una tabla se mostrarán las habitaciones que estén dentro del tipo de habitación especificado en la reserva de la persona.

Ejemplo: Si la reserva introducida establece que el tipo de habitación que busca el cliente es 'triple', en la tabla sólo se mostrarán las habitaciones que tengan como tipo de habitación 'triple'.

Además de esto, se habilitará el campo de texto 'Habitación'. Seguidamente se introducirá, preferiblemente, una habitación que encaje con el tipo de habitación de la reserva y que además esté disponible (de no estarlo, saltará una advertencia indicando que se seleccione otra habitación). Al presionar 'Asignar', la reserva se eliminará de la estructura de datos que la guarda y pasará a guardarse en la estructura de datos dedicada a los estados de clientes. Además de esto, se inhabilitará el campo 'Habitación'.

### Check-Out

Permite buscar un cliente actualmente hospedado para poder cerrar su hospedaje, liberar la habitación y añadirlo al histórico de la habitación.

Para hacer esto, primero se deberá introducir correctamente el nombre y el apellido del cliente actualmente hospedado. Al hacerlo y presionar 'Buscar', se muestra en un bloque de texto los datos generales del cliente, y en otro una confirmación para cerrar su hospedaje y liberar la habitación.

Seguidamente, si se procede a presionar 'Cerrar', el estado del cliente se eliminará de la estructura de datos que lo contenga, y pasará a guardarse en una estructura de datos dedicada a almacenar el histórico de las habitaciones. Además de esto, la habitación que ocupaba el cliente será liberada, por lo que puede ser utilizada nuevamente para registrar un nuevo hospedaje en esa habitación.
