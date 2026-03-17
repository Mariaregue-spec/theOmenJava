package org.example;

import org.example.confing.DBManager;
import org.example.controller.MovieController;
import org.example.model.Movie;
import org.example.repository.MovieRepositoryImpl;

import java.sql.SQLException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() throws SQLException {

        //probar conexión a BBDD
       // DBManager.initConnection();
       // DBManager.closeConnection();



        //Movie movie1 = new Movie("Película de prueba", 2026, 6.5,"url", "descripción de la película de prueba");
        //movieRepository.createMovie(movie1);

        Movie movie2 = new Movie("Película de prueba 2", 2025, 8.5,"url", "descripción de la película de prueba 2");

        MovieRepositoryImpl movieRepository = new MovieRepositoryImpl();
        MovieController movieController = new MovieController(movieRepository);
        movieController.createMovieController(movie2);
    }

}
