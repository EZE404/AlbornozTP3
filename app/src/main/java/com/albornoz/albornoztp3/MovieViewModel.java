package com.albornoz.albornoztp3;

import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

public class MovieViewModel extends ViewModel {

    private List<Movie> movies;

    public MovieViewModel() {
        movies = new ArrayList<>();
        movies.add(new Movie(1,
                "Fight Club",
                "Un oficinista insomne y un fabricante de jabón " +
                        "despreocupado forman un club de lucha clandestino " +
                        "que se convierte en mucho más.",
                "Brad Pitt\nEdward Norton",
                "David Fincher",
                R.drawable.fight_club));
        movies.add(new Movie(2,
                "The Matrix",
                "Cuando un extraño lleva al pirata informático Neo a un " +
                        "inframundo prohibitivo, descubre la impactante verdad: " +
                        "la vida que conoce es el elaborado engaño de " +
                        "una realidad virtual.",
                "Keanu Reeves\nCarrie-Anne Moss\nLaurence Fishburne",
                "Lana Wachowski\nLilly Wachowski",
                R.drawable.the_matrix));
        movies.add(new Movie(3,
                "Alien",
                "Después de que un buque mercante espacial recibe una transmisión " +
                        "desconocida como una llamada de socorro, uno de los miembros de " +
                        "la tripulación es atacado por una forma de vida misteriosa y pronto " +
                        "se dan cuenta de que su ciclo de vida apenas ha comenzado.",
                "Sigourney Weaver\nIan Holm\nJohn Hurt",
                "Ridley Scott",
                R.drawable.alien));
        movies.add(new Movie(4,
                "In the Mouth of Madness",
                "Un investigador de seguros comienza a descubrir que el impacto que tienen " +
                        "los libros de un escritor de terror en sus fanáticos es más que inspirador.",
                "Sam Neil\nJulie Carmen",
                "John Carpenter",
                R.drawable.in_the_mouth_of_madness));
        movies.add(new Movie(5,
                "Blade Runner",
                "Un Blade Runner debe perseguir y acabar con cuatro replicantes que robaron una " +
                        "nave en el espacio y han regresado a la Tierra para encontrar a su creador.",
                "Harrison Ford\nRutger Hauer\nSean Young",
                "Ridley Scott",
                R.drawable.blade_runner));
        movies.add(new Movie(6,
                "Kill Bill VOLUME 1",
                "Después de despertar de un coma de cuatro años, un ex asesino se venga " +
                        "del equipo de asesinos que la traicionó.",
                "Uma Thruman\nDavid Carradine\nDaryl Hannah",
                "Quentin Tarantino",
                R.drawable.kill_bill));
        movies.add(new Movie(6,
                "They Live",
                "Influyen en nuestras decisiones sin que lo sepamos. Adormecen nuestros " +
                        "sentidos sin que lo sintamos. Controlan nuestras vidas sin que nos " +
                        "demos cuenta. Ellos viven.",
                "Roddy Piper\nKeith David\nMeg Foster",
                "John Carpenter",
                R.drawable.they_live));
        movies.add(new Movie(7,
                "The Lord of The Rings:\nThe Fellowship of the Ring",
                "Un humilde Hobbit de la Comarca y ocho compañeros emprenden un viaje para " +
                        "destruir el poderoso Anillo Único y salvar la Tierra Media " +
                        "del Señor Oscuro Sauron.",
                "Elijah Wood\nIan McKellen\nOrlando Bloom\nViggo Mortensen\nSean Bean\n" +
                        "Sean Astin\nBilly Boyd\nDominic Monaghan\nJohn Rhys-Davies",
                "Peter Jackson",
                R.drawable.the_lord_of_the_rings));
    }

    public List<Movie> getMovies() {
        if (movies == null) {
            movies = new ArrayList<>();
        }
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public Movie getById(int id) {
        Movie movie = null;
        for (Movie m: movies) {
            if (id == m.getId()) {
                movie = m;
            }
        }
        return movie;
    }
}