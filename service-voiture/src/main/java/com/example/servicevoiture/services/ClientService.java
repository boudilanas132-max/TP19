package com.example.servicevoiture.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.servicevoiture.entities.Client;

@FeignClient(name = "SERVICE-CLIENT")
public interface ClientService {

    @GetMapping("/client/{id}")
    Client clientById(@PathVariable("id") Long id);
}