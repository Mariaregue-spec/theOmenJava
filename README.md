# 🎬 The Omen Java — Gestor de Películas (MVC + JDBC + MySQL)

![Java](https://img.shields.io/badge/Java-17-blue)
![MySQL](https://img.shields.io/badge/MySQL-Database-orange)
![JDBC](https://img.shields.io/badge/JDBC-API-green)
![Arquitectura](https://img.shields.io/badge/Architecture-MVC-black)
![Estado](https://img.shields.io/badge/status-completed-brightgreen)

## 📌 Descripción

The Omen Java es una aplicación de consola desarrollada en Java siguiendo arquitectura MVC.  
El proyecto permite gestionar películas almacenadas en una base de datos MySQL usando JDBC.

Este proyecto se ha realizado para practicar conceptos fundamentales de backend:

- Arquitectura por capas
- Patrón Repository / DAO
- Conexión a base de datos con JDBC
- Consultas SQL
- Programación orientada a objetos
- Separación de responsabilidades
- Buenas prácticas en Java

La aplicación permite crear y consultar películas desde la consola.

---

## 🧠 Arquitectura

```
src/main/java/org/example

config
 └── DBManager

controller
 └── MovieController

model
 └── Movie

repository
 ├── MovieRepository
 └── MovieRepositoryImpl

view
 └── MovieView

Main
```

### Patrones utilizados

- MVC (Model View Controller)
- Repository / DAO
- POJO Model
- Gestor de conexión JDBC

---

## 🗄️ Base de datos

La aplicación utiliza MySQL para almacenar las películas.

Nombre de la base de datos

```
the_omen
```

Tabla

```
movies_terror
```

Script SQL

```sql
CREATE TABLE movies_terror (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(255),
    anio INT,
    rating DOUBLE,
    poster VARCHAR(500),
    sinopsis TEXT
);
```

Configuración de conexión

```java
private static final String URL = "jdbc:mysql://localhost:3306/the_omen";
private static final String USER = "root";
private static final String PASS = "root";
```

---

## ⚙️ Tecnologías usadas

- Java 17
- Maven
- JDBC
- MySQL
- IntelliJ IDEA
- SQL
- Patrón MVC
- Repository Pattern

---

## ▶️ Cómo ejecutar el proyecto

Clonar repositorio

```bash
git clone https://github.com/Mariaregue-spec/theOmenJava.git
```

Crear base de datos

```
the_omen
```

Crear tabla

```
movies_terror
```

Configurar credenciales en

```
config/DBManager.java
```

Ejecutar

```
Main.java
```

---

## 💻 Ejemplo de ejecución

```
Escriba el nombre de la película
The Omen

Poner imagen del poster
url

Descripción
Classic horror movie

Año
1976

Rating
8.0
```

Salida

```
Titulo : The Omen | Anio : 1976 | Rating : 8.0 | Poster : url | Sinopsis : Classic horror movie
```

---

## 📸 Capturas

### Ejecución por consola

![console](https://github.com/user-attachments/assets/5133300e-372e-4797-89f3-46a23a8c839d)

### Base de datos (MySQL Workbench)

![database](https://github.com/user-attachments/assets/befc70f2-9a64-48c1-8e9a-2cb4e1b7bac7)

### Estructura del proyecto (IntelliJ)

![structure](https://github.com/user-attachments/assets/f23ba363-2621-465a-8d8d-bca1b12f4967)

---

## 💻 Ejemplo de código

```java
public void createMovie(Movie movie) {

    String querySQLCreate =
        "INSERT INTO movies_terror(titulo, anio, rating, poster, sinopsis) VALUES(?, ?, ?, ?, ?)";

    try {

        connection = DBManager.initConnection();

        PreparedStatement statement =
                connection.prepareStatement(querySQLCreate);

        statement.setString(1, movie.getTitulo());
        statement.setInt(2, movie.getAnio());
        statement.setDouble(3, movie.getRating());
        statement.setString(4, movie.getPoster());
        statement.setString(5, movie.getSinopsis());

        statement.execute();

        System.out.println("Película creada");

    } catch (Exception exception) {
        System.out.println(exception.getMessage());
    }
}
```

---

## 📚 Conceptos aplicados

- Programación Orientada a Objetos
- Arquitectura MVC
- JDBC
- PreparedStatement
- ResultSet
- Integración con MySQL
- Repository Pattern
- Separación por capas
- Gestión de conexión a BBDD

---

## 👩‍💻 Autor

Maria Regue  

Proyecto práctico de backend en Java enfocado en arquitectura limpia y conexión a base de datos.
