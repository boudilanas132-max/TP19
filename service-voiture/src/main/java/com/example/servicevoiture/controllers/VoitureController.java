package com.example.servicevoiture.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.servicevoiture.entities.Voiture;
import com.example.servicevoiture.repositories.VoitureRepository;

@RestController
public class VoitureController {

    private final VoitureRepository voitureRepository;

    public VoitureController(VoitureRepository voitureRepository) {
        this.voitureRepository = voitureRepository;
    }

    @GetMapping("/voitures")
    public List<Voiture> findAll() {
        return voitureRepository.findAll();
    }
}