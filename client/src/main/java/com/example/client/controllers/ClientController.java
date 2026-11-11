
package com.example.client.controllers;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.client.entities.Client;
import com.example.client.repositories.ClientRepository;

@RestController
public class ClientController {

    private final ClientRepository clientRepository;

    public ClientController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    // Récupérer tous les clients
    @GetMapping("/clients")
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    // Rechercher un client par son identifiant
    @GetMapping("/client/{id}")
    public ResponseEntity<Client> findById(
            @PathVariable Long id) {

        return clientRepository.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() ->
                    ResponseEntity.status(HttpStatus.NOT_FOUND).build()
                );
    }
}