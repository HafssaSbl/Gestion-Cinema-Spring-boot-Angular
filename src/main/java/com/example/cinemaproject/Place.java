package com.example.cinemaproject;

import jakarta.persistence.*;
import org.hibernate.sql.ast.tree.expression.Collation;

import java.util.Collection;

@Entity
public class Place {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private int numero;
    private double longitude,latidude,altitude;
    @ManyToOne
    private Salle salle;
    @OneToMany(mappedBy = "place")
    private Collection<Ticket> ticket;

}
