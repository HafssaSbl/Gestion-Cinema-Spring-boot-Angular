package com.example.cinemaproject;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.sql.ast.tree.expression.Collation;

import java.util.Collection;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Film {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String titre;
private String description;
private String dateSortie;
private double duree;
private String photo;
@OneToMany(mappedBy = "film")
private Collection<Projection> projection;
@ManyToOne
private Categorie categorie;

}
