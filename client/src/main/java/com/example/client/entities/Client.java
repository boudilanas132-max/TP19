
package com.example.client.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;

    private float age;

    // Constructeur obligatoire pour Hibernate
    public Client() {
    }

    // Constructeur avec paramètres
    public Client(Long id,String nom, float age) {
    	this.id = id;
        this.nom = nom;
        this.age = age;
    }

    // Getters et Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }
}
