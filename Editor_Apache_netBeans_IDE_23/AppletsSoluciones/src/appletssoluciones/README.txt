PROYECTO: Applets de Factura y Conversión de Días
Autor: Yeison Andrés Marroquín Bernal
Actividad: AA2-EV02 – Estudio de caso – Definir las variables necesarias para resolver el caso planteado utilizando applets con recepción de información de usuarios.

======================================
CONTENIDO DEL PROYECTO:
======================================

Este proyecto contiene dos applets desarrollados en Java:

1. AppletFactura.java
   - Permite generar una orden de compra para 3 productos.
   - El usuario debe ingresar:
     • Nombre del cliente
     • Nombre de los productos
     • Valor unitario
     • Cantidad por producto
   - Al oprimir el botón CALCULAR:
     • Muestra el valor total por producto
     • Muestra el valor total general de la compra
     • Genera un mensaje final con el nombre del cliente y total.

2. AppletDias.java
   - Permite convertir una cantidad de días a:
     • Horas
     • Minutos
     • Segundos
   - El usuario debe ingresar un número de días y oprimir CALCULAR.
   - Se muestran los resultados detallados junto con un mensaje resumen.

======================================
CÓMO EJECUTAR LOS APPLETS EN NETBEANS
======================================

Dado que las versiones modernas de Java ya no soportan ejecución de Applets en HTML, se han creado clases adicionales que permiten correrlos en ventanas (`JFrame`):

➤ Para ejecutar el applet de Factura:
   1. Abrir el archivo: `TestFactura.java`
   2. Clic derecho > Run File

➤ Para ejecutar el applet de Conversión de Días:
   1. Abrir el archivo: `TestDias.java`
   2. Clic derecho > Run File

Los applets se abrirán en ventanas con la interfaz gráfica solicitada.

======================================
ARCHIVOS INCLUIDOS EN LA ENTREGA
======================================

- AppletFactura.java
- AppletDias.java
- TestFactura.java
- TestDias.java
- AppletFactura.html (como evidencia)
- AppletDias.html (como evidencia)
- README.txt (instrucciones y reflexión)

======================================
REFLEXIÓN – IMPORTANCIA DE LAS VARIABLES Y OPERACIONES
======================================

● ¿Qué relevancia tienen las variables en Java?
   Las variables son fundamentales en todo programa, ya que permiten almacenar datos necesarios para los cálculos y la lógica del sistema. Son la base para que el software pueda procesar información del usuario y generar resultados correctos.

● ¿Por qué es importante la jerarquía de operadores?
   La jerarquía de operadores define el orden en que se ejecutan las operaciones dentro de una expresión. Respetarla es clave para que los cálculos se resuelvan correctamente, evitando errores de lógica y resultados inesperados.

======================================

Gracias por revisar este proyecto.
