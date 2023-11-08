package com.example.cinemaproject;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Collection;

public class Categorie {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String name;
    @OneToMany(mappedBy = "categorie")
    private Collection<Film> film;

}
