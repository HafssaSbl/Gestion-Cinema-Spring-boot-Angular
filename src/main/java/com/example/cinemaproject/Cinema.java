package com.example.cinemaproject;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Cinema implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double longtude,latitude,altitude;
    private int nombreSalles;
    @OneToMany(mappedBy = "cinema")
    private Collection<Salle> salles;
    @ManyToOne
    private Ville ville;

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getLongtude() {
        return longtude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getAltitude() {
        return altitude;
    }

    public int getNombreSalles() {
        return nombreSalles;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLongtude(double longtude) {
        this.longtude = longtude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public void setNombreSalles(int nombreSalles) {
        this.nombreSalles = nombreSalles;
    }
}
