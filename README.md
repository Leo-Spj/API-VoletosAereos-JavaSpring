# API de Reserva de Vuelos

Este proyecto es una API RESTful desarrollada con Java Spring JPA para gestionar datos de reserva de vuelos, incluyendo pasajeros, aerolíneas, vuelos, segmentos y ubicaciones. La API utiliza Mapeo Objeto-Relacional (ORM) para interactuar con una base de datos relacional y utiliza clases genéricas para reutilización de código y diseño modular.

## Características Clave

- **Integración de Spring JPA**: Integración perfecta con la API de Persistencia de Java (JPA) y el framework Spring para una gestión robusta de la base de datos.
- **Modelado de Relación de Entidades**: Relaciones de entidad bien definidas para una organización y recuperación eficientes de datos.
- **Clases Genéricas**: Implementación de clases genéricas para promover la reutilización y mantenibilidad del código.
- **Endpoints de API RESTful**: Exponiendo datos a través de rutas de API bien definidas para el consumo y manipulación del cliente.
- **Escalabilidad**: Diseñado teniendo en cuenta la escalabilidad, permitiendo una fácil extensión e integración con otros sistemas.

## Tecnologías Utilizadas

- Java
- Framework Spring
- Spring JPA
- Hibernate (ORM)
- Principios de API RESTful


## Empezando

1. Clona el repositorio: `git clone https://github.com/Leo-Spj/API-VoletosAereos-JavaSpring.git`
2. Configura las propiedades de conexión a la base de datos en `application.properties`.
3. Construye el proyecto: `./mvnw clean install`
4. Ejecuta la aplicación: `./mvnw spring-boot:run`
5. Accede a los endpoints de la API (por ejemplo, `http://localhost:8080/api/vuelo`).

