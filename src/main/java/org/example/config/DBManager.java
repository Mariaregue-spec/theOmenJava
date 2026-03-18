package org.example.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
private static final String URL = "jdbc:mysql://localhost:3306/the_omen";
private static final String USER = "root";
private static final String PASS = "root";

private static Connection connection;

public static Connection initConnection(){
    try {
        connection = DriverManager.getConnection(URL, USER, PASS);
        System.out.println("Conexión a la BBDD exitosa");
    } catch (SQLException exception) {
        System.out.println("Conexión DDBB fallida" + exception.getMessage());
    }
    return connection;
}

public static void closeConnection() {
    try {
        connection.close();
        System.out.println("Conexión cerrada con éxito");
    }catch (SQLException exception) {
        System.out.println("Error al cerrar BBDD" + exception.getMessage());
    }
}
}
