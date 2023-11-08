package com.example.cinemaproject;

import jakarta.persistence.*;

import java.util.Collection;
@Entity
public class Ville {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double longitude,latidude,altitude;
    @OneToMany(mappedBy = "ville")
    private Collection<Cinema> cinema;

}
