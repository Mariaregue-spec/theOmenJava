# 🎬 The Omen Java — Movie Manager (MVC + JDBC + MySQL)

![Java](https://img.shields.io/badge/Java-17-blue)
![MySQL](https://img.shields.io/badge/MySQL-Database-orange)
![JDBC](https://img.shields.io/badge/JDBC-API-green)
![Architecture](https://img.shields.io/badge/Architecture-MVC-black)
![Status](https://img.shields.io/badge/status-finished-brightgreen)

## 📌 Overview

The Omen Java is a console-based backend application built in Java using MVC architecture.  
The project manages horror movies stored in a MySQL database using JDBC.

This project was developed to practice backend fundamentals including:

- Layered architecture
- Repository pattern
- JDBC database connection
- SQL queries
- Object-oriented programming
- Clean code structure

The application allows the user to create and retrieve movies from the database.

---

## 🧠 Architecture

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

### Patterns used

- MVC (Model View Controller)
- Repository / DAO
- POJO Model
- JDBC Connection Manager

---

## 🗄️ Database

Database name

```
the_omen
```

Table

```
movies_terror
```

SQL schema

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

Connection config

```java
private static final String URL = "jdbc:mysql://localhost:3306/the_omen";
private static final String USER = "root";
private static final String PASS = "root";
```

---

## ⚙️ Tech Stack

- Java 17
- Maven
- JDBC
- MySQL
- IntelliJ IDEA
- SQL
- MVC Pattern
- Repository Pattern

---

## ▶️ How to run

Clone repository

```bash
git clone https://github.com/Mariaregue-spec/theOmenJava.git
```

Create database

```
the_omen
```

Create table

```
movies_terror
```

Configure database credentials

```
config/DBManager.java
```

Run

```
Main.java
```

---

## 💻 Example execution

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

Output

```
Titulo : The Omen | Anio : 1976 | Rating : 8.0 | Poster : url | Sinopsis : Classic horror movie
```

---

## 📸 Screenshots

### Console execution

<img width="766" height="405" alt="Captura de pantalla 2026-03-23 090503" src="https://github.com/user-attachments/assets/5133300e-372e-4797-89f3-46a23a8c839d" />


### Database (MySQL)

<img width="960" height="503" alt="image" src="https://github.com/user-attachments/assets/befc70f2-9a64-48c1-8e9a-2cb4e1b7bac7" />


### Project structure (IntelliJ)

<img width="427" height="373" alt="Captura de pantalla 2026-03-23 084728" src="https://github.com/user-attachments/assets/f23ba363-2621-465a-8d8d-bca1b12f4967" />


### Code example

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

## 📚 Concepts demonstrated

- Object-Oriented Programming
- MVC architecture
- JDBC API
- PreparedStatement
- ResultSet
- SQL integration
- Repository pattern
- Layer separation
- Connection management

---

## 👩‍💻 Author

Maria Regue  

Backend Java practice project focused on clean architecture and database integration.
