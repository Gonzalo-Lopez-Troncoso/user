# Users

> ms creacion de usuarios.
ente por mas de un microservicio, incluyendo los de SPI y Sitio Privado de Seguros. La informacion asociada a Cards (tarjetas) es obtenida a traves de este.
> 
> ## Prerrequisitos 📋

Para poder compilar y ejecutar la aplicación necesitas lo siguiente:

```
- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)
```

### Ejecutar proyecto local

Existen diversas maneras de ejecutar una aplicación Spring boot desde tu máquina local. Una forma es ejecutando la clase principal desde tu IDE: `cl.consorcio.seguros.Application`

Por otro lado, puedes utilizar [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) para iniciar el proyecto con el siguiente comando:

```shell
mvn spring-boot:run

## Unitarias 🐛

Ejecutar el siguiente comando para inicializar la ejecución de test unitarios:

```shell
mvn test
```

## Instalación 🎉

## Compilación 🔧

Ejecutar el siguiente comando para compilar:

```shell
mvn clean
mvn install
```

A continuación se listan los endpoints para acceder
## Swagger 🎮 a la documentación Swagger del proyecto en los ambientes locales y pre productivos:

* **Microservicios API información siniestro**
    * HOST LOCAL:
    ````
    http://localhost:8080/swagger-ui/index.html## user
