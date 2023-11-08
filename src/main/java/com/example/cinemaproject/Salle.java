package com.example.cinemaproject;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity @NoArgsConstructor @AllArgsConstructor
public class Salle {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int nombrePlace;
    @ManyToOne
    private Cinema cinema;
    @OneToMany(mappedBy = "salle")
    private Collection<Place> places;
    @OneToMany(mappedBy = "salle")
    private Collection<Projection> projections;

}
