# RetoTEvolvers


Este proyecto da solución a dos puntos planteados en el reto de T-Evolvers, los cuales constan primero de una automatización a una API y el segundo a una automatización de una pagina web

#### Requisitos previos:

- Java y JDK (variables de entorno configuradas)
- variables de entorno configuradas
- Gradle
- IntelliJ IDEA

#### Clonar el proyecto:

Para clonar este repositorio se debe ejecutar el siguiente comando:


    git clone https://github.com/


### PRUEBA DE AUTOMATIZACIÓN API

### restful-booker
Es una API web de creación, lectura y actualización


#### Herramientas utilizadas:
La automatización de la API fue desarrollada utilizando el IDE de IntelliJ IDEA y herramientas como:

- **Gradle** - Gestor de dependencias
- **Cucumber** - Reportes
- **Gherkin** - Lenguaje DLS legible por el negocio (lenguaje específico de dominio legible por el negocio)
- **Java**

**Patrones de desarrollo:**

- Para el desarrollo de la automatización se utilizaron los siguientes patrones de desarrollo:

**Variables:** camelCase
**Funciones:** camelCase
**Paquetes:** camelCase
**Clases:** PascalCase

**Versionado:**
- Se utilizó Git para el control de versiones

### Ejecución del proyecto
escribir el comando gradle clean test

### PRUEBA DE AUTOMATIZACIÓN WEB:

### Advantage demo
Es una pagina que permite simular un carrito de compras

#### Herramientas utilizadas:
Esta automatización fue desarrollada en Google Chrome con el fin de ejecutar los procesos para la funcionalidad de búsqueda y agregado al carrito de compras, utilizando el IDE de IntelliJ IDEA y otras herramientas como:

- **BDD** - Estrategia de desarrollo
- **ScreenPlay** - Patrón de diseño
- **Gradle** - Gestor de dependencias
- **Cucumber** - Framework para automatizar pruebas BDD
- **Gherkin** - Lenguaje DLS legible por el negocio (lenguaje específico de dominio legible por el negocio)
- **Java**
- **Selenium Web Driver** - Herramienta para automatizar acciones en navegadores web
- **Serenity BDD** - Biblioteca de código abierto para la generación de reportes

**Patrones de desarrollo:**

- Para el desarrollo de la automatización se utilizaron los siguientes patrones de desarrollo:

**Variables:** camelCase
**Funciones:** camelCase
**Paquetes:** camelCase
**Clases:** PascalCase

**Versionado:**
- Se utilizó Git para el control de versiones


### Ejecución del proyecto

Para ejecutar el proyecto se debe abrir la terminal, posterior a esto de debe escribir:

    gradle clean build

Para ejecutar la prueba y generar el reporte:

    gradle clean build aggregate


o simplemente, clic derecho **"Run" (Ctrl+Shift+F10)** en la prueba que se desea ejecutar.
