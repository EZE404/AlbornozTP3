package com.albornoz.albornoztp3;

import java.util.List;

public class Movie {
    private int id;
    private String title;
    private String body;
    private String cast;
    private String director;
    private int idCover;

    public Movie(
            int id,
            String title,
            String body,
            String cast,
            String director,
            int idCover
    ) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.cast = cast;
        this.director = director;
        this.idCover = idCover;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getIdCover() {
        return idCover;
    }

    public void setIdCover(int idCover) {
        this.idCover = idCover;
    }
}
