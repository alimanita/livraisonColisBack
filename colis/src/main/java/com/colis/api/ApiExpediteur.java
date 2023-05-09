package com.colis.api;


import com.colis.model.Expediteur;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public interface ApiExpediteur {
    @PostMapping(value =  "/create",consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    Expediteur save(@RequestBody Expediteur expediteur);
    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    Optional<Expediteur> finById(@PathVariable  Long id);
    @GetMapping(value = "/all",produces = MediaType.APPLICATION_JSON_VALUE)
    List<Expediteur> findAll();
    @DeleteMapping("/delete/{id}")
    void  delete(@PathVariable Long id);
}
