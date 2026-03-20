package org.example.repository;



import org.example.config.DBManager;
import org.example.model.Movie;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MovieRepositoryImpl {

    private Connection connection;

    public void createMovie(Movie movie) {
        String querySQLCreate = "INSERT INTO movies_terror(titulo, anio, rating, poster, sinopsis) VALUES(?, ?, ?, ?, ?)";


        try {
            connection = DBManager.initConnection();//conector a la BBDD
            //Statement statement = connection.createStatement(); //preparar la sentencia - Query
            //statement.executeUpdate(querySQLCreate);//ejecutar la sentencia

            PreparedStatement statement = connection.prepareStatement(querySQLCreate);
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
        public List<Movie> findAll() {
            //inicializar la variable
            List<Movie> movies = new ArrayList<>();

            String querySQLSelectAll = "SELECT * FROM movies_terror";

            try {
                connection = DBManager.initConnection();
                PreparedStatement statement = connection.prepareStatement(querySQLSelectAll);
                ResultSet response = statement.executeQuery();

                while (response.next()) {
                    String titulo = response.getString("titulo");
                    Integer anio = response.getInt("anio");
                    Double rating = response.getDouble("rating");
                    String poster = response.getString("poster");
                    String sinopsis = response.getString("sinopsis");

                    //instanciar-crear objeto
                    //movies.add(new Movie(titulo, anio, rating, poster, sinopsis));
                    Movie movie = new Movie(titulo, anio, rating, poster, sinopsis);
                    movies.add(movie);

                }

                System.out.println("Película creada");

            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            } finally {
                DBManager.closeConnection();
            }

            return movies;
        }

    }


