package org.example;

import org.example.controller.MovieController;
import org.example.repository.MovieRepositoryImpl;
import org.example.view.MovieView;

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

        //Movie movie2 = new Movie("Película de prueba 2", 2025, 8.5,"url", "descripción de la película de prueba 2");

        MovieRepositoryImpl movieRepository = new MovieRepositoryImpl();//esto lo gestionará Springboot
        MovieController movieController = new MovieController(movieRepository);//esto lo gestionará Springboot
        //movieController.createMovieController(movie2);
        MovieView movieView = new MovieView(movieController);
        movieView.CreateMovieView();
    }

}
