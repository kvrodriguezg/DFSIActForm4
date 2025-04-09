package com.exp2_s5_katlheen_rodriguez.exp2_s5_katlheen_rodriguez.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exp2_s5_katlheen_rodriguez.exp2_s5_katlheen_rodriguez.model.Pelicula;
import com.exp2_s5_katlheen_rodriguez.exp2_s5_katlheen_rodriguez.repository.PeliculaRepository;

//Implementación de los metodos del servicio
@Service
public class PeliculaServiceImpl implements PeliculaService {

    @Autowired
    private PeliculaRepository peliculaRepository;

    //Obtener todas las peliculas
    @Override
    public List<Pelicula> getAllPeliculas() {
        List<Pelicula> peliculas = peliculaRepository.findAll();
        System.out.println("Consultando peliculas: " + peliculas);
        return peliculas;
    }

    //Obtener una pelicula por id
    @Override
    public Optional<Pelicula> getPeliculaById(Long id) {
        return peliculaRepository.findById(id);
    }

    //Crear una nueva pelicula
    @Override
    public Pelicula createPelicula(Pelicula pelicula) {
        return peliculaRepository.save(pelicula);
    }
}
