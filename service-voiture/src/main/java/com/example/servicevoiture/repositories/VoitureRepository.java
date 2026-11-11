package com.example.servicevoiture.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.servicevoiture.entities.Voiture;

public interface VoitureRepository
        extends JpaRepository<Voiture, Long> {
}