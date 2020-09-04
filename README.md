# Parcial 1

![Heroku](https://pyheroku-badge.herokuapp.com/?app=gentle-beyond-63920&style=flat)
[![CircleCI](https://circleci.com/gh/juancamilo399/Parcial-Arep1.svg?style=svg)](https://app.circleci.com/pipelines/github/juancamilo399/Parcial-Arep1)

Application deployed in heroku: [here](https://gentle-beyond-63920.herokuapp.com/)

## Requerimientos
1. Construir un servicio WEB (puede usar Spark o Sockets) que reciba una lista de números y retorne una estructura JSON con: La lista de números ordenada. Para probar, y para ver como el browser arma el query, puede usar una cadena puede enviarla en un solo campo con valores separados por comas. Ayuda: use un form html con un solo campo.
2. Usted debe implementar el ordenamiento por medio de bubble sort. Piense que este algoritmo se podría user para objetos de otro tipo.
3. Su diseño debe soportar la composición de nuevas operaciones sobre la lista para modificar servicios existentes o componer nuevos servicios. Por ejemplo, piense que en el futuro podemos solicitar que se creen nuevos servicios sobre la lista aumentando el API web, es decir,  debe ser fácilmente extensible.
4. Agregue una operaciónes para calcular la sumatoria  y el promedio de la lista y modifique su programa para que la estructura Json contenga estos valores.
5. El diseño del servidor debe tener en cuenta buenas prácticas de diseño OO.
6. Despliegue el servicio en Heroku.
7. Construya un cliente JAVA para probar el servicio en heroku.
8. El cliente y el servidor debe entregarlos en un proyecto estructurado con Maven.
9. El cliente debe traer "quemada" en el código fuente la url de su aplicación desplegada en Heroku.

## Getting Started

The following instructions will allow you to have a copy of the project and run it on your machine.

### Prerequisites

* [Maven](https://maven.apache.org/) - Dependency Management
* [Java 8](https://www.oracle.com/co/java/technologies/javase/javase-jdk8-downloads.html) -  Development Environment 
* [Git](https://git-scm.com/) - Version Control System
* [Spark](http://sparkjava.com/) - Micro framework for creating web applications in Java 8

### Installing

1. Clone the repository

```
git clone https://github.com/juancamilo399/Parcial-Arep1.git
```

2. Compile the projet

```
mvn package
```

3. Executing the program

```
mvn exec:java -D "exec.mainClass"="edu.escuelaing.arep.SparkWebApp"

In your browser: http://localhost:4567
```

To run locally you must change the url assigned to the post method since it is configured with heroku.

The documentation will be generated in target/site/apidocs/index.html.

## Documentation

View [Documentation](https://juancamilo399.github.io/Parcial-Arep1/apidocs/index.html)

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management
* [Spark](http://sparkjava.com/) - Micro framework for creating web applications in Java 8
* [Heroku](https://www.heroku.com/platform) - Deploy platform


## Author

* **Juan Camilo Angel Hernandez** 


## License

This project is under GNU General Public License - see the [LICENSE](LICENSE) file for details
