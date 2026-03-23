# 🎬 THE OMEN JAVA

![Java](https://img.shields.io/badge/Java-17-red)
![MySQL](https://img.shields.io/badge/MySQL-Database-black)
![MVC](https://img.shields.io/badge/Architecture-MVC-darkred)
![JDBC](https://img.shields.io/badge/JDBC-Enabled-darkgreen)
![Status](https://img.shields.io/badge/status-completed-bloodred)

> Horror movie manager built with Java, JDBC and MySQL  
> Inspired by dark movie databases and console backends

---

## 🩸 About the project

**The Omen Java** is a console application that allows you to manage horror movies stored in a MySQL database.

The project was created to practice:

- MVC architecture
- Repository pattern
- JDBC connection
- SQL queries
- Clean code structure
- Java backend fundamentals

The application lets you create and list movies from the console.

---

## 🎥 Preview

## 📸 Screenshots

### Console

![Console](images/consola.png)

### Database

![Database](images/db.png)

### Project structure

![Structure](images/estructura.png)

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

Patterns used:

- MVC
- Repository
- DAO
- POJO
- JDBC connection manager

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

SQL

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
jdbc:mysql://localhost:3306/the_omen
```

---

## ⚙️ Technologies

- Java 17
- Maven
- JDBC
- MySQL
- IntelliJ IDEA
- MVC Pattern
- Repository Pattern
- SQL

---

## ▶️ Run project

Clone repo

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

Edit

```
DBManager.java
```

Run

```
Main.java
```

---

## 💻 Example

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

## ☠ Concepts used

- Object Oriented Programming
- MVC
- JDBC
- PreparedStatement
- ResultSet
- Repository pattern
- SQL connection
- Layered architecture

---

## 👩‍💻 Author

Maria Regue

Java backend practice project
