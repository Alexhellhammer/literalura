![Logo de Mi Proyecto](https://github.com/Alexhellhammer/literalura/blob/main/img/logo_literalura.png?raw=true)




# LiterAlura - Catálogo de Libros

## Descripción
En este desafío de programación, desarrollaremos un catálogo de libros interactivo que se conecta a una API externa para buscar y mostrar información sobre libros y autores.

## Objetivo
Desarrollar un Catálogo de Libros que permita interacción textual vía consola con los usuarios, ofreciendo al menos 5 opciones de interacción.

## Funcionalidades
1. **Configuración del Ambiente Java**
   - Configurar el entorno de desarrollo Java para el proyecto.

2. **Creación del Proyecto**
   - Iniciar un nuevo proyecto Java y configurar las dependencias necesarias.

3. **Consumo de la API**
   - Implementar la lógica para consumir una API de libros específica.

4. **Análisis de la Respuesta JSON**
   - Procesar la respuesta JSON de la API para extraer la información relevante de los libros y autores.

5. **Inserción y consulta en la base de datos**
   - Integrar una base de datos para almacenar la información de los libros consultados.

6. **Exhibición de resultados a los usuarios**
   - Mostrar los resultados de búsqueda y opciones interactivas a los usuarios mediante la consola.

## Estructura del Proyecto
El proyecto se organizará de la siguiente manera:
LiterAlura/
│
├── src/
│ ├── main/
│ │ ├── java/
│ │ │ └── com/
│ │ │ └── proyectalex/
│ │ │ └── Literalura/
│ │ │ ├── api/
│ │ │ │ └── BookApiService.java
│ │ │ ├── database/
│ │ │ │ └── DatabaseConnector.java
│ │ │ ├── model/
│ │ │ │ └── Book.java
│ │ │ ├── service/
│ │ │ │ ├── BookService.java
│ │ │ │ └── ConsoleService.java
│ │ │ └── Main.java
│ │ └── resources/
│ │ └── application.properties
│ └── test/
│ └── java/
│ └── com/
│ └── proyectalex/
│ └── Literalura/
│ └── BookServiceTest.java
└── README.md

## Configuración del Ambiente Java
Asegúrate de tener instalado Java y Maven en tu entorno de desarrollo. Puedes configurar las variables de entorno según sea necesario.

## Consumo de la API
Utilizaremos una API externa para obtener información sobre libros y autores. Asegúrate de tener acceso a la documentación de la API y las credenciales necesarias.

## Instrucciones de Ejecución
1. Clona este repositorio en tu máquina local.
2. Configura las credenciales de la API en `application.properties`.
3. Ejecuta `Main.java` para iniciar la aplicación.

## Contribución
Siéntete libre de contribuir a este proyecto enviando pull requests o reportando problemas en la sección de Issues.

## Licencia
Este proyecto está bajo la Licencia MIT. Ver el archivo LICENSE para más detalles.
