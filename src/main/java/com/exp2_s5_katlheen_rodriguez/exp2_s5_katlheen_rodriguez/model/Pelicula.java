package com.exp2_s5_katlheen_rodriguez.exp2_s5_katlheen_rodriguez.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.persistence.*;

@Entity
@Table(name = "pelicula")
//Orden de salida en json
@JsonPropertyOrder({ "id", "titulo", "año", "director", "genero", "sinopsis"})
public class Pelicula {

    //Atributos con su respectivo detalle para la construccion de columnas
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(nullable = false, length = 150, name = "titulo")
    private String titulo;

    @JsonProperty("año") //Cambiar nombre a "año" en el JSON
    @Column(name = "anio", nullable = false)
    private int anio;

    @Column(nullable = false, length = 100, name = "director")
    private String director;

    @Column(nullable = false, length = 50, name = "genero")
    private String genero;

    @Column(nullable = false, name = "sinopsis")
    private String sinopsis;

    //Constructores
    public Pelicula() {
    }

    public Pelicula(String titulo, int anio, String director, String genero, String sinopsis) {
        this.titulo = titulo;
        this.anio = anio;
        this.director = director;
        this.genero = genero;
        this.sinopsis = sinopsis;
    }

    //Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}
