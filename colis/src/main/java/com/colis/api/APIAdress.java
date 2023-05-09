package com.colis.api;


import com.colis.model.Adresse;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public interface APIAdress {
    @PostMapping(value =  "/create",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    Adresse save(@RequestBody Adresse dto);
    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    Optional<Adresse> finById(@PathVariable Long id);
    @GetMapping(value = "/all",produces = MediaType.APPLICATION_JSON_VALUE)
    List<Adresse> findAll();
    @DeleteMapping("/delete/{id}")
    void  delete(@PathVariable Long id);
}
